package com.nadafeteiha.unitconverter.model

import kotlin.math.pow
import kotlin.text.Typography.times

enum class Area(val title: String, val symbol: String) {
    SQUARE_KILOMETER("Square foot", "Km"),
    SQUARE_METER("Square meter", "m"),
    SQUARE_MILE("Square Mile", "mile"),
    SQUARE_YARD("Square Yard", "yd"),
    SQUARE_FOOT("Square Foot", "ft"),
    SQUARE_INCH("Square Inch", "in"),
    HECTARE("Hectare", "ha"),
    ACRE("Acre", "a")
}

class AreaConverter : UnitConverter {

    override fun getUnits(): Map<String, String> {
        return Area.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        return when (fromUnit) {
            Area.SQUARE_KILOMETER.title -> squareKilometerToAny(amount, toUnit)
            Area.SQUARE_METER.title -> squareMeterToAny(amount, toUnit)
            Area.SQUARE_MILE.title -> squareMileToAny(amount, toUnit)
            Area.SQUARE_YARD.title -> squareYardToAny(amount, toUnit)
            Area.SQUARE_FOOT.title -> squareFootToAny(amount, toUnit)
            Area.SQUARE_INCH.title -> squareInchToAny(amount, toUnit)
            Area.HECTARE.title -> hectareToAny(amount, toUnit)
            Area.ACRE.title -> acreToAny(amount, toUnit)
            else -> {
                "Error"
            }
        }
    }

    //Square Kilometer
    private fun squareKilometerToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Area.SQUARE_METER.title -> sKiloToSMeter(amount)
            Area.SQUARE_MILE.title -> sKiloToSMile(amount)
            Area.SQUARE_YARD.title -> sKiloToSYard(amount)
            Area.SQUARE_FOOT.title -> sKiloToSFoot(amount)
            Area.SQUARE_INCH.title -> sKiloToSInch(amount)
            Area.HECTARE.title -> sKiloToHectare(amount)
            Area.ACRE.title -> sKiloToAcre(amount)
            else -> "Error in Square Kilometer"
        }
    }

    //Square Meter
    private fun squareMeterToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Area.SQUARE_KILOMETER.title -> sMeterToSKilometer(amount)
            Area.SQUARE_MILE.title -> sMeterToSMile(amount)
            Area.SQUARE_YARD.title -> sMeterToSYard(amount)
            Area.SQUARE_FOOT.title -> sMeterToSFoot(amount)
            Area.SQUARE_INCH.title -> sMeterToSInch(amount)
            Area.HECTARE.title -> sMeterToHectare(amount)
            Area.ACRE.title -> sMeterToAcre(amount)
            else -> "Error in Square Kilometer"
        }
    }

    //Square Mile
    private fun squareMileToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Area.SQUARE_KILOMETER.title -> sMileToSKilometer(amount)
            Area.SQUARE_METER.title -> sMileToSMeter(amount)
            Area.SQUARE_YARD.title -> sMileToSYard(amount)
            Area.SQUARE_FOOT.title -> sMileToSFoot(amount)
            Area.SQUARE_INCH.title -> sMileToSInch(amount)
            Area.HECTARE.title -> sMileToHectare(amount)
            Area.ACRE.title -> sMileToAcre(amount)
            else -> "Error in Square Kilometer"
        }
    }

    //Square Yard
    private fun squareYardToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Area.SQUARE_KILOMETER.title -> sYardToSKilometer(amount)
            Area.SQUARE_METER.title -> sYardToSMeter(amount)
            Area.SQUARE_MILE.title -> sYardToSMile(amount)
            Area.SQUARE_FOOT.title -> sYardToSFoot(amount)
            Area.SQUARE_INCH.title -> sYardToSInch(amount)
            Area.HECTARE.title -> sYardToHectare(amount)
            Area.ACRE.title -> sYardToAcre(amount)
            else -> "Error in Square Kilometer"
        }
    }

    //Square Foot
    private fun squareFootToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Area.SQUARE_KILOMETER.title -> sFootToSKilometer(amount)
            Area.SQUARE_METER.title -> sFootToSMeter(amount)
            Area.SQUARE_MILE.title -> sFootToSMile(amount)
            Area.SQUARE_YARD.title -> sFootToSYard(amount)
            Area.SQUARE_INCH.title -> sFootToSInch(amount)
            Area.HECTARE.title -> sFootToHectare(amount)
            Area.ACRE.title -> sFootToAcre(amount)
            else -> "Error in Square Kilometer"
        }
    }

    //Square Inch
    private fun squareInchToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Area.SQUARE_KILOMETER.title -> sInchToSKilometer(amount)
            Area.SQUARE_METER.title -> sInchToSMeter(amount)
            Area.SQUARE_MILE.title -> sInchToSMile(amount)
            Area.SQUARE_YARD.title -> sInchToSYard(amount)
            Area.SQUARE_FOOT.title -> sInchToSFoot(amount)
            Area.HECTARE.title -> sInchToHectare(amount)
            Area.ACRE.title -> sInchToAcre(amount)
            else -> "Error in Square Kilometer"
        }
    }

    //Hectare
    private fun hectareToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Area.SQUARE_KILOMETER.title -> hectareToSKilometer(amount)
            Area.SQUARE_METER.title -> hectareToSMeter(amount)
            Area.SQUARE_MILE.title -> hectareToSMile(amount)
            Area.SQUARE_YARD.title -> hectareToSYard(amount)
            Area.SQUARE_FOOT.title -> hectareToSFoot(amount)
            Area.SQUARE_INCH.title -> hectareToSInch(amount)
            Area.ACRE.title -> hectareToAcre(amount)
            else -> "Error in Square Kilometer"
        }
    }

    //Acre
    private fun acreToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Area.SQUARE_KILOMETER.title -> acreToSKilometer(amount)
            Area.SQUARE_METER.title -> acreToSMeter(amount)
            Area.SQUARE_MILE.title -> acreToSMile(amount)
            Area.SQUARE_YARD.title -> acreToSYard(amount)
            Area.SQUARE_FOOT.title -> acreToSFoot(amount)
            Area.SQUARE_INCH.title -> acreToSInch(amount)
            Area.HECTARE.title -> acreToHectare(amount)
            else -> "Error in Square Kilometer"
        }
    }

    //********************************************************************************************\\
    private fun sKiloToSMeter(value: Double) = "${value.times(10.0.pow(6))}"
    private fun sKiloToSMile(value: Double) = "${value.div(2.59)}"
    private fun sKiloToSYard(value: Double) = "${value.times(1.196.times(10.0.pow(6)))}"
    private fun sKiloToSFoot(value: Double) = "${value.times(1.076.times(10.0.pow(7)))}"
    private fun sKiloToSInch(value: Double) = "${value.times(1.55.times(10.0.pow(9)))}"
    private fun sKiloToHectare(value: Double) = "${value.times(100)}"
    private fun sKiloToAcre(value: Double) = "${value.times(247.1)}"


    private fun sMeterToSKilometer(value: Double) = "${value.div(10.0.pow(6))}"
    private fun sMeterToSMile(value: Double) = "${value.div(2.59.times(10.0.pow(6)))}"
    private fun sMeterToSYard(value: Double) = "${value.times(1.196)}"
    private fun sMeterToSFoot(value: Double) = "${value.times(10.764)}"
    private fun sMeterToSInch(value: Double) = "${value.times(1550)}"
    private fun sMeterToHectare(value: Double) = "${value.div(10000)}"
    private fun sMeterToAcre(value: Double) = "${value.div(4047)}"

    private fun sMileToSKilometer(value: Double) = "${value.times(2.59)}"
    private fun sMileToSMeter(value: Double) = "${value.times(2.59.times(10.0.pow(6)))}"
    private fun sMileToSYard(value: Double) = "${value.times(3.098.times(10.0.pow(6)))}"
    private fun sMileToSFoot(value: Double) = "${value.times(2.788.times((10.0.pow(7))))}"
    private fun sMileToSInch(value: Double) = "${value.times(4.014.times(10.0.pow(9)))}"
    private fun sMileToHectare(value: Double) = "${value.div(259)}"
    private fun sMileToAcre(value: Double) = "${value.div(640)}"


    private fun sYardToSKilometer(value: Double) = "${value.div(1.196.times(10.0.pow(6)))}"
    private fun sYardToSMeter(value: Double) = "${value.div(1.196)}"
    private fun sYardToSMile(value: Double) = "${value.div(3.098.times(10.0.pow(6)))}"
    private fun sYardToSFoot(value: Double) = "${value.times(9)}"
    private fun sYardToSInch(value: Double) = "${value.times(1296)}"
    private fun sYardToHectare(value: Double) = "${value.div(11960)}"
    private fun sYardToAcre(value: Double) = "${value.div(4840)}"

    private fun sFootToSKilometer(value: Double) = "${value.div(1.076.times(10.0.pow(7)))}"
    private fun sFootToSMeter(value: Double) = "${value.div(10.764)}"
    private fun sFootToSMile(value: Double) = "${value.div( 2.788.times(10.0.pow(7)))}"
    private fun sFootToSYard(value: Double) = "${value.div(9)}"
    private fun sFootToSInch(value: Double) = "${value.times(144)}"
    private fun sFootToHectare(value: Double) = "${value.div(107600)}"
    private fun sFootToAcre(value: Double) = "${value.div(43560)}"

    private fun sInchToSKilometer(value: Double) = "${value.div(1.55.times(10.0.pow(9)))}"
    private fun sInchToSMeter(value: Double) = "${value.div(1550)}"
    private fun sInchToSMile(value: Double) = "${value.div( 4.014.times(10.0.pow(9)))}"
    private fun sInchToSYard(value: Double) = "${value.div(1296)}"
    private fun sInchToSFoot(value: Double) = "${value.div(144)}"
    private fun sInchToHectare(value: Double) = "${value.div(1.55.times(10.0.pow(7)))}"
    private fun sInchToAcre(value: Double) = "${value.div(6.273.times(10.0.pow(6)))}"

    private fun hectareToSKilometer(value: Double) = "${value.div(100)}"
    private fun hectareToSMeter(value: Double) = "${value.times(10000)}"
    private fun hectareToSMile(value: Double) = "${value.div(259)}"
    private fun hectareToSYard(value: Double) = "${value.times(11960)}"
    private fun hectareToSFoot(value: Double) = "${value.times(107600)}"
    private fun hectareToSInch(value: Double) = "${value.times(1.55.times(10.0.pow(7)))}"
    private fun hectareToAcre(value: Double) = "${value.times(2.471)}"

    private fun acreToSKilometer(value: Double) = "${value.div(247.1)}"
    private fun acreToSMeter(value: Double) = "${value.times(4047)}"
    private fun acreToSMile(value: Double) = "${value.div(640)}"
    private fun acreToSYard(value: Double) = "${value.times(4840)}"
    private fun acreToSFoot(value: Double) = "${value.times(43560)}"
    private fun acreToSInch(value: Double) = "${value.times(6.273.times(10.0.pow(6)))}"
    private fun acreToHectare(value: Double) = "${value.times(2.471)}"
}