package com.nadafeteiha.unitconverter.category

import com.nadafeteiha.unitconverter.R
import com.nadafeteiha.unitconverter.utility.Constants

data class Category (var categoryID:Int ,var iconID :Int,var titleID :Int )


object Categories{

    var categoryList: ArrayList<Category>? = null
        get() {
            if (field != null)
                return field

            field = ArrayList()
            field!!.add(Category(Constants.WEIGHT_CONVERTER,R.drawable.ic_weight,R.string.weight))
            field!!.add(Category(Constants.TIME_CONVERTER,R.drawable.ic_time,R.string.time))
            field!!.add(Category(Constants.TEMP_CONVERTER,R.drawable.ic_temperature ,R.string.temperature))
            field!!.add(Category(Constants.LENGTH_CONVERTER,R.drawable.ic_length,R.string.length))
            field!!.add(Category(Constants.AREA_CONVERTER,R.drawable.ic_area,R.string.area))
            field!!.add(Category(Constants.FREQUENCY,R.drawable.ic_freqancy,R.string.frequency))

            return field
        }
}