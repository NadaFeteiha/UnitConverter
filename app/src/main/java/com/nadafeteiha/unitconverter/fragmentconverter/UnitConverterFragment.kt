package com.nadafeteiha.unitconverter.fragmentconverter

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nadafeteiha.unitconverter.R
import com.nadafeteiha.unitconverter.category.Categories
import com.nadafeteiha.unitconverter.category.CategoryAdapter
import com.nadafeteiha.unitconverter.databinding.FragmentTemperatureBinding
import com.nadafeteiha.unitconverter.model.*
import com.nadafeteiha.unitconverter.unititem.ConverterAdapter
import com.nadafeteiha.unitconverter.unititem.UnitItem
import com.nadafeteiha.unitconverter.utility.Constants

class UnitConverterFragment : Fragment() {
    private lateinit var binding: FragmentTemperatureBinding
    private var amount = 0.0
    private var selectedFromMass = ""
    private var selectedToMass = ""
    private lateinit var unitConverter: UnitConverter
    private val items: Map<String, String> by lazy { unitConverter.getUnits() }
    private lateinit var converterAdapter: ConverterAdapter
    private var unitList: MutableList<UnitItem> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTemperatureBinding.inflate(inflater, container, false)
        val categoryName = UnitConverterFragmentArgs.fromBundle(requireArguments()).categoryName
        setData(categoryName)
        setupRecyclerView()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()
    }

    private fun setupRecyclerView() {
        binding.rvconverter.layoutManager = GridLayoutManager(context, 1)
        binding.rvconverter.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            )
        )
        converterAdapter = ConverterAdapter(unitList)
        binding.rvconverter.adapter = converterAdapter
    }

    private fun setData(category: Int) {
        when (category) {
            Constants.TEMP_CONVERTER -> {
                unitConverter = TempConverter()
                binding.tfAmount.hint = resources.getString(R.string.temperature)
            }
            Constants.LENGTH_CONVERTER -> {
                unitConverter = LengthConverter()
                binding.tfAmount.hint = resources.getString(R.string.length)
            }
            Constants.AREA_CONVERTER -> {
                unitConverter = AreaConverter()
                binding.tfAmount.hint = resources.getString(R.string.area)
            }
            Constants.TIME_CONVERTER -> {
                unitConverter = TimeConverter()
                binding.tfAmount.hint = resources.getString(R.string.time)
            }
            Constants.WEIGHT_CONVERTER -> {
                unitConverter = MassConverter()
                binding.tfAmount.hint = resources.getString(R.string.weight)
            }
            Constants.FREQUENCY -> {
                unitConverter = FrequencyConverter()
                binding.tfAmount.hint = resources.getString(R.string.frequency)
            }
        }

        val adapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            items.map { it.key })
        binding.from.setAdapter(adapter)
        binding.to.setAdapter(adapter)
    }

    private fun setListeners() {
        binding.amount.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                calculate()
            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                calculate()
            }
        })


        binding.from.setOnItemClickListener { parent, _, position, _ ->
            selectedFromMass = parent.getItemAtPosition(position) as String
            calculate()
        }

        binding.to.setOnItemClickListener { parent, _, position, _ ->
            selectedToMass = parent.getItemAtPosition(position) as String
            if (selectedToMass.contains("Square", true)) {
                binding.power.text = "2"
            } else {
                binding.power.text = ""
            }
            calculate()
        }
    }

    private fun calculate() {
        binding.unit.text = items[selectedToMass]
        amount = binding.amount.text.toString().toDoubleOrNull() ?: 0.0

        if (selectedFromMass.isNotBlank() && selectedToMass.isNotBlank()) {
            if (selectedFromMass == selectedToMass) {
                binding.result.text = "$amount"
            } else
                binding.result.text =
                    unitConverter.converter(amount, selectedFromMass, selectedToMass)
        } else {
            binding.result.text = "0.0"
        }

        if (amount != 0.0 && selectedFromMass.isNotBlank()) {
            updateConverterList()
        }
    }

    private fun updateConverterList() {
        unitList.clear()
        for (entry in unitConverter.getUnits()) {
            if (entry.key != selectedFromMass && entry.key != selectedToMass) {
                val result =
                    unitConverter.converter(amount, selectedFromMass, entry.key) +
                            " " + entry.value
                unitList.add(UnitItem(entry.key, result))
            }
        }
        converterAdapter.notifyDataSetChanged()
        binding.rvconverter.adapter = converterAdapter
    }
}