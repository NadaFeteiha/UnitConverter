package com.nadafeteiha.unitconverter.model

import com.nadafeteiha.unitconverter.utility.roundTwoDecimals


enum class Temp(val title :String ,val symbol:String){
    CELSIUS("Celsius","C"),
    FAHRENHEIT("Fahrenheit","F"),
    KELVIN("Kelvin","K")
}

class TempConverter:UnitConverter{
    private fun celsiusToFahrenheit(value:Double) = (value.times(9.0.div(5)))+ 32
    private fun celsiusToKelvin(value:Double) = value+273.15

    private fun fahrenheitToCelsius(value:Double) = (value-32).times(5.0.div(9))
    private fun fahrenheitToKelvin(value:Double) =(value-32).times(5.0.div(9)) + 273.15

    private fun kelvinToCelsius(value:Double) = value-273.15
    private fun kelvinToFahrenheit(value:Double) =(value-273.15).times( 9.0.div(5)) + 32

    override fun getUnits(): Map<String, String> {
        return Temp.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount:Double,fromUnit: String, toUnit: String): String {
        var result = 0.0
        when(fromUnit){
            Temp.CELSIUS.title ->{
               result = when(toUnit){
                   Temp.FAHRENHEIT.title-> celsiusToFahrenheit(amount)
                   Temp.KELVIN.title->celsiusToKelvin(amount)
                   else -> 0.0
               }
            }//END CELSIUS
            Temp.FAHRENHEIT.title ->{
                result = when(toUnit){
                    Temp.CELSIUS.title-> fahrenheitToCelsius(amount)
                    Temp.KELVIN.title-> fahrenheitToKelvin(amount)
                    else -> 0.0
                }
            }//END FAHRENHEIT
            Temp.KELVIN.title ->{
                result = when(toUnit){
                    Temp.CELSIUS.title->kelvinToCelsius(amount)
                    Temp.FAHRENHEIT.title-> kelvinToFahrenheit(amount)
                    else-> 0.0
                }
            }//END KELVIN
        }
        return result.roundTwoDecimals()
    }
}