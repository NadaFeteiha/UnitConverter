package com.nadafeteiha.unitconverter.utility

import android.app.Activity
import android.content.Context
import android.icu.text.DecimalFormat
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment


fun Double.roundTwoDecimals(): String {
    val df = DecimalFormat("#.##")
    return df.format(this)
}

fun String.roundDecimals(): String {
    return if (this.contains(".")) {
        val list =  this.split(" ")
        val result =list.first()
        var unit = ""
        if (list.lastIndex==1)
            unit+= " "+list[1]

        val indexToEnd = result.lastIndex - result.indexOf(".")
        if (!result.contains("E",true) && indexToEnd <=1 && result.last()=='0'){
            val df = DecimalFormat("#")
            return df.format(result.toDouble())+unit
        } else if (!result.contains("E",true) && indexToEnd > 2) {
            val df = DecimalFormat("#.###")
            return df.format(result.toDouble())+unit
        } else
            return this
    } else
        this
}

fun Fragment.hideKeyboard() {
    view?.let { activity?.hideKeyboard(it) }
}

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}