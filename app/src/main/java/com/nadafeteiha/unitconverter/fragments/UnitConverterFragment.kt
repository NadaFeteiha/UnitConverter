package com.nadafeteiha.unitconverter.fragments

import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadafeteiha.unitconverter.R
import com.nadafeteiha.unitconverter.databinding.FragmentTemperatureBinding
import com.nadafeteiha.unitconverter.model.*
import com.nadafeteiha.unitconverter.unititem.ConverterAdapter
import com.nadafeteiha.unitconverter.unititem.UnitItem
import com.nadafeteiha.unitconverter.utility.Constants
import com.nadafeteiha.unitconverter.utility.hideKeyboard

class UnitConverterFragment : Fragment() {
    private lateinit var binding: FragmentTemperatureBinding
    private var amount = 0.0
    private var selectedFromUnit = ""
    private var selectedToUnit = ""
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
        setAdapterUnits()
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
            Constants.SPEED -> {
                unitConverter = SpeedConverter()
                binding.tfAmount.hint = resources.getString(R.string.speed)
            }
            Constants.FUEL -> {
                unitConverter = FuelConverter()
                binding.tfAmount.hint = resources.getString(R.string.fuel)
            }
            Constants.DIGITAL_STORAGE -> {
                unitConverter = DigitalStorageConverter()
                binding.tfAmount.hint = resources.getString(R.string.digital_storage)
            }
        }

        if (category== Constants.TEMP_CONVERTER){
            binding.amount.inputType =
                InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL or InputType.TYPE_NUMBER_FLAG_SIGNED
        }else{
            binding.amount.inputType =
                InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL
        }
    }

    private fun setAdapterUnits() {
        val adapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            items.map { it.key })
        binding.from.setAdapter(adapter)
        binding.to.setAdapter(adapter)
    }

    private fun setListeners() {
        binding.amount.setOnFocusChangeListener { view, b ->
            this.hideKeyboard()
        }

        binding.btnSwitch.setOnClickListener {
            if (!selectedFromUnit.isNullOrEmpty()
                && !selectedToUnit.isNullOrEmpty()
            ) {
                val temp = selectedFromUnit
                selectedFromUnit = selectedToUnit
                selectedToUnit = temp

                binding.to.setText(selectedToUnit)
                binding.to.dismissDropDown()
                binding.from.setText(selectedFromUnit)
                binding.from.dismissDropDown()


                setAdapterUnits()

                if (amount != 0.0)
                    calculate()
            }
        }

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
            selectedFromUnit = parent.getItemAtPosition(position) as String
            calculate()
        }

        binding.to.setOnItemClickListener { parent, _, position, _ ->
            selectedToUnit = parent.getItemAtPosition(position) as String
            if (selectedToUnit.contains("Square", true)) {
                binding.power.text = "2"
            } else {
                binding.power.text = ""
            }
            calculate()
        }
    }

    private fun calculate() {
        binding.unit.text = items[selectedToUnit]
        amount = binding.amount.text.toString().toDoubleOrNull() ?: 0.0

        if (selectedFromUnit.isNotBlank() && selectedToUnit.isNotBlank()) {
            if (selectedFromUnit == selectedToUnit) {
                binding.result.text = "$amount"
            } else
                binding.result.text =
                    unitConverter.converter(amount, selectedFromUnit, selectedToUnit)
        } else {
            binding.result.text = "0.0"
        }

        if (amount != 0.0 && selectedFromUnit.isNotBlank()) {
            updateConverterList()
        }
    }

    private fun updateConverterList() {
        unitList.clear()
        for (entry in unitConverter.getUnits()) {
            if (entry.key != selectedFromUnit && entry.key != selectedToUnit) {
                val result =
                    unitConverter.converter(amount, selectedFromUnit, entry.key) +
                            " " + entry.value
                unitList.add(UnitItem(entry.key, result))
            }
        }
        converterAdapter.notifyDataSetChanged()
        binding.rvconverter.adapter = converterAdapter
    }
}