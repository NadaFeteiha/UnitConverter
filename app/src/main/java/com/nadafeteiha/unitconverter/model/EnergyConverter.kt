package com.nadafeteiha.unitconverter.model

import kotlin.math.pow

enum class Energy(val title: String, val symbol: String) {
    JOULE("Joule", ""),
    KILOJOULE("Kilojoules", ""),
    GRAM_CALORIE("Gram Calorie", ""),
    KILOCALORIE("Kilo Calorie", ""),
    WATT_HOUR("Watt Hour", ""),
    KILOWATT_HOUR("Kilowatt Hour", ""),
    FOOT_POUND("Foot Pound", "")
}

class EnergyConverter : UnitConverter {

    override fun getUnits(): Map<String, String> {
        return Energy.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        return when (fromUnit) {
            Energy.JOULE.title -> jouleToAny(amount,toUnit)
            Energy.KILOJOULE.title -> kilojouleToAny(amount,toUnit)
            Energy.GRAM_CALORIE.title -> gramCalorueToAny(amount,toUnit)
            Energy.KILOCALORIE.title -> kilocalorieToAny(amount,toUnit)
            Energy.WATT_HOUR.title -> wattHourToAny(amount,toUnit)
            Energy.KILOWATT_HOUR.title -> kilowattHourToAny(amount,toUnit)
            Energy.FOOT_POUND.title -> footPoundToAny(amount,toUnit)
            else -> ""
        }
    }

    private fun jouleToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Energy.KILOJOULE.title -> jouleToKilojoule(amount)
            Energy.GRAM_CALORIE.title -> jouleToGramCalorie(amount)
            Energy.KILOCALORIE.title -> jouleToKilocalory(amount)
            Energy.WATT_HOUR.title -> jouleToWattHour(amount)
            Energy.KILOWATT_HOUR.title -> jouleToKilowattHour(amount)
            Energy.FOOT_POUND.title -> jouleToFootPound(amount)
            else->""
        }
    }

    private fun kilojouleToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Energy.JOULE.title -> kilojouleToJoule(amount)
            Energy.GRAM_CALORIE.title -> kilojouleToGramCalorie(amount)
            Energy.KILOCALORIE.title -> kilojouleToKilocalory(amount)
            Energy.WATT_HOUR.title -> kilojouleToWattHour(amount)
            Energy.KILOWATT_HOUR.title -> kilojouleToKilowattHour(amount)
            Energy.FOOT_POUND.title -> kilojouleToFootPound(amount)
            else->""
        }
    }

    private fun gramCalorueToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Energy.JOULE.title -> gramCalorueToJoule(amount)
            Energy.KILOJOULE.title -> gramCalorueToKiloJoule(amount)
            Energy.KILOCALORIE.title -> gramCalorueToKilocalory(amount)
            Energy.WATT_HOUR.title -> gramCalorueToWattHour(amount)
            Energy.KILOWATT_HOUR.title -> gramCalorueToKilowattHour(amount)
            Energy.FOOT_POUND.title -> gramCalorueToFootPound(amount)
            else->""
        }
    }

    private fun kilocalorieToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Energy.JOULE.title -> kilocalorieToJoule(amount)
            Energy.KILOJOULE.title -> kilocalorieToKiloJoule(amount)
            Energy.GRAM_CALORIE.title -> kilocalorieToGramCalorie(amount)
            Energy.WATT_HOUR.title -> kilocalorieToWattHour(amount)
            Energy.KILOWATT_HOUR.title -> kilocalorieToKilowattHour(amount)
            Energy.FOOT_POUND.title -> kilocalorieToFootPound(amount)
            else->""
        }
    }

    private fun wattHourToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Energy.JOULE.title -> wattHourToJoule(amount)
            Energy.KILOJOULE.title -> wattHourToKiloJoule(amount)
            Energy.GRAM_CALORIE.title -> wattHourToGramCalorie(amount)
            Energy.KILOCALORIE.title -> wattHourToKiloCalorie(amount)
            Energy.KILOWATT_HOUR.title -> wattHourToKilowattHour(amount)
            Energy.FOOT_POUND.title -> wattHourToFootPound(amount)
            else->""
        }
    }

    private fun kilowattHourToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Energy.JOULE.title -> kilowattHourToJoule(amount)
            Energy.KILOJOULE.title -> kilowattHourToKiloJoule(amount)
            Energy.GRAM_CALORIE.title -> kilowattHourToGramCalorie(amount)
            Energy.KILOCALORIE.title -> kilowattHourToKiloCalorie(amount)
            Energy.WATT_HOUR.title -> kilowattHourToWattHour(amount)
            Energy.FOOT_POUND.title -> kilowattHourToFootPound(amount)
            else->""
        }
    }

    private fun footPoundToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Energy.JOULE.title -> footPoundToJoule(amount)
            Energy.KILOJOULE.title -> footPoundToKiloJoule(amount)
            Energy.GRAM_CALORIE.title -> footPoundToGramCalorie(amount)
            Energy.KILOCALORIE.title -> footPoundToKiloCalorie(amount)
            Energy.WATT_HOUR.title -> footPoundToWattHour(amount)
            Energy.KILOWATT_HOUR.title -> footPoundToKilowattHour(amount)
            else->""
        }
    }



    private fun jouleToKilojoule(amount: Double) = "${amount.div(1000)}"
    private fun jouleToGramCalorie(amount: Double) = "${amount.div(4.184)}"
    private fun jouleToKilocalory(amount: Double) = "${amount.div(4184)}"
    private fun jouleToWattHour(amount: Double) = "${amount.div(3600)}"
    private fun jouleToKilowattHour(amount: Double) = "${amount.div(3.6.times(10.0.pow(6)))}"
    private fun jouleToFootPound(amount: Double) = "${amount.div(1.356)}"

    private fun kilojouleToJoule(amount: Double) = "${amount.times(1000)}"
    private fun kilojouleToGramCalorie(amount: Double) = "${amount.times(239)}"
    private fun kilojouleToKilocalory(amount: Double) = "${amount.div(4.184)}"
    private fun kilojouleToWattHour(amount: Double) = "${amount.div(3.6)}"
    private fun kilojouleToKilowattHour(amount: Double) = "${amount.div(3600)}"
    private fun kilojouleToFootPound(amount: Double) = "${amount.times(737.6)}"

    private fun gramCalorueToJoule(amount: Double) = "${amount.times(4.184)}"
    private fun gramCalorueToKiloJoule(amount: Double) = "${amount.div(239)}"
    private fun gramCalorueToKilocalory(amount: Double) = "${amount.div(1000)}"
    private fun gramCalorueToWattHour(amount: Double) = "${amount.div(860.4)}"
    private fun gramCalorueToKilowattHour(amount: Double) = "${amount.div(860400)}"
    private fun gramCalorueToFootPound(amount: Double) = "${amount.times(3.086)}"

    private fun kilocalorieToJoule(amount: Double) = "${amount.times(4184)}"
    private fun kilocalorieToKiloJoule(amount: Double) = "${amount.times(4.184)}"
    private fun kilocalorieToGramCalorie(amount: Double) = "${amount.times(1000)}"
    private fun kilocalorieToWattHour(amount: Double) = "${amount.times( 1.162)}"
    private fun kilocalorieToKilowattHour(amount: Double) = "${amount.div(860.4)}"
    private fun kilocalorieToFootPound(amount: Double) = "${amount.times(3086)}"

    private fun wattHourToJoule(amount: Double) = "${amount.times(3600)}"
    private fun wattHourToKiloJoule(amount: Double) = "${amount.times( 3.6)}"
    private fun wattHourToGramCalorie(amount: Double) = "${amount.times(860.4)}"
    private fun wattHourToKiloCalorie(amount: Double) = "${amount.div( 1.162)}"
    private fun wattHourToKilowattHour(amount: Double) = "${amount.div(1000)}"
    private fun wattHourToFootPound(amount: Double) = "${amount.times(2655)}"

    private fun kilowattHourToJoule(amount: Double) = "${amount.times(3.6.times(10.0.pow(6)))}"
    private fun kilowattHourToKiloJoule(amount: Double) = "${amount.times( 3600)}"
    private fun kilowattHourToGramCalorie(amount: Double) = "${amount.times(860400)}"
    private fun kilowattHourToKiloCalorie(amount: Double) = "${amount.times( 860.4)}"
    private fun kilowattHourToWattHour(amount: Double) = "${amount.times(1000)}"
    private fun kilowattHourToFootPound(amount: Double) = "${amount.times(2.655.times(10.0.pow(6)))}"

    private fun footPoundToJoule(amount: Double) = "${amount.times(1.356)}"
    private fun footPoundToKiloJoule(amount: Double) = "${amount.div( 737.6)}"
    private fun footPoundToGramCalorie(amount: Double) = "${amount.div(3.086)}"
    private fun footPoundToKiloCalorie(amount: Double) = "${amount.div( 3086)}"
    private fun footPoundToWattHour(amount: Double) = "${amount.div(2655)}"
    private fun footPoundToKilowattHour(amount: Double) = "${amount.div(2.655.times(10.0.pow(6)))}"


}