package com.nadafeteiha.unitconverter.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.nadafeteiha.unitconverter.MainActivity
import com.nadafeteiha.unitconverter.R
import com.nadafeteiha.unitconverter.category.Categories
import com.nadafeteiha.unitconverter.category.CategoryAdapter
import com.nadafeteiha.unitconverter.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        (activity as MainActivity).supportActionBar?.apply {
            title = resources.getString(R.string.app_name)
            setDisplayHomeAsUpEnabled(false)
            setDisplayShowHomeEnabled(false)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rvCategories.layoutManager = GridLayoutManager(context, 3)
        categoryAdapter = CategoryAdapter(
            CategoryAdapter.ClickListener { moveToSelectedConverter(it.categoryID) },
            Categories.categoryList!!)

        binding.rvCategories.adapter = categoryAdapter
    }

    private fun moveToSelectedConverter(categoryID: Int) {
        findNavController().navigate(
            HomeFragmentDirections.actionHomeFragmentToTemperatureFragment2(categoryID)
        )
    }

}