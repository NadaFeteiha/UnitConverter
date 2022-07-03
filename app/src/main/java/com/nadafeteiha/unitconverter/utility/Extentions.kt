package com.nadafeteiha.unitconverter.utility

import android.icu.text.DecimalFormat


fun Double.roundTwoDecimals():String{
    val df = DecimalFormat("#.##")
    return df.format(this)
}

fun String.roundTwoDecimals():String{
    val df = DecimalFormat("#.##")
    return df.format(this)
}


fun String.roundUpToSixDecimals():String{
    val df = DecimalFormat("#.######")
    return df.format(this)
}