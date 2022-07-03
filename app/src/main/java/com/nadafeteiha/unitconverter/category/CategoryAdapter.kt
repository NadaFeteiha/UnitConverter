package com.nadafeteiha.unitconverter.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nadafeteiha.unitconverter.databinding.ListItemCategoryBinding

class CategoryAdapter(private val onClickListener: ClickListener,
                      var categoryList: ArrayList<Category>)
    :RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(ListItemCategoryBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categoryList[position]
        holder.itemView.setOnClickListener {
            onClickListener.onClick(category)
        }
        holder.setData(category, position)
    }

    override fun getItemCount(): Int = categoryList.size

    inner class CategoryViewHolder(private val binding: ListItemCategoryBinding)
        :RecyclerView.ViewHolder(binding.root){

        private var currentCategoryPosition: Int = -1
        fun setData(category: Category, position: Int) {
            binding.tvCategoryTitle.setText(category.titleID)
            binding.ivIcon.setImageResource(category.iconID)
            this.currentCategoryPosition = position
        }
    }

    class ClickListener(val clickListener: (category: Category) -> Unit) {
        fun onClick(category: Category) = clickListener(category)
    }
}