package com.nadafeteiha.unitconverter.model

enum class Speed(val title: String, val symbol: String) {
    MILES_PER_HOUR("Miles per Hour", "mph"),
    FOOT_PER_SECOND("Foot per Second", "ft/s"),
    METER_PER_SECOND("Meter per Second", "m/s"),
    KILOMETER_PER_HOUR("Kilometer per Hour", "Km/h"),
    KNOT("Knot", "knot")
}

class SpeedConverter : UnitConverter {
    override fun getUnits(): Map<String, String> {
        return Speed.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        return when (fromUnit) {
            Speed.MILES_PER_HOUR.title -> milesPerHourToAny(amount,toUnit)
            Speed.FOOT_PER_SECOND.title -> footPerSecondToAny(amount,toUnit)
            Speed.METER_PER_SECOND.title -> meterPerSecondToAny(amount,toUnit)
            Speed.KILOMETER_PER_HOUR.title -> kilometerPerHourToAny(amount,toUnit)
            Speed.KNOT.title -> knotToAny(amount,toUnit)
            else -> ""
        }
    }

    //Miles per Hour to Any..
    private fun milesPerHourToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Speed.FOOT_PER_SECOND.title -> milesPerHourToFootPerSecond(amount)
            Speed.METER_PER_SECOND.title -> milesPerHourToMeterPerSecond(amount)
            Speed.KILOMETER_PER_HOUR.title -> milesPerHourToKilometerPerHour(amount)
            Speed.KNOT.title -> milesPerHourToKnot(amount)
            else ->""
        }
    }

    //Foot per Second to Any..
    private fun footPerSecondToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Speed.MILES_PER_HOUR.title -> footPerSecondToMilesPerHour(amount)
            Speed.METER_PER_SECOND.title -> footPerSecondToMeterPerSecond(amount)
            Speed.KILOMETER_PER_HOUR.title -> footPerSecondToKilometerPerHour(amount)
            Speed.KNOT.title -> footPerSecondToKnot(amount)
            else ->""
        }
    }

    //Meter per Second to Any..
    private fun meterPerSecondToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Speed.MILES_PER_HOUR.title -> meterPerSecondToMilesPerHour(amount)
            Speed.FOOT_PER_SECOND.title -> meterPerSecondToFootPerSecond(amount)
            Speed.KILOMETER_PER_HOUR.title -> meterPerSecondToKilometerPerHour(amount)
            Speed.KNOT.title -> meterPerSecondToKnot(amount)
            else ->""
        }
    }

    //Kilometer per hour to Any..
    private fun kilometerPerHourToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Speed.MILES_PER_HOUR.title -> kilometerPerHourToMilesPerHour(amount)
            Speed.FOOT_PER_SECOND.title -> kilometerPerHourToFootPerSecond(amount)
            Speed.METER_PER_SECOND.title -> kilometerPerHourToMeterPerSecond(amount)
            Speed.KNOT.title -> kilometerPerHourToKnot(amount)
            else ->""
        }
    }

    //Knot to Any..
    private fun knotToAny(amount: Double,toUnit: String):String{
        return when(toUnit){
            Speed.MILES_PER_HOUR.title -> knotToMilesPerHour(amount)
            Speed.FOOT_PER_SECOND.title -> knotToFootPerSecond(amount)
            Speed.METER_PER_SECOND.title -> knotToMeterPerSecond(amount)
            Speed.KILOMETER_PER_HOUR.title -> knotToKilometerPerHour(amount)
            else ->""
        }
    }

    private fun milesPerHourToFootPerSecond(value:Double) = "${value.times(1.467)}"
    private fun milesPerHourToMeterPerSecond(value: Double) ="${value.div(2.237)}"
    private fun milesPerHourToKilometerPerHour(value: Double) ="${value.times(1.609)}"
    private fun milesPerHourToKnot(value: Double) ="${value.div(1.151)}"

    private fun footPerSecondToMilesPerHour(value:Double) = "${value.div(1.467)}"
    private fun footPerSecondToMeterPerSecond(value: Double) ="${value.div(3.281)}"
    private fun footPerSecondToKilometerPerHour(value: Double) ="${value.times(1.097)}"
    private fun footPerSecondToKnot(value: Double) ="${value.div(1.688)}"

    private fun meterPerSecondToMilesPerHour(value:Double) = "${value.times(2.237)}"
    private fun meterPerSecondToFootPerSecond(value: Double) ="${value.times(3.281)}"
    private fun meterPerSecondToKilometerPerHour(value: Double) ="${value.times(3.6)}"
    private fun meterPerSecondToKnot(value: Double) ="${value.times(1.944)}"

    private fun kilometerPerHourToMilesPerHour(value:Double) = "${value.div(1.609)}"
    private fun kilometerPerHourToFootPerSecond(value: Double) ="${value.div(1.097)}"
    private fun kilometerPerHourToMeterPerSecond(value: Double) ="${value.div(3.6)}"
    private fun kilometerPerHourToKnot(value: Double) ="${value.div(1.852)}"

    private fun knotToMilesPerHour(value:Double) = "${value.times(1.151)}"
    private fun knotToFootPerSecond(value: Double) ="${value.times(1.688)}"
    private fun knotToMeterPerSecond(value: Double) ="${value.div(1.944)}"
    private fun knotToKilometerPerHour(value: Double) ="${value.times(1.852)}"

}