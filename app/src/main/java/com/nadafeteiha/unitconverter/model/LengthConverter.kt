package com.nadafeteiha.unitconverter.model

import kotlin.math.pow

enum class Length(val title: String, val symbol: String) {
    KILOMETER("Kilometer", "km"),
    METER("Meter", "m"),
    MILLIMETER("Millimeter", "mm"),
    MICROMETER("Micrometer", "μm"),
    NANOMETER("Nanometer", "nm"),
    MILE("Mile", "mi"),
    YARD("Yard", "yd"),
    FOOT("Foot", "ft"),
    INCH("Inch", "in"),
    NAUTICAL_MILE("Nautical mile", "n.mi"),
    CENTIMETER("Centimeter", "cm")
}

class LengthConverter : UnitConverter {

    override fun getUnits(): Map<String, String> {
        return Length.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        val result = when (fromUnit) {
            Length.KILOMETER.title -> kiloMeterToAny(amount, toUnit)
            Length.METER.title -> meterToAny(amount, toUnit)
            Length.CENTIMETER.title -> centimeterToAny(amount, toUnit)
            Length.MILLIMETER.title -> millimeterToAny(amount, toUnit)
            Length.MICROMETER.title -> micrometerToAny(amount, toUnit)
            Length.NANOMETER.title -> nanometerToAny(amount, toUnit)
            Length.MILE.title -> mileToAny(amount, toUnit)
            Length.YARD.title -> yardToAny(amount, toUnit)
            Length.FOOT.title -> footToAny(amount, toUnit)
            Length.INCH.title -> inchToAny(amount, toUnit)
            Length.NAUTICAL_MILE.title -> nauticalMileToAny(amount, toUnit)
            else -> {
                "Error"
            }
        }
        return result
    }

    private fun kiloMeterToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.METER.title -> kiloToMeter(amount)
            Length.CENTIMETER.title -> kiloToCentimeter(amount)
            Length.MILLIMETER.title -> kiloToMillimeter(amount)
            Length.MICROMETER.title -> kiloToMicrometer(amount)
            Length.NANOMETER.title -> kiloToNanometer(amount)
            Length.MILE.title -> kiloToMile(amount)
            Length.YARD.title -> kiloToYard(amount)
            Length.FOOT.title -> kiloToFoot(amount)
            Length.INCH.title -> kiloToInch(amount)
            Length.NAUTICAL_MILE.title -> kiloToNauticalMile(amount)
            else -> {
                "Error in KiloMeter"
            }
        }
    }

    private fun meterToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> meterToKilometer(amount)
            Length.CENTIMETER.title -> meterToCentimeter(amount)
            Length.MILLIMETER.title -> meterToMillimeter(amount)
            Length.MICROMETER.title -> meterToMicrometer(amount)
            Length.NANOMETER.title -> meterToNanometer(amount)
            Length.MILE.title -> meterToMile(amount)
            Length.YARD.title -> meterToYard(amount)
            Length.FOOT.title -> meterToFoot(amount)
            Length.INCH.title -> meterToInch(amount)
            Length.NAUTICAL_MILE.title -> meterToNauticalMile(amount)
            else -> {
                "Error in Meter"
            }
        }
    }

    private fun centimeterToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> centimeterToKilometer(amount)
            Length.METER.title -> centimeterToMeter(amount)
            Length.MILLIMETER.title -> centimeterToMillimeter(amount)
            Length.MICROMETER.title -> centimeterToMicrometer(amount)
            Length.NANOMETER.title -> centimeterToNanometer(amount)
            Length.MILE.title -> centimeterToMile(amount)
            Length.YARD.title -> centimeterToYard(amount)
            Length.FOOT.title -> centimeterToFoot(amount)
            Length.INCH.title -> centimeterToInch(amount)
            Length.NAUTICAL_MILE.title -> centimeterToNauticalMile(amount)
            else -> {
                "Error in Centimeter"
            }
        }
    }

    private fun millimeterToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> millimeterToKilometer(amount)
            Length.METER.title -> millimeterToMeter(amount)
            Length.CENTIMETER.title -> millimeterToCentimeter(amount)
            Length.MICROMETER.title -> millimeterToMicrometer(amount)
            Length.NANOMETER.title -> millimeterToNanometer(amount)
            Length.MILE.title -> millimeterToMile(amount)
            Length.YARD.title -> millimeterToYard(amount)
            Length.FOOT.title -> millimeterToFoot(amount)
            Length.INCH.title -> millimeterToInch(amount)
            Length.NAUTICAL_MILE.title -> millimeterToNauticalMile(amount)
            else -> {
                "Error in millimeter"
            }
        }
    }

    private fun micrometerToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> micrometerToKilometer(amount)
            Length.METER.title -> micrometerToMeter(amount)
            Length.CENTIMETER.title -> micrometerToCentimeter(amount)
            Length.MILLIMETER.title -> micrometerToMillimeter(amount)
            Length.NANOMETER.title -> micrometerToNanometer(amount)
            Length.MILE.title -> micrometerToMile(amount)
            Length.YARD.title -> micrometerToYard(amount)
            Length.FOOT.title -> micrometerToFoot(amount)
            Length.INCH.title -> micrometerToInch(amount)
            Length.NAUTICAL_MILE.title -> micrometerToNauticalMile(amount)
            else -> {
                "Error in millimeter"
            }
        }
    }

    private fun nanometerToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> nanometerToKilometer(amount)
            Length.METER.title -> nanometerToMeter(amount)
            Length.CENTIMETER.title -> nanometerToCentimeter(amount)
            Length.MILLIMETER.title -> nanometerToMillimeter(amount)
            Length.MICROMETER.title -> nanometerToMicrometer(amount)
            Length.MILE.title -> nanometerToMile(amount)
            Length.YARD.title -> nanometerToYard(amount)
            Length.FOOT.title -> nanometerToFoot(amount)
            Length.INCH.title -> nanometerToInch(amount)
            Length.NAUTICAL_MILE.title -> nanometerToNauticalMile(amount)
            else -> {
                "Error in millimeter"
            }
        }
    }

    private fun mileToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> mileToKilometer(amount)
            Length.METER.title -> mileToMeter(amount)
            Length.CENTIMETER.title -> mileToCentimeter(amount)
            Length.MILLIMETER.title -> mileToMillimeter(amount)
            Length.MICROMETER.title -> mileToMicrometer(amount)
            Length.NANOMETER.title -> mileToNanometer(amount)
            Length.YARD.title -> mileToYard(amount)
            Length.FOOT.title -> mileToFoot(amount)
            Length.INCH.title -> mileToInch(amount)
            Length.NAUTICAL_MILE.title -> mileToNauticalMile(amount)
            else -> {
                "Error in mile"
            }
        }
    }

    private fun yardToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> yardToKilometer(amount)
            Length.METER.title -> yardToMeter(amount)
            Length.CENTIMETER.title -> yardToCentimeter(amount)
            Length.MILLIMETER.title -> yardToMillimeter(amount)
            Length.MICROMETER.title -> yardToMicrometer(amount)
            Length.NANOMETER.title -> yardToNanometer(amount)
            Length.MILE.title -> yardToMile(amount)
            Length.FOOT.title -> yardToFoot(amount)
            Length.INCH.title -> yardToInch(amount)
            Length.NAUTICAL_MILE.title -> yardToNauticalMile(amount)
            else -> {
                "Error in mile"
            }
        }
    }

    private fun footToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> footToKilometer(amount)
            Length.METER.title -> footToMeter(amount)
            Length.CENTIMETER.title -> footToCentimeter(amount)
            Length.MILLIMETER.title -> footToMillimeter(amount)
            Length.MICROMETER.title -> footToMicrometer(amount)
            Length.NANOMETER.title -> footToNanometer(amount)
            Length.MILE.title -> footToMile(amount)
            Length.YARD.title -> footToYard(amount)
            Length.INCH.title -> footToInch(amount)
            Length.NAUTICAL_MILE.title -> footToNauticalMile(amount)
            else -> {
                "Error in mile"
            }
        }
    }

    private fun inchToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> inchToKilometer(amount)
            Length.METER.title -> inchToMeter(amount)
            Length.CENTIMETER.title -> inchToCentimeter(amount)
            Length.MILLIMETER.title -> inchToMillimeter(amount)
            Length.MICROMETER.title -> inchToMicrometer(amount)
            Length.NANOMETER.title -> inchToNanometer(amount)
            Length.MILE.title -> inchToMile(amount)
            Length.YARD.title -> inchToYard(amount)
            Length.FOOT.title -> inchToFoot(amount)
            Length.NAUTICAL_MILE.title -> inchToNauticalMile(amount)
            else -> {
                "Error in mile"
            }
        }
    }

    private fun nauticalMileToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Length.KILOMETER.title -> nauticalMileToKilometer(amount)
            Length.METER.title -> nauticalMileToMeter(amount)
            Length.CENTIMETER.title -> nauticalMileToCentimeter(amount)
            Length.MILLIMETER.title -> nauticalMileToMillimeter(amount)
            Length.MICROMETER.title -> nauticalMileToMicrometer(amount)
            Length.NANOMETER.title -> nauticalMileToNanometer(amount)
            Length.MILE.title -> nauticalMileToMile(amount)
            Length.YARD.title -> nauticalMileToYard(amount)
            Length.FOOT.title -> nauticalMileToFoot(amount)
            Length.INCH.title -> nauticalMileToInch(amount)
            else -> {
                "Error in mile"
            }
        }
    }

    //KILOMETER to ...
    private fun kiloToMeter(value: Double) = "${value.times(1000)}"
    private fun kiloToCentimeter(value: Double) = "${value.times(100000)}"
    private fun kiloToMillimeter(value: Double) = "${value.times(10.0.pow(6))}"
    private fun kiloToMicrometer(value: Double) = "${value.times(10.0.pow(9))}"
    private fun kiloToNanometer(value: Double) = "${value.times(10.0.pow(12))}"
    private fun kiloToMile(value: Double) = "${value.div(1.609)}"
    private fun kiloToYard(value: Double) = "${value.times(1094)}"
    private fun kiloToFoot(value: Double) = "${value.times(3281)}"
    private fun kiloToInch(value: Double) = "${value.times(39370)}"
    private fun kiloToNauticalMile(value: Double) = "${value.div(1.852)}"

    //METER to ...
    private fun meterToKilometer(value: Double) = "${value.div(1000)}"
    private fun meterToCentimeter(value: Double) = "${value.times(100)}"
    private fun meterToMillimeter(value: Double) = "${value.times(1000)}"
    private fun meterToMicrometer(value: Double) = "${value.times(10.0.pow(6))}"
    private fun meterToNanometer(value: Double) = "${value.times(10.0.pow(9))}"
    private fun meterToMile(value: Double) = "${value.div(1609)}"
    private fun meterToYard(value: Double) = "${value.times(1.094)}"
    private fun meterToFoot(value: Double) = "${value.times(3.281)}"
    private fun meterToInch(value: Double) = "${value.times(39.37)}"
    private fun meterToNauticalMile(value: Double) = "${value.div(1852)}"

    //CENTIMETER to ...
    private fun centimeterToKilometer(value: Double) = "${value.div(10.0.pow(5))}"
    private fun centimeterToMeter(value: Double) = "${value.div(100)}"
    private fun centimeterToMillimeter(value: Double) = "${value.times(10)}"
    private fun centimeterToMicrometer(value: Double) = "${value.times(10000)}"
    private fun centimeterToNanometer(value: Double) = "${value.times(10.0.pow(7))}"
    private fun centimeterToMile(value: Double) = "${value.div(160900)}"
    private fun centimeterToYard(value: Double) = "${value.times(91.44)}"
    private fun centimeterToFoot(value: Double) = "${value.times(30.48)}"
    private fun centimeterToInch(value: Double) = "${value.times(2.54)}"
    private fun centimeterToNauticalMile(value: Double) = "${value.div(185200)}"

    //Millimeter to ...
    private fun millimeterToKilometer(value: Double) = "${value.div(10.0.pow(6))}"
    private fun millimeterToMeter(value: Double) = "${value.div(1000)}"
    private fun millimeterToCentimeter(value: Double) = "${value.div(10)}"
    private fun millimeterToMicrometer(value: Double) = "${value.times(1000)}"
    private fun millimeterToNanometer(value: Double) = "${value.times(10.0.pow(6))}"
    private fun millimeterToMile(value: Double) = "${value.div(1609.0.times(10.0.pow(3)))}"
    private fun millimeterToYard(value: Double) = "${value.div(914.4)}"
    private fun millimeterToFoot(value: Double) = "${value.div(304.8)}"
    private fun millimeterToInch(value: Double) = "${value.div(25.4)}"
    private fun millimeterToNauticalMile(value: Double) = "${value.div(1.852.times(10.0.pow(6)))}"

    //Micrometer to ...
    private fun micrometerToKilometer(value: Double) = "${value.div(10.0.pow(9))}"
    private fun micrometerToMeter(value: Double) = "${value.div(10.0.pow(6))}"
    private fun micrometerToCentimeter(value: Double) = "${value.div(10000)}"
    private fun micrometerToMillimeter(value: Double) = "${value.div(1000)}"
    private fun micrometerToNanometer(value: Double) = "${value.times(1000)}"
    private fun micrometerToMile(value: Double) = "${value.div(1609.0.times(10.0.pow(6)))}"
    private fun micrometerToYard(value: Double) = "${value.div(914400)}"
    private fun micrometerToFoot(value: Double) = "${value.div(304800)}"
    private fun micrometerToInch(value: Double) = "${value.div(25400)}"
    private fun micrometerToNauticalMile(value: Double) = "${value.div(1.852.times(10.0.pow(9)))}"

    //Nanometer to ...
    private fun nanometerToKilometer(value: Double) = "${value.div(10.0.pow(11))}"
    private fun nanometerToMeter(value: Double) = "${value.div(10.0.pow(8))}"
    private fun nanometerToCentimeter(value: Double) = "${value.div(10.0.pow(6))}"
    private fun nanometerToMillimeter(value: Double) = "${value.div(10.0.pow(5))}"
    private fun nanometerToMicrometer(value: Double) = "${value.div(1000)}"
    private fun nanometerToMile(value: Double) = "${value.div(1.609.times(10.0.pow(12)))}"
    private fun nanometerToYard(value: Double) = "${value.div(9.144.times(10.0.pow(8)))}"
    private fun nanometerToFoot(value: Double) = "${value.div(3.048.times(10.0.pow(8)))}"
    private fun nanometerToInch(value: Double) = "${value.div(2.54.times(10.0.pow(7)))}"
    private fun nanometerToNauticalMile(value: Double) = "${value.div(1.852.times(10.0.pow(12)))}"

    //Mile to ...
    private fun mileToKilometer(value: Double) = "${value.times(1.609)}"
    private fun mileToMeter(value: Double) = "${value.times(1609)}"
    private fun mileToCentimeter(value: Double) = "${value.times(160900)}"
    private fun mileToMillimeter(value: Double) = "${value.times(1.609.times(10.0.pow(6)))}"
    private fun mileToMicrometer(value: Double) = "${value.times(1.609.times(10.0.pow(9)))}"
    private fun mileToNanometer(value: Double) = "${value.times(1.609.times(10.0.pow(12)))}"
    private fun mileToYard(value: Double) = "${value.times(1760)}"
    private fun mileToFoot(value: Double) = "${value.times(5280)}"
    private fun mileToInch(value: Double) = "${value.times(63360)}"
    private fun mileToNauticalMile(value: Double) = "${value.div(1.151)}"

    //Yard to ...
    private fun yardToKilometer(value: Double) = "${value.div(1094)}"
    private fun yardToMeter(value: Double) = "${value.div(1.094)}"
    private fun yardToCentimeter(value: Double) = "${value.times(91.44)}"
    private fun yardToMillimeter(value: Double) = "${value.times(914.4)}"
    private fun yardToMicrometer(value: Double) = "${value.times(914400)}"
    private fun yardToNanometer(value: Double) = "${value.times(9.144.times(10.0.pow(8)))}"
    private fun yardToMile(value: Double) = "${value.div(1760)}"
    private fun yardToFoot(value: Double) = "${value.times(3)}"
    private fun yardToInch(value: Double) = "${value.times(36)}"
    private fun yardToNauticalMile(value: Double) = "${value.div(2025)}"

    //Foot to ...
    private fun footToKilometer(value: Double) = "${value.div(3281)}"
    private fun footToMeter(value: Double) = "${value.div(3.281)}"
    private fun footToCentimeter(value: Double) = "${value.times(30.48)}"
    private fun footToMillimeter(value: Double) = "${value.times(304.8)}"
    private fun footToMicrometer(value: Double) = "${value.times(304800)}"
    private fun footToNanometer(value: Double) = "${value.times(3.048.times(10.0.pow(8)))}"
    private fun footToMile(value: Double) = "${value.div(5280)}"
    private fun footToYard(value: Double) = "${value.div(3)}"
    private fun footToInch(value: Double) = "${value.times(12)}"
    private fun footToNauticalMile(value: Double) = "${value.div(6076)}"

    //Inch to ...
    private fun inchToKilometer(value: Double) = "${value.div(39370)}"
    private fun inchToMeter(value: Double) = "${value.div(39.37)}"
    private fun inchToCentimeter(value: Double) = "${value.times(2.54)}"
    private fun inchToMillimeter(value: Double) = "${value.times(25.4)}"
    private fun inchToMicrometer(value: Double) = "${value.times(25400)}"
    private fun inchToNanometer(value: Double) = "${value.times(2.54.times(10.0.pow(7)))}"
    private fun inchToMile(value: Double) = "${value.div(63360)}"
    private fun inchToYard(value: Double) = "${value.div(36)}"
    private fun inchToFoot(value: Double) = "${value.div(12)}"
    private fun inchToNauticalMile(value: Double) = "${value.div(72910)}"

    //NauticalMile to ...
    private fun nauticalMileToKilometer(value: Double) = "${value.times(1.852)}"
    private fun nauticalMileToMeter(value: Double) = "${value.times(1852)}"
    private fun nauticalMileToCentimeter(value: Double) = "${value.times(185200)}"
    private fun nauticalMileToMillimeter(value: Double) = "${value.times(1.852.times(10.0.pow(6)))}"
    private fun nauticalMileToMicrometer(value: Double) = "${value.times(1.852.times(10.0.pow(9)))}"
    private fun nauticalMileToNanometer(value: Double) = "${value.times(1.852.times(10.0.pow(12)))}"
    private fun nauticalMileToMile(value: Double) = "${value.times(1.151)}"
    private fun nauticalMileToYard(value: Double) = "${value.times(2025)}"
    private fun nauticalMileToFoot(value: Double) = "${value.times(6076)}"
    private fun nauticalMileToInch(value: Double) = "${value.times(72910)}"
}