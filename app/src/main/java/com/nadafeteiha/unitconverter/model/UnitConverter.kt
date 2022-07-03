package com.nadafeteiha.unitconverter.model

interface UnitConverter{

    fun getUnits():Map<String,String>

    fun converter(amount:Double,fromUnit:String,toUnit:String):String
}