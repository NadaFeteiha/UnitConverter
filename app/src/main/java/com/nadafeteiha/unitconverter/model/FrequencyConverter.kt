package com.nadafeteiha.unitconverter.model

import kotlin.math.pow

enum class Frequency(val title: String, val symbol: String) {
    HERTZ("Hertz", ""),
    KILOHERTZ("Kilohertz", ""),
    MEGAHERTZ("megahertz", ""),
    GIGAHERTZ("gigahertz", "")
}


class FrequencyConverter : UnitConverter {

    override fun getUnits(): Map<String, String> {
        return Frequency.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        return when (fromUnit) {
            Frequency.HERTZ.title -> hertzToAny(amount, toUnit)
            Frequency.KILOHERTZ.title -> kilohertzToAny(amount,toUnit)
            Frequency.MEGAHERTZ.title -> megahertzToAny(amount,toUnit)
            Frequency.GIGAHERTZ.title -> gigaHertzToAny(amount,toUnit)
            else -> ""
        }
    }

    //Hertz To any..
    private fun hertzToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Frequency.KILOHERTZ.title -> hertzToKilohertz(amount)
            Frequency.MEGAHERTZ.title -> hertzToMegahertz(amount)
            Frequency.GIGAHERTZ.title -> hertzToGigahertz(amount)
            else -> ""
        }
    }

    //Kilohertz To any..
    private fun kilohertzToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Frequency.HERTZ.title -> kilohertzToHertz(amount)
            Frequency.MEGAHERTZ.title -> kilohertzToMegahertz(amount)
            Frequency.GIGAHERTZ.title -> kilohertzToGigahertz(amount)
            else -> ""
        }
    }

    //Megahertz To any..
    private fun megahertzToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Frequency.HERTZ.title -> megahertzToHertz(amount)
            Frequency.KILOHERTZ.title -> megahertzToKilohertz(amount)
            Frequency.GIGAHERTZ.title -> megahertzToGigahertz(amount)
            else -> ""
        }
    }

    //gigahertz To any..
    private fun gigaHertzToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Frequency.HERTZ.title -> gigahertzToHertz(amount)
            Frequency.KILOHERTZ.title -> gigahertzToKilohertz(amount)
            Frequency.MEGAHERTZ.title -> gigahertzToMigaHertz(amount)
            else -> ""
        }
    }

    private fun hertzToKilohertz(value: Double) = "${value.div(1000)}"
    private fun hertzToMegahertz(value: Double)= "${value.div(10.0.pow(6))}"
    private fun hertzToGigahertz(value: Double)= "${value.div(10.0.pow(9))}"

    private fun kilohertzToHertz(value: Double) = "${value.times(1000)}"
    private fun kilohertzToMegahertz(value: Double)= "${value.div(1000)}"
    private fun kilohertzToGigahertz(value: Double)= "${value.div(10.0.pow(6))}"

    private fun megahertzToHertz(value: Double) = "${value.times(10.0.pow(6))}"
    private fun megahertzToKilohertz(value: Double)= "${value.times(1000)}"
    private fun megahertzToGigahertz(value: Double)= "${value.div(1000)}"

    private fun gigahertzToHertz(value: Double) = "${value.times(10.0.pow(9))}"
    private fun gigahertzToKilohertz(value: Double)= "${value.times(10.0.pow(6))}"
    private fun gigahertzToMigaHertz(value: Double)= "${value.times(1000)}"
}