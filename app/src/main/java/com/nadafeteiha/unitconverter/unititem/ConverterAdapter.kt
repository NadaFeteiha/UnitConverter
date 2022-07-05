package com.nadafeteiha.unitconverter.unititem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nadafeteiha.unitconverter.databinding.UnitConverterItemBinding
import com.nadafeteiha.unitconverter.utility.roundDecimals

class ConverterAdapter(private var unitList: List<UnitItem>) :
    RecyclerView.Adapter<ConverterAdapter.ConverterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConverterViewHolder {
        return ConverterViewHolder(UnitConverterItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ConverterViewHolder, position: Int) {
        val category = unitList[position]
        holder.setData(category)
    }

    override fun getItemCount(): Int = unitList.size

    inner class ConverterViewHolder(private val binding: UnitConverterItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setData(item: UnitItem) {
            binding.itemUnitTitle.text = item.title
            binding.itemResult.text = item.result.roundDecimals()

            if (item.title.contains("square", true))
                binding.itemPow.text = "2"
            else
                binding.itemPow.text = ""
        }
    }
}