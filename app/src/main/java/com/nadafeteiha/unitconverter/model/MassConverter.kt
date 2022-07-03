package com.nadafeteiha.unitconverter.model

import kotlin.math.pow

enum class Mass(val title: String, val symbol: String) {
    METRIC_TON("Metric Ton", "t"),
    KILOGRAM("Kilogram", "Kg"),
    GRAM("Gram", "g"),
    MILLIGRAM("Milligram", "mg"),
    MICROGRAMS("Micrograms", "μg"),
    IMPERIAL_TON("Imperial Ton", "t"),
    US_TON("US Ton", "t"),
    STONE("Stone", "st"),
    POUND("Pound", "lb"),
    OUNCE("Ounce", "oz")
}

class MassConverter : UnitConverter {
    override fun getUnits(): Map<String, String> {
        return Mass.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        return when (fromUnit) {
            Mass.METRIC_TON.title -> metricTonToAny(amount,toUnit)
            Mass.KILOGRAM.title -> kilogramToAny(amount,toUnit)
            Mass.GRAM.title -> gramToAny(amount,toUnit)
            Mass.MILLIGRAM.title -> milligramToAny(amount,toUnit)
            Mass.MICROGRAMS.title -> microgramToAny(amount,toUnit)
            Mass.IMPERIAL_TON.title -> imperialTonToAny(amount,toUnit)
            Mass.US_TON.title -> usTonToAny(amount,toUnit)
            Mass.STONE.title -> stoneToAny(amount,toUnit)
            Mass.POUND.title -> poundToAny(amount,toUnit)
            Mass.OUNCE.title -> ouncToAny(amount,toUnit)
            else -> ""
        }
    }

    private fun metricTonToAny(amount:Double,toUnit: String):String{
        return when(toUnit){
            Mass.KILOGRAM.title -> metricTonKilogram(amount)
            Mass.GRAM.title -> metricTonToGram(amount)
            Mass.MILLIGRAM.title -> metricTonToMilligram(amount)
            Mass.MICROGRAMS.title -> metricTonToMicrograms(amount)
            Mass.IMPERIAL_TON.title -> metricTonToImperialTon(amount)
            Mass.US_TON.title -> metricTonToUSTon(amount)
            Mass.STONE.title -> metricTonStone(amount)
            Mass.POUND.title -> metricTonPound(amount)
            Mass.OUNCE.title ->metricTonOunce(amount)
            else->""
        }
    }

    private fun kilogramToAny(amount:Double,toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> kilogramToMetricTon(amount)
            Mass.GRAM.title -> kilogramToGram(amount)
            Mass.MILLIGRAM.title -> kilogramToMilligram(amount)
            Mass.MICROGRAMS.title -> kilogramToMicrograms(amount)
            Mass.IMPERIAL_TON.title -> kilogramToImperialTon(amount)
            Mass.US_TON.title -> kilogramToUSTon(amount)
            Mass.STONE.title -> kilogramToStone(amount)
            Mass.POUND.title -> kilogramToPound(amount)
            Mass.OUNCE.title ->kilogramToOunce(amount)
            else->""
        }
    }

    private fun gramToAny(amount:Double,toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> gramToMetricTon(amount)
            Mass.KILOGRAM.title -> gramToKilogram(amount)
            Mass.MILLIGRAM.title -> gramToMilligram(amount)
            Mass.MICROGRAMS.title -> gramToMicrograms(amount)
            Mass.IMPERIAL_TON.title -> gramToImperialTon(amount)
            Mass.US_TON.title -> gramToUSTon(amount)
            Mass.STONE.title -> gramToStone(amount)
            Mass.POUND.title -> gramToPound(amount)
            Mass.OUNCE.title ->gramToOunce(amount)
            else->""
        }
    }

    private fun milligramToAny(amount:Double,toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> milligramToMetricTon(amount)
            Mass.KILOGRAM.title -> milligramToKilogram(amount)
            Mass.GRAM.title -> milligramToGram(amount)
            Mass.MICROGRAMS.title -> milligramToMicrograms(amount)
            Mass.IMPERIAL_TON.title -> milligramToImperialTon(amount)
            Mass.US_TON.title -> milligramToUSTon(amount)
            Mass.STONE.title -> milligramToStone(amount)
            Mass.POUND.title -> milligramToPound(amount)
            Mass.OUNCE.title ->milligramToOunce(amount)
            else->""
        }
    }

    private fun microgramToAny(amount:Double,toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> microgramToMetricTon(amount)
            Mass.KILOGRAM.title -> microgramToKilogram(amount)
            Mass.GRAM.title -> microgramToGram(amount)
            Mass.MILLIGRAM.title -> microgramToMilligram(amount)
            Mass.IMPERIAL_TON.title -> microgramToImperialTon(amount)
            Mass.US_TON.title -> microgramToUSTon(amount)
            Mass.STONE.title -> microgramToStone(amount)
            Mass.POUND.title -> microgramToPound(amount)
            Mass.OUNCE.title ->microgramToOunce(amount)
            else->""
        }
    }

    private fun imperialTonToAny(amount:Double, toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> imperialTonToMetricTon(amount)
            Mass.KILOGRAM.title -> imperialTonToKilogram(amount)
            Mass.GRAM.title -> imperialTonToGram(amount)
            Mass.MILLIGRAM.title -> imperialTonToMilligram(amount)
            Mass.MICROGRAMS.title -> imperialTonToMicrogram(amount)
            Mass.US_TON.title -> imperialTonToUSTon(amount)
            Mass.STONE.title -> imperialTonToStone(amount)
            Mass.POUND.title -> imperialTonToPound(amount)
            Mass.OUNCE.title ->imperialTonToOunce(amount)
            else->""
        }
    }

    private fun usTonToAny(amount:Double, toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> usTonToMetricTon(amount)
            Mass.KILOGRAM.title -> usTonToKilogram(amount)
            Mass.GRAM.title -> usTonToGram(amount)
            Mass.MILLIGRAM.title -> usTonToMilligram(amount)
            Mass.MICROGRAMS.title -> usTonToMicrogram(amount)
            Mass.IMPERIAL_TON.title -> usTonToImperialTon(amount)
            Mass.STONE.title -> usTonToStone(amount)
            Mass.POUND.title -> usTonToPound(amount)
            Mass.OUNCE.title ->usTonToOunce(amount)
            else->""
        }
    }

    private fun stoneToAny(amount:Double, toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> stoneToMetricTon(amount)
            Mass.KILOGRAM.title -> stoneToKilogram(amount)
            Mass.GRAM.title -> stoneToGram(amount)
            Mass.MILLIGRAM.title -> stoneToMilligram(amount)
            Mass.MICROGRAMS.title -> stoneToMicrogram(amount)
            Mass.IMPERIAL_TON.title -> stoneToImperialTon(amount)
            Mass.US_TON.title -> stoneToUSTon(amount)
            Mass.POUND.title -> stoneToPound(amount)
            Mass.OUNCE.title ->stoneToOunce(amount)
            else->""
        }
    }

    private fun poundToAny(amount:Double, toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> poundToMetricTon(amount)
            Mass.KILOGRAM.title -> poundToKilogram(amount)
            Mass.GRAM.title -> poundToGram(amount)
            Mass.MILLIGRAM.title -> poundToMilligram(amount)
            Mass.MICROGRAMS.title -> poundToMicrogram(amount)
            Mass.IMPERIAL_TON.title -> poundToImperialTon(amount)
            Mass.US_TON.title -> poundToUSTon(amount)
            Mass.STONE.title -> poundToStone(amount)
            Mass.OUNCE.title ->poundToOunce(amount)
            else->""
        }
    }

    private fun ouncToAny(amount:Double, toUnit: String):String{
        return when(toUnit){
            Mass.METRIC_TON.title -> ouncToMetricTon(amount)
            Mass.KILOGRAM.title -> ouncToKilogram(amount)
            Mass.GRAM.title -> ouncToGram(amount)
            Mass.MILLIGRAM.title -> ouncToMilligram(amount)
            Mass.MICROGRAMS.title -> ouncToMicrogram(amount)
            Mass.IMPERIAL_TON.title -> ouncToImperialTon(amount)
            Mass.US_TON.title -> ouncToUSTon(amount)
            Mass.STONE.title -> ouncToStone(amount)
            Mass.POUND.title ->ouncToPound(amount)
            else->""
        }
    }

    //MetricTon to any
    private fun metricTonKilogram(value:Double)="${value.times(1000)}"
    private fun metricTonToGram(value:Double)="${value.times(10.0.pow(6))}"
    private fun metricTonToMilligram(value:Double)="${value.times(10.0.pow(9))}"
    private fun metricTonToMicrograms(value:Double)="${value.times(10.0.pow(12))}"
    private fun metricTonToImperialTon(value:Double)="${value.div( 1.016)}"
    private fun metricTonToUSTon(value:Double)="${value.times(1.102)}"
    private fun metricTonStone(value:Double)="${value.times(157.5)}"
    private fun metricTonPound(value:Double)="${value.times(2205)}"
    private fun metricTonOunce(value:Double)="${value.times(35270)}"


    //Kilogram to any
    private fun kilogramToMetricTon(value:Double)="${value.div(1000)}"
    private fun kilogramToGram(value:Double)="${value.times(1000)}"
    private fun kilogramToMilligram(value:Double)="${value.times(10.0.pow(6))}"
    private fun kilogramToMicrograms(value:Double)="${value.times(10.0.pow(9))}"
    private fun kilogramToImperialTon(value:Double)="${value.div( 1016)}"
    private fun kilogramToUSTon(value:Double)="${value.div(907.2)}"
    private fun kilogramToStone(value:Double)="${value.div(6.35)}"
    private fun kilogramToPound(value:Double)="${value.times(2.205)}"
    private fun kilogramToOunce(value:Double)="${value.times( 35.274)}"

    //gram to any
    private fun gramToMetricTon(value:Double)="${value.div(10.0.pow(6))}"
    private fun gramToKilogram(value:Double)="${value.div(1000)}"
    private fun gramToMilligram(value:Double)="${value.times(1000)}"
    private fun gramToMicrograms(value:Double)="${value.times(10.0.pow(6))}"
    private fun gramToImperialTon(value:Double)="${value.div( 1.016.times(10.0.pow(6)))}"
    private fun gramToUSTon(value:Double)="${value.div(907200)}"
    private fun gramToStone(value:Double)="${value.div(6350)}"
    private fun gramToPound(value:Double)="${value.div(453.6)}"
    private fun gramToOunce(value:Double)="${value.div( 28.35)}"

    //milligram to any
    private fun milligramToMetricTon(value:Double)="${value.div(10.0.pow(9))}"
    private fun milligramToKilogram(value:Double)="${value.div(10.0.pow(6))}"
    private fun milligramToGram(value:Double)="${value.div(1000)}"
    private fun milligramToMicrograms(value:Double)="${value.times(1000)}"
    private fun milligramToImperialTon(value:Double)="${value.div(1.016.times(10.0.pow(9)))}"
    private fun milligramToUSTon(value:Double)="${value.div( 9.072.times(10.0.pow(8)))}"
    private fun milligramToStone(value:Double)="${value.div(6.35.times(10.0.pow(6)))}"
    private fun milligramToPound(value:Double)="${value.div(453600)}"
    private fun milligramToOunce(value:Double)="${value.div( 28350)}"

    //microgram to any
    private fun microgramToMetricTon(value:Double)="${value.div(10.0.pow(12))}"
    private fun microgramToKilogram(value:Double)="${value.div(10.0.pow(9))}"
    private fun microgramToGram(value:Double)="${value.div(10.0.pow(6))}"
    private fun microgramToMilligram(value:Double)="${value.div(1000)}"
    private fun microgramToImperialTon(value:Double)="${value.div(1.016.times(10.0.pow(12)))}"
    private fun microgramToUSTon(value:Double)="${value.div( 9.072.times(10.0.pow(11)))}"
    private fun microgramToStone(value:Double)="${value.div(6.35.times(10.0.pow(9)))}"
    private fun microgramToPound(value:Double)="${value.div(4.536.times(10.0.pow(8)))}"
    private fun microgramToOunce(value:Double)="${value.div( 2.835.times(10.0.pow(7)))}"

    //imperialTon  to any
    private fun imperialTonToMetricTon(value:Double)="${value.times( 1.016)}"
    private fun imperialTonToKilogram(value:Double)="${value.times(1016)}"
    private fun imperialTonToGram(value:Double)="${value.times(1.016.times(10.0.pow(6)))}"
    private fun imperialTonToMilligram(value:Double)="${value.times(1.016.times(10.0.pow(9)))}"
    private fun imperialTonToMicrogram(value:Double)="${value.times(1.016.times(10.0.pow(12)))}"
    private fun imperialTonToUSTon(value:Double)="${value.times(1.12)}"
    private fun imperialTonToStone(value:Double)="${value.times(160)}"
    private fun imperialTonToPound(value:Double)="${value.times(2240)}"
    private fun imperialTonToOunce(value:Double)="${value.times(35840)}"

    //US Ton  to any
    private fun usTonToMetricTon(value:Double)="${value.div( 1.102)}"
    private fun usTonToKilogram(value:Double)="${value.times(907.2)}"
    private fun usTonToGram(value:Double)="${value.times(907200)}"
    private fun usTonToMilligram(value:Double)="${value.times(9.072.times(10.0.pow(8)))}"
    private fun usTonToMicrogram(value:Double)="${value.times(9.072.times(10.0.pow(11)))}"
    private fun usTonToImperialTon(value:Double)="${value.div(1.12)}"
    private fun usTonToStone(value:Double)="${value.times(142.9)}"
    private fun usTonToPound(value:Double)="${value.times(2000)}"
    private fun usTonToOunce(value:Double)="${value.times(32000)}"

    //Stone to any
    private fun stoneToMetricTon(value:Double)="${value.div( 157.5)}"
    private fun stoneToKilogram(value:Double)="${value.times( 6.35)}"
    private fun stoneToGram(value:Double)="${value.times(6350)}"
    private fun stoneToMilligram(value:Double)="${value.times( 6.35.times(10.0.pow(6)))}"
    private fun stoneToMicrogram(value:Double)="${value.times( 6.35.times(10.0.pow(9)))}"
    private fun stoneToImperialTon(value:Double)="${value.div(160)}"
    private fun stoneToUSTon(value:Double)="${value.div(142.9)}"
    private fun stoneToPound(value:Double)="${value.times(14)}"
    private fun stoneToOunce(value:Double)="${value.times(224)}"

    //Pound to any
    private fun poundToMetricTon(value:Double)="${value.div( 2205)}"
    private fun poundToKilogram(value:Double)="${value.div( 2.205)}"
    private fun poundToGram(value:Double)="${value.times(453.6)}"
    private fun poundToMilligram(value:Double)="${value.times(453600)}"
    private fun poundToMicrogram(value:Double)="${value.times( 4.536.times(10.0.pow(8)))}"
    private fun poundToImperialTon(value:Double)="${value.div(2240)}"
    private fun poundToUSTon(value:Double)="${value.div(2000)}"
    private fun poundToStone(value:Double)="${value.div(14)}"
    private fun poundToOunce(value:Double)="${value.times(16)}"

    //Ounce to any
    private fun ouncToMetricTon(value:Double)="${value.div( 35270)}"
    private fun ouncToKilogram(value:Double)="${value.div( 35.274)}"
    private fun ouncToGram(value:Double)="${value.times(28.35)}"
    private fun ouncToMilligram(value:Double)="${value.times(28350)}"
    private fun ouncToMicrogram(value:Double)="${value.times( 2.835.times(10.0.pow(7)))}"
    private fun ouncToImperialTon(value:Double)="${value.div(35840)}"
    private fun ouncToUSTon(value:Double)="${value.div(32000)}"
    private fun ouncToStone(value:Double)="${value.div(224)}"
    private fun ouncToPound(value:Double)="${value.div(16)}"
}