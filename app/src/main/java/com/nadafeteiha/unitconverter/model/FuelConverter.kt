package com.nadafeteiha.unitconverter.model

enum class Fuel(val title: String, val symbol: String) {
    MILES_PER_GALLON("miles per gallon", "MPG(US)"),
    MILES_PER_GALLON_UK("miles per gallon UK", "MPG(UK)"),
    KILOMETER_PER_LITER("kilometer per liter", "km/l"),
    LITER_PER_KILOMETER("Liter per 100 kilometer", "l/100km")
}

class FuelConverter : UnitConverter {
    override fun getUnits(): Map<String, String> {
        return Fuel.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        return when (fromUnit) {
            Fuel.MILES_PER_GALLON.title -> milesPerGallonToAny(amount, toUnit)
            Fuel.MILES_PER_GALLON_UK.title -> milesPerGallonUKToAny(amount,toUnit)
            Fuel.KILOMETER_PER_LITER.title -> kilometerPerLiterToAny(amount,toUnit)
            Fuel.LITER_PER_KILOMETER.title -> literPerKilometerToAny(amount,toUnit)
            else -> ""
        }
    }

    private fun milesPerGallonToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Fuel.MILES_PER_GALLON_UK.title -> milesPerGallonToMilesPerGallonUK(amount)
            Fuel.KILOMETER_PER_LITER.title -> milesPerGallonToKilometerPerLiter(amount)
            Fuel.LITER_PER_KILOMETER.title -> milesPerGallonToLiterPerKilometer(amount)
            else -> ""
        }
    }

    private fun milesPerGallonUKToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Fuel.MILES_PER_GALLON.title -> milesPerGallonUKToMilesPerGallon(amount)
            Fuel.KILOMETER_PER_LITER.title -> milesPerGallonUKToKilometerPerLiter(amount)
            Fuel.LITER_PER_KILOMETER.title -> milesPerGallonUKToLiterPerKilometer(amount)
            else -> ""
        }
    }

    private fun kilometerPerLiterToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Fuel.MILES_PER_GALLON.title -> kilometerPerLiterToMilesPerGallon(amount)
            Fuel.MILES_PER_GALLON_UK.title -> kilometerPerLiterToMilesPerGallonUK(amount)
            Fuel.LITER_PER_KILOMETER.title -> kilometerPerLiterToLiterPerKilometer(amount)
            else -> ""
        }
    }

    private fun literPerKilometerToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Fuel.MILES_PER_GALLON.title -> literPerKilometerToMilesPerGallon(amount)
            Fuel.MILES_PER_GALLON_UK.title -> literPerKilometerToMilesPerGallonUK(amount)
            Fuel.KILOMETER_PER_LITER.title -> literPerKilometerToKilometerPerLiter(amount)
            else -> ""
        }
    }

    private fun milesPerGallonToMilesPerGallonUK(amount: Double) = "${amount.times(1.201)}"
    private fun milesPerGallonToKilometerPerLiter(amount: Double) = "${amount.div(2.352)}"
    private fun milesPerGallonToLiterPerKilometer(amount: Double) = "${amount.times(235.215)}"


    private fun milesPerGallonUKToMilesPerGallon(amount: Double) = "${amount.div(1.201)}"
    private fun milesPerGallonUKToKilometerPerLiter(amount: Double) = "${amount.div(2.825)}"
    private fun milesPerGallonUKToLiterPerKilometer(amount: Double) = "${amount.times(235.215)}"


    private fun kilometerPerLiterToMilesPerGallon(amount: Double) = "${amount.times( 2.352)}"
    private fun kilometerPerLiterToMilesPerGallonUK(amount: Double) = "${amount.times(2.825)}"
    private fun kilometerPerLiterToLiterPerKilometer(amount: Double) = "${amount.times(100)}"

    private fun literPerKilometerToMilesPerGallon(amount: Double) = "${amount.times( 235.215)}"
    private fun literPerKilometerToMilesPerGallonUK(amount: Double) = "${amount.times(282.481)}"
    private fun literPerKilometerToKilometerPerLiter(amount: Double) = "${amount.times(100)}"
}