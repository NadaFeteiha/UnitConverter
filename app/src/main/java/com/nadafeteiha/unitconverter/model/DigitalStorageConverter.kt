package com.nadafeteiha.unitconverter.model

import kotlin.math.pow
import kotlin.text.Typography.times

enum class DigitalStorage(val title: String, val symbol: String) {
    BIT("Bit", "bit"),
    KILOBIT("Kilobit", "K"),
    KIBIBIT("Kibibit", "kb"),
    MEGABIT("Megabit", "Mbit"),
    MEBIBIT("Mebibit", "Mib"),
    GIGABIT("Gigabit", "Gb"),
    GIBIBIT("Gibibit", "Gibit"),
    TERABIT("Terabit", "Tbit"),
    TEBIBIT("Tebibit", "Ti"),
    PETABIT("Petabit", "Pb"),
    PEBIBIT("Pebibit", "Pib"),
    BYTE("Byte", "b"),
    KILOBYTE("Kilobyte", "KiB"),
    KIBIBYTE("Kibibyte", "KiB"),
    MEGABYTE("Megabyte", "MB"),
    MEBIBYTE("Mebibyte", "MB"),
    GIGABYTE("Gigabyte", "GiB"),
    GIBIBYTE("Gibibyte", "GiB"),
    TERABYTE("Terabyte", "TB"),
    TEBIBYTE("Tebibyte", "TiB"),
    PETABYTE("Petabyte", "PB"),
    PEBIBYTE("Pebibyte", "PiB")
}

class DigitalStorageConverter : UnitConverter {
    override fun getUnits(): Map<String, String> {
        return DigitalStorage.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        return when (fromUnit) {
            DigitalStorage.BIT.title -> bitToAny(amount, toUnit)
            DigitalStorage.KILOBIT.title -> kilobitToAny(amount, toUnit)
            DigitalStorage.KIBIBIT.title -> kibibitToAny(amount, toUnit)
            DigitalStorage.MEGABIT.title -> megabitToAny(amount, toUnit)
            DigitalStorage.MEBIBIT.title -> mebibitToAny(amount, toUnit)
            DigitalStorage.GIGABIT.title -> gigabitToAny(amount, toUnit)
            DigitalStorage.GIBIBIT.title -> gibibitToAny(amount, toUnit)
            DigitalStorage.TERABIT.title -> terabitToAny(amount, toUnit)
            DigitalStorage.TEBIBIT.title -> tebibitToAny(amount, toUnit)
            DigitalStorage.PETABIT.title -> petabitToAny(amount, toUnit)
            DigitalStorage.PEBIBIT.title -> pebibitToAny(amount, toUnit)
            DigitalStorage.BYTE.title -> byteToAny(amount, toUnit)
            DigitalStorage.KILOBYTE.title -> kilobyteToAny(amount,toUnit)
            DigitalStorage.KIBIBYTE.title -> kibibyteToAny(amount,toUnit)
            DigitalStorage.MEGABYTE.title -> megabyteToAny(amount,toUnit)
            DigitalStorage.MEBIBYTE.title -> mebibyteToAny(amount,toUnit)
            DigitalStorage.GIGABYTE.title -> gigabyteToAny(amount,toUnit)
            DigitalStorage.GIBIBYTE.title -> gibibyteToAny(amount,toUnit)
            DigitalStorage.TERABYTE.title -> terabyteToAny(amount,toUnit)
            DigitalStorage.TEBIBYTE.title -> tebibyteToAny(amount,toUnit)
            DigitalStorage.PETABYTE.title -> petabyteToAny(amount,toUnit)
            DigitalStorage.PEBIBYTE.title -> pebibyteToAny(amount,toUnit)
            else -> ""
        }
    }

    //bit To Any
    private fun bitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.KILOBIT.title -> bitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> bitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> bitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> bitMebibit(amount)
            DigitalStorage.GIGABIT.title -> bitToGigaBit(amount)
            DigitalStorage.GIBIBIT.title -> bitT0Gibibit(amount)
            DigitalStorage.TERABIT.title -> bitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> bitToTebibit(amount)
            DigitalStorage.PETABIT.title -> bitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> bitToPebbit(amount)
            DigitalStorage.BYTE.title -> bitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> bitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> bitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> bitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> bitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> bitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> bitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> bitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> bitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> bitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> bitToPebibyte(amount)
            else -> ""
        }
    }

    private fun kilobitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> kilobitToBit(amount)
            DigitalStorage.KIBIBIT.title -> kilobitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> kilobitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> kilobitToMebibit(amount)
            DigitalStorage.GIGABIT.title -> kilobitToGigaBit(amount)
            DigitalStorage.GIBIBIT.title -> kilobitT0Gibibit(amount)
            DigitalStorage.TERABIT.title -> kilobitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> kilobitToTebibit(amount)
            DigitalStorage.PETABIT.title -> kilobitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> kilobitToPebbit(amount)
            DigitalStorage.BYTE.title -> kilobitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> kilobitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> kilobitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> kilobitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> kilobitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> kilobitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> kilobitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> kilobitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> kilobitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> kilobitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> kilobitToPebibyte(amount)
            else -> ""
        }
    }

    private fun kibibitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> kibibitToBit(amount)
            DigitalStorage.KILOBIT.title -> kibibitToKilobit(amount)
            DigitalStorage.MEGABIT.title -> kibibitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> kibibitToMebibit(amount)
            DigitalStorage.GIGABIT.title -> kibibitToGigaBit(amount)
            DigitalStorage.GIBIBIT.title -> kibibitT0Gibibit(amount)
            DigitalStorage.TERABIT.title -> kibibitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> kibibitToTebibit(amount)
            DigitalStorage.PETABIT.title -> kibibitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> kibibitToPebbit(amount)
            DigitalStorage.BYTE.title -> kibibitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> kibibitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> kibibitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> kibibitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> kibibitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> kibibitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> kibibitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> kibibitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> kibibitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> kibibitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> kibibitToPebibyte(amount)
            else -> ""
        }
    }

    private fun megabitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> megabitToBit(amount)
            DigitalStorage.KILOBIT.title -> megabitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> megabitToKibibit(amount)
            DigitalStorage.MEBIBIT.title -> megabitToMebibit(amount)
            DigitalStorage.GIGABIT.title -> megabitToGigaBit(amount)
            DigitalStorage.GIBIBIT.title -> megabitT0Gibibit(amount)
            DigitalStorage.TERABIT.title -> megabitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> megabitToTebibit(amount)
            DigitalStorage.PETABIT.title -> megabitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> megabitToPebbit(amount)
            DigitalStorage.BYTE.title -> megabitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> megabitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> megabitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> megabitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> megabitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> megabitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> megabitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> megabitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> megabitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> megabitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> megabitToPebibyte(amount)
            else -> ""
        }
    }

    private fun mebibitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> mebibitToBit(amount)
            DigitalStorage.KILOBIT.title -> mebibitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> mebibitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> mebibitToMegabit(amount)
            DigitalStorage.GIGABIT.title -> mebibitToGigaBit(amount)
            DigitalStorage.GIBIBIT.title -> mebibitT0Gibibit(amount)
            DigitalStorage.TERABIT.title -> mebibitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> mebibitToTebibit(amount)
            DigitalStorage.PETABIT.title -> mebibitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> mebibitToPebbit(amount)
            DigitalStorage.BYTE.title -> mebibitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> mebibitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> mebibitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> mebibitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> mebibitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> mebibitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> mebibitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> mebibitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> mebibitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> mebibitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> mebibitToPebibyte(amount)
            else -> ""
        }
    }

    private fun gigabitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> gigabitToBit(amount)
            DigitalStorage.KILOBIT.title -> gigabitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> gigabitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> gigabitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> gigabitToMebibit(amount)
            DigitalStorage.GIBIBIT.title -> gigabitT0Gibibit(amount)
            DigitalStorage.TERABIT.title -> gigabitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> gigabitToTebibit(amount)
            DigitalStorage.PETABIT.title -> gigabitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> gigabitToPebbit(amount)
            DigitalStorage.BYTE.title -> gigabitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> gigabitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> gigabitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> gigabitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> gigabitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> gigabitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> gigabitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> gigabitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> gigabitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> gigabitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> gigabitToPebibyte(amount)
            else -> ""
        }
    }

    private fun gibibitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> gibibitToBit(amount)
            DigitalStorage.KILOBIT.title -> gibibitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> gibibitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> gibibitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> gibibitToMebibit(amount)
            DigitalStorage.GIGABIT.title -> gibibitT0Gigabit(amount)
            DigitalStorage.TERABIT.title -> gibibitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> gibibitToTebibit(amount)
            DigitalStorage.PETABIT.title -> gibibitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> gibibitToPebbit(amount)
            DigitalStorage.BYTE.title -> gibibitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> gibibitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> gibibitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> gibibitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> gibibitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> gibibitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> gibibitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> gibibitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> gibibitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> gibibitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> gibibitToPebibyte(amount)
            else -> ""
        }
    }

    private fun terabitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> terabitToBit(amount)
            DigitalStorage.KILOBIT.title -> terabitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> terabitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> terabitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> terabitToMebibit(amount)
            DigitalStorage.GIGABIT.title -> terabitT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> terabitToGibibit(amount)
            DigitalStorage.TEBIBIT.title -> terabitToTebibit(amount)
            DigitalStorage.PETABIT.title -> terabitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> terabitToPebbit(amount)
            DigitalStorage.BYTE.title -> terabitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> terabitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> terabitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> terabitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> terabitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> terabitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> terabitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> terabitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> terabitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> terabitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> terabitToPebibyte(amount)
            else -> ""
        }
    }

    private fun tebibitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> tebibitToBit(amount)
            DigitalStorage.KILOBIT.title -> tebibitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> tebibitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> tebibitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> tebibitToMebibit(amount)
            DigitalStorage.GIGABIT.title -> tebibitT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> tebibitToGibibit(amount)
            DigitalStorage.TERABIT.title -> tebibitToTerabit(amount)
            DigitalStorage.PETABIT.title -> tebibitToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> tebibitToPebbit(amount)
            DigitalStorage.BYTE.title -> tebibitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> tebibitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> tebibitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> tebibitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> tebibitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> tebibitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> tebibitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> tebibitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> tebibitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> tebibitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> tebibitToPebibyte(amount)
            else -> ""
        }
    }

    private fun petabitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> petabitToBit(amount)
            DigitalStorage.KILOBIT.title -> petabitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> petabitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> petabitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> petabitToMebibit(amount)
            DigitalStorage.GIGABIT.title -> petabitT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> petabitToGibibit(amount)
            DigitalStorage.TERABIT.title -> petabitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> petabitToTebibit(amount)
            DigitalStorage.PEBIBIT.title -> petabitToPebbit(amount)
            DigitalStorage.BYTE.title -> petabitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> petabitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> petabitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> petabitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> petabitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> petabitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> petabitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> petabitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> petabitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> petabitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> petabitToPebibyte(amount)
            else -> ""
        }
    }

    private fun pebibitToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> pebibitToBit(amount)
            DigitalStorage.KILOBIT.title -> pebibitToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> pebibitToKibibit(amount)
            DigitalStorage.MEGABIT.title -> pebibitToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> pebibitToMebibit(amount)
            DigitalStorage.GIGABIT.title -> pebibitT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> pebibitToGibibit(amount)
            DigitalStorage.TERABIT.title -> pebibitToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> pebibitToTebibit(amount)
            DigitalStorage.PETABIT.title -> pebibitToPetabit(amount)
            DigitalStorage.BYTE.title -> pebibitTobyte(amount)
            DigitalStorage.KILOBYTE.title -> pebibitToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> pebibitToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> pebibitToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> pebibitToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> pebibitToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> pebibitToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> pebibitToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> pebibitToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> pebibitToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> pebibitToPebibyte(amount)
            else -> ""
        }
    }

    private fun byteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> byteToBit(amount)
            DigitalStorage.KILOBIT.title -> byteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> byteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> byteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> byteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> byteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> byteToGibibit(amount)
            DigitalStorage.TERABIT.title -> byteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> byteToTebibit(amount)
            DigitalStorage.PETABIT.title -> byteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> byteTopebite(amount)
            DigitalStorage.KILOBYTE.title -> byteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> byteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> byteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> byteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> byteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> byteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> byteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> byteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> byteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> byteToPebibyte(amount)
            else -> ""
        }
    }

    private fun kilobyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> kilobyteToBit(amount)
            DigitalStorage.KILOBIT.title -> kilobyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> kilobyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> kilobyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> kilobyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> kilobyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> kilobyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> kilobyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> kilobyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> kilobyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> kilobyteTopebite(amount)
            DigitalStorage.BYTE.title -> kilobyteToByte(amount)
            DigitalStorage.KIBIBYTE.title -> kilobyteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> kilobyteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> kilobyteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> kilobyteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> kilobyteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> kilobyteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> kilobyteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> kilobyteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> kilobyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun kibibyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> kibibyteToBit(amount)
            DigitalStorage.KILOBIT.title -> kibibyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> kibibyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> kibibyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> kibibyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> kibibyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> kibibyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> kibibyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> kibibyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> kibibyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> kibibyteTopebite(amount)
            DigitalStorage.BYTE.title -> kibibyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> kibibyteToKilobyte(amount)
            DigitalStorage.MEGABYTE.title -> kibibyteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> kibibyteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> kibibyteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> kibibyteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> kibibyteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> kibibyteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> kibibyteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> kibibyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun megabyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> megabyteToBit(amount)
            DigitalStorage.KILOBIT.title -> megabyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> megabyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> megabyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> megabyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> megabyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> megabyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> megabyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> megabyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> megabyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> megabyteTopebite(amount)
            DigitalStorage.BYTE.title -> megabyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> megabyteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> megabyteToKibibyte(amount)
            DigitalStorage.MEBIBYTE.title -> megabyteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> megabyteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> megabyteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> megabyteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> megabyteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> megabyteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> megabyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun mebibyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> mebibyteToBit(amount)
            DigitalStorage.KILOBIT.title -> mebibyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> mebibyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> mebibyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> mebibyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> mebibyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> mebibyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> mebibyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> mebibyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> mebibyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> mebibyteTopebite(amount)
            DigitalStorage.BYTE.title -> mebibyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> mebibyteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> mebibyteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> mebibyteToMegabyte(amount)
            DigitalStorage.GIGABYTE.title -> mebibyteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> mebibyteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> mebibyteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> mebibyteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> mebibyteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> mebibyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun gigabyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> gigabyteToBit(amount)
            DigitalStorage.KILOBIT.title -> gigabyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> gigabyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> gigabyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> gigabyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> gigabyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> gigabyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> gigabyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> gigabyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> gigabyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> gigabyteTopebite(amount)
            DigitalStorage.BYTE.title -> gigabyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> gigabyteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> gigabyteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> gigabyteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> gigabyteToMebibyte(amount)
            DigitalStorage.GIBIBYTE.title -> gigabyteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> gigabyteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> gigabyteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> gigabyteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> gigabyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun gibibyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> gibibyteToBit(amount)
            DigitalStorage.KILOBIT.title -> gibibyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> gibibyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> gibibyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> gibibyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> gibibyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> gibibyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> gibibyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> gibibyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> gibibyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> gibibyteTopebite(amount)
            DigitalStorage.BYTE.title -> gibibyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> gibibyteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> gibibyteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> gibibyteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> gibibyteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> gibibyteToGigabyte(amount)
            DigitalStorage.TERABYTE.title -> gibibyteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> gibibyteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> gibibyteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> gibibyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun terabyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> terabyteToBit(amount)
            DigitalStorage.KILOBIT.title -> terabyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> terabyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> terabyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> terabyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> terabyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> terabyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> terabyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> terabyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> terabyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> terabyteTopebite(amount)
            DigitalStorage.BYTE.title -> terabyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> terabyteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> terabyteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> terabyteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> terabyteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> terabyteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> terabyteToGibibyte(amount)
            DigitalStorage.TEBIBYTE.title -> terabyteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> terabyteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> terabyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun tebibyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> tebibyteToBit(amount)
            DigitalStorage.KILOBIT.title -> tebibyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> tebibyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> tebibyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> tebibyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> tebibyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> tebibyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> tebibyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> tebibyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> tebibyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> tebibyteTopebite(amount)
            DigitalStorage.BYTE.title -> tebibyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> tebibyteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> tebibyteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> tebibyteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> tebibyteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> tebibyteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> tebibyteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> tebibyteToTerabyte(amount)
            DigitalStorage.PETABYTE.title -> tebibyteToPetabyte(amount)
            DigitalStorage.PEBIBYTE.title -> tebibyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun petabyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> petabyteToBit(amount)
            DigitalStorage.KILOBIT.title -> petabyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> petabyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> petabyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> petabyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> petabyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> petabyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> petabyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> petabyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> petabyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> petabyteTopebite(amount)
            DigitalStorage.BYTE.title -> petabyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> petabyteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> petabyteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> petabyteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> petabyteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> petabyteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> petabyteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> petabyteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> petabyteToTebibyte(amount)
            DigitalStorage.PEBIBYTE.title -> petabyteToPebibyte(amount)
            else -> ""
        }
    }

    private fun pebibyteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            DigitalStorage.BIT.title -> pebibyteToBit(amount)
            DigitalStorage.KILOBIT.title -> pebibyteToKilobit(amount)
            DigitalStorage.KIBIBIT.title -> pebibyteToKibibit(amount)
            DigitalStorage.MEGABIT.title -> pebibyteToMegabit(amount)
            DigitalStorage.MEBIBIT.title -> pebibyteToMebibit(amount)
            DigitalStorage.GIGABIT.title -> pebibyteT0Gigabit(amount)
            DigitalStorage.GIBIBIT.title -> pebibyteToGibibit(amount)
            DigitalStorage.TERABIT.title -> pebibyteToTerabit(amount)
            DigitalStorage.TEBIBIT.title -> pebibyteToTebibit(amount)
            DigitalStorage.PETABIT.title -> pebibyteToPetabit(amount)
            DigitalStorage.PEBIBIT.title -> pebibyteTopebite(amount)
            DigitalStorage.BYTE.title -> pebibyteToByte(amount)
            DigitalStorage.KILOBYTE.title -> pebibyteToKilobyte(amount)
            DigitalStorage.KIBIBYTE.title -> pebibyteToKibibyte(amount)
            DigitalStorage.MEGABYTE.title -> pebibyteToMegabyte(amount)
            DigitalStorage.MEBIBYTE.title -> pebibyteToMebibyte(amount)
            DigitalStorage.GIGABYTE.title -> pebibyteToGigabyte(amount)
            DigitalStorage.GIBIBYTE.title -> pebibyteToGibibyte(amount)
            DigitalStorage.TERABYTE.title -> pebibyteToTerabyte(amount)
            DigitalStorage.TEBIBYTE.title -> pebibyteToTebibyte(amount)
            DigitalStorage.PETABYTE.title -> pebibyteToPetabyte(amount)
            else -> ""
        }
    }


    private fun bitToKilobit(amount: Double) = "${amount.div(1000)}"
    private fun bitToKibibit(amount: Double) = "${amount.div(1024)}"
    private fun bitToMegabit(amount: Double) = "${amount.div(10.0.pow(6))}"
    private fun bitMebibit(amount: Double) = "${amount.div(1.049.times(10.0.pow(6)))}"
    private fun bitToGigaBit(amount: Double) = "${amount.div(10.0.pow(9))}"
    private fun bitT0Gibibit(amount: Double) = "${amount.div(1.074.times(10.0.pow(9)))}"
    private fun bitToTerabit(amount: Double) = "${amount.div(10.0.pow(12))}"
    private fun bitToTebibit(amount: Double) = "${amount.div(1.1.times(10.0.pow(12)))}"
    private fun bitToPetabit(amount: Double) = "${amount.div(10.0.pow(15))}"
    private fun bitToPebbit(amount: Double) = "${amount.div(1.126.times(10.0.pow(15)))}"
    private fun bitTobyte(amount: Double) = "${amount.div(8)}"
    private fun bitToKilobyte(amount: Double) = "${amount.div(8000)}"
    private fun bitToKibibyte(amount: Double) = "${amount.div(8192)}"
    private fun bitToMegabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(6)))}"
    private fun bitToMebibyte(amount: Double) = "${amount.div(8.389.times(10.0.pow(6)))}"
    private fun bitToGigabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(9)))}"
    private fun bitToGibibyte(amount: Double) = "${amount.div(8.59.times(10.0.pow(9)))}"
    private fun bitToTerabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(12)))}"
    private fun bitToTebibyte(amount: Double) = "${amount.div(8.796.times(10.0.pow(12)))}"
    private fun bitToPetabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(15)))}"
    private fun bitToPebibyte(amount: Double) = "${amount.div(9.007.times(10.0.pow(15)))}"


    private fun kilobitToBit(amount: Double) = "${amount.times(1000)}"
    private fun kilobitToKibibit(amount: Double) = "${amount.div(1.024)}"
    private fun kilobitToMegabit(amount: Double) = "${amount.div(10.0.pow(3))}"
    private fun kilobitToMebibit(amount: Double) = "${amount.div(1.049)}"
    private fun kilobitToGigaBit(amount: Double) = "${amount.div(10.0.pow(6))}"
    private fun kilobitT0Gibibit(amount: Double) = "${amount.div(1.074.times(10.0.pow(6)))}"
    private fun kilobitToTerabit(amount: Double) = "${amount.div(10.0.pow(9))}"
    private fun kilobitToTebibit(amount: Double) = "${amount.div(1.1.times(10.0.pow(9)))}"
    private fun kilobitToPetabit(amount: Double) = "${amount.div(10.0.pow(12))}"
    private fun kilobitToPebbit(amount: Double) = "${amount.div(1.126.times(10.0.pow(12)))}"
    private fun kilobitTobyte(amount: Double) = "${amount.times(125)}"
    private fun kilobitToKilobyte(amount: Double) = "${amount.div(8)}"
    private fun kilobitToKibibyte(amount: Double) = "${amount.div(8.192)}"
    private fun kilobitToMegabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(3)))}"
    private fun kilobitToMebibyte(amount: Double) = "${amount.div(8.389.times(10.0.pow(3)))}"
    private fun kilobitToGigabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(6)))}"
    private fun kilobitToGibibyte(amount: Double) = "${amount.div(8.59.times(10.0.pow(6)))}"
    private fun kilobitToTerabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(9)))}"
    private fun kilobitToTebibyte(amount: Double) = "${amount.div(8.796.times(10.0.pow(9)))}"
    private fun kilobitToPetabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(12)))}"
    private fun kilobitToPebibyte(amount: Double) = "${amount.div(9.007.times(10.0.pow(12)))}"

    private fun kibibitToBit(amount: Double) = "${amount.times(1024)}"
    private fun kibibitToKilobit(amount: Double) = "${amount.times(1.024)}"
    private fun kibibitToMegabit(amount: Double) = "${amount.div(976.6)}"
    private fun kibibitToMebibit(amount: Double) = "${amount.div(1024)}"
    private fun kibibitToGigaBit(amount: Double) = "${amount.div(976600)}"
    private fun kibibitT0Gibibit(amount: Double) = "${amount.div(1.049.times(10.0.pow(6)))}"
    private fun kibibitToTerabit(amount: Double) = "${amount.div(9.766.times(10.0.pow(8)))}"
    private fun kibibitToTebibit(amount: Double) = "${amount.div(1.074.times(10.0.pow(9)))}"
    private fun kibibitToPetabit(amount: Double) = "${amount.div(9.766.pow(11))}"
    private fun kibibitToPebbit(amount: Double) = "${amount.div(1.1.times(10.0.pow(12)))}"
    private fun kibibitTobyte(amount: Double) = "${amount.div(128)}"
    private fun kibibitToKilobyte(amount: Double) = "${amount.div(7.812)}"
    private fun kibibitToKibibyte(amount: Double) = "${amount.div(8)}"
    private fun kibibitToMegabyte(amount: Double) = "${amount.div(7813)}"
    private fun kibibitToMebibyte(amount: Double) = "${amount.div(8192)}"
    private fun kibibitToGigabyte(amount: Double) = "${amount.div(7.813.times(10.0.pow(6)))}"
    private fun kibibitToGibibyte(amount: Double) = "${amount.div(8.389.times(10.0.pow(6)))}"
    private fun kibibitToTerabyte(amount: Double) = "${amount.div(7.813.times(10.0.pow(9)))}"
    private fun kibibitToTebibyte(amount: Double) = "${amount.div(8.59.times(10.0.pow(9)))}"
    private fun kibibitToPetabyte(amount: Double) = "${amount.div(7.812.times(10.0.pow(12)))}"
    private fun kibibitToPebibyte(amount: Double) = "${amount.div(8.796.times(10.0.pow(12)))}"


    private fun megabitToBit(amount: Double) = "${amount.times(10.0.pow(6))}"
    private fun megabitToKilobit(amount: Double) = "${amount.times(1000)}"
    private fun megabitToKibibit(amount: Double) = "${amount.times(976.6)}"
    private fun megabitToMebibit(amount: Double) = "${amount.div(1.049)}"
    private fun megabitToGigaBit(amount: Double) = "${amount.div(1000)}"
    private fun megabitT0Gibibit(amount: Double) = "${amount.div(1074)}"
    private fun megabitToTerabit(amount: Double) = "${amount.div(10.0.pow(6))}"
    private fun megabitToTebibit(amount: Double) = "${amount.div(1.1.times(10.0.pow(6)))}"
    private fun megabitToPetabit(amount: Double) = "${amount.div(10.0.pow(9))}"
    private fun megabitToPebbit(amount: Double) = "${amount.div(1.126.times(10.0.pow(9)))}"
    private fun megabitTobyte(amount: Double) = "${amount.times(125000)}"
    private fun megabitToKilobyte(amount: Double) = "${amount.times(125)}"
    private fun megabitToKibibyte(amount: Double) = "${amount.times(122.1)}"
    private fun megabitToMegabyte(amount: Double) = "${amount.div(8)}"
    private fun megabitToMebibyte(amount: Double) = "${amount.div(8.389)}"
    private fun megabitToGigabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(3)))}"
    private fun megabitToGibibyte(amount: Double) = "${amount.div(8590)}"
    private fun megabitToTerabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(6)))}"
    private fun megabitToTebibyte(amount: Double) = "${amount.div(8.796.times(10.0.pow(6)))}"
    private fun megabitToPetabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(9)))}"
    private fun megabitToPebibyte(amount: Double) = "${amount.div(9.007.times(10.0.pow(9)))}"


    private fun mebibitToBit(amount: Double) = "${amount.times(1.049.times(10.0.pow(6)))}"
    private fun mebibitToKilobit(amount: Double) = "${amount.times(1049)}"
    private fun mebibitToKibibit(amount: Double) = "${amount.times(1024)}"
    private fun mebibitToMegabit(amount: Double) = "${amount.times(1.049)}"
    private fun mebibitToGigaBit(amount: Double) = "${amount.div(953.7)}"
    private fun mebibitT0Gibibit(amount: Double) = "${amount.div(1024)}"
    private fun mebibitToTerabit(amount: Double) = "${amount.div(953700)}"
    private fun mebibitToTebibit(amount: Double) = "${amount.div(1.049.times(10.0.pow(6)))}"
    private fun mebibitToPetabit(amount: Double) = "${amount.div(9.537.times(10.0.pow(8)))}"
    private fun mebibitToPebbit(amount: Double) = "${amount.div(1.074.times(10.0.pow(9)))}"
    private fun mebibitTobyte(amount: Double) = "${amount.times(131100)}"
    private fun mebibitToKilobyte(amount: Double) = "${amount.times(131.1)}"
    private fun mebibitToKibibyte(amount: Double) = "${amount.times(128)}"
    private fun mebibitToMegabyte(amount: Double) = "${amount.div(7.629)}"
    private fun mebibitToMebibyte(amount: Double) = "${amount.div(8)}"
    private fun mebibitToGigabyte(amount: Double) = "${amount.div(7629)}"
    private fun mebibitToGibibyte(amount: Double) = "${amount.div(8192)}"
    private fun mebibitToTerabyte(amount: Double) = "${amount.div(7.629.times(10.0.pow(6)))}"
    private fun mebibitToTebibyte(amount: Double) = "${amount.div(8.389.times(10.0.pow(6)))}"
    private fun mebibitToPetabyte(amount: Double) = "${amount.div(7.629.times(10.0.pow(9)))}"
    private fun mebibitToPebibyte(amount: Double) = "${amount.div(8.59.times(10.0.pow(9)))}"


    private fun gigabitToBit(amount: Double) = "${amount.times(10.0.pow(9))}"
    private fun gigabitToKilobit(amount: Double) = "${amount.times(10.0.pow(6))}"
    private fun gigabitToKibibit(amount: Double) = "${amount.times(976600)}"
    private fun gigabitToMegabit(amount: Double) = "${amount.times(1000)}"
    private fun gigabitToMebibit(amount: Double) = "${amount.times(953.7)}"
    private fun gigabitT0Gibibit(amount: Double) = "${amount.div(1.074)}"
    private fun gigabitToTerabit(amount: Double) = "${amount.div(1000)}"
    private fun gigabitToTebibit(amount: Double) = "${amount.div(1100)}"
    private fun gigabitToPetabit(amount: Double) = "${amount.div(10.0.pow(6))}"
    private fun gigabitToPebbit(amount: Double) = "${amount.div(1.126.times(10.0.pow(6)))}"
    private fun gigabitTobyte(amount: Double) = "${amount.times(1.25.times(10.0.pow(8)))}"
    private fun gigabitToKilobyte(amount: Double) = "${amount.times(125000)}"
    private fun gigabitToKibibyte(amount: Double) = "${amount.times(122100)}"
    private fun gigabitToMegabyte(amount: Double) = "${amount.times(125)}"
    private fun gigabitToMebibyte(amount: Double) = "${amount.times(119.2)}"
    private fun gigabitToGigabyte(amount: Double) = "${amount.div(8)}"
    private fun gigabitToGibibyte(amount: Double) = "${amount.div(8.59)}"
    private fun gigabitToTerabyte(amount: Double) = "${amount.div(8000)}"
    private fun gigabitToTebibyte(amount: Double) = "${amount.div(8796)}"
    private fun gigabitToPetabyte(amount: Double) = "${amount.div(8.0.times(10.0.pow(6)))}"
    private fun gigabitToPebibyte(amount: Double) = "${amount.div(9.007.times(10.0.pow(6)))}"


    private fun gibibitToBit(amount: Double) = "${amount.times(1.074.times(10.0.pow(9)))}"
    private fun gibibitToKilobit(amount: Double) = "${amount.times(1.074.times(10.0.pow(6)))}"
    private fun gibibitToKibibit(amount: Double) = "${amount.times(1.049.times(10.0.pow(6)))}"
    private fun gibibitToMegabit(amount: Double) = "${amount.times(1074)}"
    private fun gibibitToMebibit(amount: Double) = "${amount.times(1024)}"
    private fun gibibitT0Gigabit(amount: Double) = "${amount.times(1.074)}"
    private fun gibibitToTerabit(amount: Double) = "${amount.div(931.3)}"
    private fun gibibitToTebibit(amount: Double) = "${amount.div(1024)}"
    private fun gibibitToPetabit(amount: Double) = "${amount.div(931300)}"
    private fun gibibitToPebbit(amount: Double) = "${amount.div(1.049)}"
    private fun gibibitTobyte(amount: Double) = "${amount.times(1.342.times(10.0.pow(8)))}"
    private fun gibibitToKilobyte(amount: Double) = "${amount.times(134200)}"
    private fun gibibitToKibibyte(amount: Double) = "${amount.times(131100)}"
    private fun gibibitToMegabyte(amount: Double) = "${amount.times(134.2)}"
    private fun gibibitToMebibyte(amount: Double) = "${amount.times(128)}"
    private fun gibibitToGigabyte(amount: Double) = "${amount.div(7.451)}"
    private fun gibibitToGibibyte(amount: Double) = "${amount.div(8)}"
    private fun gibibitToTerabyte(amount: Double) = "${amount.div(7451)}"
    private fun gibibitToTebibyte(amount: Double) = "${amount.div(8192)}"
    private fun gibibitToPetabyte(amount: Double) = "${amount.div(7.451.times(10.0.pow(6)))}"
    private fun gibibitToPebibyte(amount: Double) = "${amount.div(8.389.times(10.0.pow(6)))}"


    private fun terabitToBit(amount: Double) = "${amount.times(10.0.pow(12))}"
    private fun terabitToKilobit(amount: Double) = "${amount.times(10.0.pow(9))}"
    private fun terabitToKibibit(amount: Double) = "${amount.times(9.766.times(10.0.pow(8)))}"
    private fun terabitToMegabit(amount: Double) = "${amount.times(10.0.pow(6))}"
    private fun terabitToMebibit(amount: Double) = "${amount.times(953700)}"
    private fun terabitT0Gigabit(amount: Double) = "${amount.times(1000)}"
    private fun terabitToGibibit(amount: Double) = "${amount.times(931.3)}"
    private fun terabitToTebibit(amount: Double) = "${amount.div(1.1)}"
    private fun terabitToPetabit(amount: Double) = "${amount.div(1000)}"
    private fun terabitToPebbit(amount: Double) = "${amount.div(1126)}"
    private fun terabitTobyte(amount: Double) = "${amount.times(1.25.times(10.0.pow(11)))}"
    private fun terabitToKilobyte(amount: Double) = "${amount.times(1.25.times(10.0.pow(8)))}"
    private fun terabitToKibibyte(amount: Double) = "${amount.times(1.221.times(10.0.pow(8)))}"
    private fun terabitToMegabyte(amount: Double) = "${amount.times(125000)}"
    private fun terabitToMebibyte(amount: Double) = "${amount.times(119200)}"
    private fun terabitToGigabyte(amount: Double) = "${amount.times(125)}"
    private fun terabitToGibibyte(amount: Double) = "${amount.times(116.4)}"
    private fun terabitToTerabyte(amount: Double) = "${amount.div(8)}"
    private fun terabitToTebibyte(amount: Double) = "${amount.div(8.796)}"
    private fun terabitToPetabyte(amount: Double) = "${amount.div(8000)}"
    private fun terabitToPebibyte(amount: Double) = "${amount.div(9007)}"


    private fun tebibitToBit(amount: Double) = "${amount.times(1.1.times(10.0.pow(12)))}"
    private fun tebibitToKilobit(amount: Double) = "${amount.times(1.1.times(10.0.pow(9)))}"
    private fun tebibitToKibibit(amount: Double) = "${amount.times(1.074.times(10.0.pow(9)))}"
    private fun tebibitToMegabit(amount: Double) = "${amount.times(1.1.times(10.0.pow(6)))}"
    private fun tebibitToMebibit(amount: Double) = "${amount.times(1.049.times(10.0.pow(6)))}"
    private fun tebibitT0Gigabit(amount: Double) = "${amount.times(1100)}"
    private fun tebibitToGibibit(amount: Double) = "${amount.times(1024)}"
    private fun tebibitToTerabit(amount: Double) = "${amount.times(1.1)}"
    private fun tebibitToPetabit(amount: Double) = "${amount.div(909.5)}"
    private fun tebibitToPebbit(amount: Double) = "${amount.div(1024)}"
    private fun tebibitTobyte(amount: Double) = "${amount.times(1.374.times(10.0.pow(11)))}"
    private fun tebibitToKilobyte(amount: Double) = "${amount.times(1.374.times(10.0.pow(8)))}"
    private fun tebibitToKibibyte(amount: Double) = "${amount.times(1.342.times(10.0.pow(8)))}"
    private fun tebibitToMegabyte(amount: Double) = "${amount.times(137400)}"
    private fun tebibitToMebibyte(amount: Double) = "${amount.times(131100)}"
    private fun tebibitToGigabyte(amount: Double) = "${amount.times(137.4)}"
    private fun tebibitToGibibyte(amount: Double) = "${amount.times(128)}"
    private fun tebibitToTerabyte(amount: Double) = "${amount.div(7.276)}"
    private fun tebibitToTebibyte(amount: Double) = "${amount.div(8)}"
    private fun tebibitToPetabyte(amount: Double) = "${amount.div(7276)}"
    private fun tebibitToPebibyte(amount: Double) = "${amount.div(8192)}"

    private fun petabitToBit(amount: Double) = "${amount.times(1.1.times(10.0.pow(15)))}"
    private fun petabitToKilobit(amount: Double) = "${amount.times(10.0.pow(12))}"
    private fun petabitToKibibit(amount: Double) = "${amount.times(9.766.times(10.0.pow(11)))}"
    private fun petabitToMegabit(amount: Double) = "${amount.times(1.1.times(10.0.pow(9)))}"
    private fun petabitToMebibit(amount: Double) = "${amount.times(9.537.times(10.0.pow(8)))}"
    private fun petabitT0Gigabit(amount: Double) = "${amount.times(10.0.pow(6))}"
    private fun petabitToGibibit(amount: Double) = "${amount.times(931300)}"
    private fun petabitToTerabit(amount: Double) = "${amount.times(1000)}"
    private fun petabitToTebibit(amount: Double) = "${amount.times(909.5)}"
    private fun petabitToPebbit(amount: Double) = "${amount.div(1.126)}"
    private fun petabitTobyte(amount: Double) = "${amount.times(1.25.times(10.0.pow(14)))}"
    private fun petabitToKilobyte(amount: Double) = "${amount.times(1.25.times(10.0.pow(11)))}"
    private fun petabitToKibibyte(amount: Double) = "${amount.times(1.221.times(10.0.pow(11)))}"
    private fun petabitToMegabyte(amount: Double) = "${amount.times(1.25.times(10.0.pow(8)))}"
    private fun petabitToMebibyte(amount: Double) = "${amount.times(1.192.times(10.0.pow(8)))}"
    private fun petabitToGigabyte(amount: Double) = "${amount.times(125000)}"
    private fun petabitToGibibyte(amount: Double) = "${amount.times(116400)}"
    private fun petabitToTerabyte(amount: Double) = "${amount.times(125)}"
    private fun petabitToTebibyte(amount: Double) = "${amount.times(113.7)}"
    private fun petabitToPetabyte(amount: Double) = "${amount.div(8)}"
    private fun petabitToPebibyte(amount: Double) = "${amount.div(9.007)}"

    private fun pebibitToBit(amount: Double) = "${amount.times(1.126.times(10.0.pow(15)))}"
    private fun pebibitToKilobit(amount: Double) = "${amount.times(1.126.times(10.0.pow(12)))}"
    private fun pebibitToKibibit(amount: Double) = "${amount.times(1.1.times(10.0.pow(12)))}"
    private fun pebibitToMegabit(amount: Double) = "${amount.times(1.126.times(10.0.pow(9)))}"
    private fun pebibitToMebibit(amount: Double) = "${amount.times(1.074.times(10.0.pow(9)))}"
    private fun pebibitT0Gigabit(amount: Double) = "${amount.times(1.126.times(10.0.pow(6)))}"
    private fun pebibitToGibibit(amount: Double) = "${amount.times(1.049.times(10.0.pow(6)))}"
    private fun pebibitToTerabit(amount: Double) = "${amount.times(1126)}"
    private fun pebibitToTebibit(amount: Double) = "${amount.times(1024)}"
    private fun pebibitToPetabit(amount: Double) = "${amount.times(1.126)}"
    private fun pebibitTobyte(amount: Double) = "${amount.times(1.407.times(10.0.pow(14)))}"
    private fun pebibitToKilobyte(amount: Double) = "${amount.times(1.407.times(10.0.pow(11)))}"
    private fun pebibitToKibibyte(amount: Double) = "${amount.times(1.374.times(10.0.pow(11)))}"
    private fun pebibitToMegabyte(amount: Double) = "${amount.times(1.407.times(10.0.pow(8)))}"
    private fun pebibitToMebibyte(amount: Double) = "${amount.times(1.342.times(10.0.pow(8)))}"
    private fun pebibitToGigabyte(amount: Double) = "${amount.times(140700)}"
    private fun pebibitToGibibyte(amount: Double) = "${amount.times(131100)}"
    private fun pebibitToTerabyte(amount: Double) = "${amount.times(140.7)}"
    private fun pebibitToTebibyte(amount: Double) = "${amount.times(128)}"
    private fun pebibitToPetabyte(amount: Double) = "${amount.div(7.105)}"
    private fun pebibitToPebibyte(amount: Double) = "${amount.div(8)}"

    private fun byteToBit(amount: Double) = "${amount.times(8)}"
    private fun byteToKilobit(amount: Double) = "${amount.div(125)}"
    private fun byteToKibibit(amount: Double) = "${amount.div(128)}"
    private fun byteToMegabit(amount: Double) = "${amount.div(125000)}"
    private fun byteToMebibit(amount: Double) = "${amount.div(131100)}"
    private fun byteT0Gigabit(amount: Double) = "${amount.div(1.25.times(10.0.pow(8)))}"
    private fun byteToGibibit(amount: Double) = "${amount.div(1.342.times(10.0.pow(8)))}"
    private fun byteToTerabit(amount: Double) = "${amount.div(1.25.times(10.0.pow(11)))}"
    private fun byteToTebibit(amount: Double) = "${amount.div(1.374.times(10.0.pow(11)))}"
    private fun byteToPetabit(amount: Double) = "${amount.div(1.25.times(10.0.pow(14)))}"
    private fun byteTopebite(amount: Double) = "${amount.div(1.407.times(10.0.pow(14)))}"
    private fun byteToKilobyte(amount: Double) = "${amount.div(1000)}"
    private fun byteToKibibyte(amount: Double) = "${amount.div(1024)}"
    private fun byteToMegabyte(amount: Double) = "${amount.div(10.0.pow(6))}"
    private fun byteToMebibyte(amount: Double) = "${amount.div(1.049.times(10.0.pow(6)))}"
    private fun byteToGigabyte(amount: Double) = "${amount.div(10.0.pow(9))}"
    private fun byteToGibibyte(amount: Double) = "${amount.times(1.074.times(10.0.pow(9)))}"
    private fun byteToTerabyte(amount: Double) = "${amount.div(10.0.pow(12))}"
    private fun byteToTebibyte(amount: Double) = "${amount.div(1.1.times(10.0.pow(12)))}"
    private fun byteToPetabyte(amount: Double) = "${amount.div(10.0.pow(15))}"
    private fun byteToPebibyte(amount: Double) = "${amount.div(1.126.times(10.0.pow(15)))}"

    private fun kilobyteToBit(amount: Double) = "${amount.times(8000)}"
    private fun kilobyteToKilobit(amount: Double) = "${amount.times(8)}"
    private fun kilobyteToKibibit(amount: Double) = "${amount.times(7.812)}"
    private fun kilobyteToMegabit(amount: Double) = "${amount.div(125)}"
    private fun kilobyteToMebibit(amount: Double) = "${amount.div(131.1)}"
    private fun kilobyteT0Gigabit(amount: Double) = "${amount.div(125000)}"
    private fun kilobyteToGibibit(amount: Double) = "${amount.div(134200)}"
    private fun kilobyteToTerabit(amount: Double) = "${amount.div(1.25.times(10.0.pow(8)))}"
    private fun kilobyteToTebibit(amount: Double) = "${amount.div(1.374.times(10.0.pow(8)))}"
    private fun kilobyteToPetabit(amount: Double) = "${amount.div(1.25.times(10.0.pow(11)))}"
    private fun kilobyteTopebite(amount: Double) = "${amount.div(1.407.times(10.0.pow(11)))}"
    private fun kilobyteToByte(amount: Double) = "${amount.times(1000)}"
    private fun kilobyteToKibibyte(amount: Double) = "${amount.div(1.024)}"
    private fun kilobyteToMegabyte(amount: Double) = "${amount.div(10.0.pow(3))}"
    private fun kilobyteToMebibyte(amount: Double) = "${amount.div(1.049.times(10.0.pow(3)))}"
    private fun kilobyteToGigabyte(amount: Double) = "${amount.div(10.0.pow(6))}"
    private fun kilobyteToGibibyte(amount: Double) = "${amount.div(1.074.times(10.0.pow(6)))}"
    private fun kilobyteToTerabyte(amount: Double) = "${amount.div(10.0.pow(9))}"
    private fun kilobyteToTebibyte(amount: Double) = "${amount.div(1.1.times(10.0.pow(9)))}"
    private fun kilobyteToPetabyte(amount: Double) = "${amount.div(10.0.pow(12))}"
    private fun kilobyteToPebibyte(amount: Double) = "${amount.div(1.126.times(10.0.pow(12)))}"


    private fun kibibyteToBit(amount: Double) = "${amount.times(8192)}"
    private fun kibibyteToKilobit(amount: Double) = "${amount.times(8.192)}"
    private fun kibibyteToKibibit(amount: Double) = "${amount.times(8)}"
    private fun kibibyteToMegabit(amount: Double) = "${amount.div(122.1)}"
    private fun kibibyteToMebibit(amount: Double) = "${amount.div(128)}"
    private fun kibibyteT0Gigabit(amount: Double) = "${amount.div(122100)}"
    private fun kibibyteToGibibit(amount: Double) = "${amount.div(131100)}"
    private fun kibibyteToTerabit(amount: Double) = "${amount.div(1.221.times(10.0.pow(8)))}"
    private fun kibibyteToTebibit(amount: Double) = "${amount.div(1.342.times(10.0.pow(8)))}"
    private fun kibibyteToPetabit(amount: Double) = "${amount.div(1.221.times(10.0.pow(11)))}"
    private fun kibibyteTopebite(amount: Double) = "${amount.div(1.374.times(10.0.pow(11)))}"
    private fun kibibyteToByte(amount: Double) = "${amount.times(1024)}"
    private fun kibibyteToKilobyte(amount: Double) = "${amount.times(1.024)}"
    private fun kibibyteToMegabyte(amount: Double) = "${amount.div(976.6)}"
    private fun kibibyteToMebibyte(amount: Double) = "${amount.div(1024)}"
    private fun kibibyteToGigabyte(amount: Double) = "${amount.div(976600)}"
    private fun kibibyteToGibibyte(amount: Double) = "${amount.div(1.049.times(10.0.pow(6)))}"
    private fun kibibyteToTerabyte(amount: Double) = "${amount.div(9.766.times(10.0.pow(8)))}"
    private fun kibibyteToTebibyte(amount: Double) = "${amount.div(1.074.times(10.0.pow(9)))}"
    private fun kibibyteToPetabyte(amount: Double) = "${amount.div(9.766.times(10.0.pow(11)))}"
    private fun kibibyteToPebibyte(amount: Double) = "${amount.div(1.1.times(10.0.pow(12)))}"


    private fun megabyteToBit(amount: Double) = "${amount.times(8.0.times(10.0.pow(6)))}"
    private fun megabyteToKilobit(amount: Double) = "${amount.times(8000)}"
    private fun megabyteToKibibit(amount: Double) = "${amount.times(7813)}"
    private fun megabyteToMegabit(amount: Double) = "${amount.times(8)}"
    private fun megabyteToMebibit(amount: Double) = "${amount.times(7.629)}"
    private fun megabyteT0Gigabit(amount: Double) = "${amount.div(125)}"
    private fun megabyteToGibibit(amount: Double) = "${amount.div(134.2)}"
    private fun megabyteToTerabit(amount: Double) = "${amount.div(125000)}"
    private fun megabyteToTebibit(amount: Double) = "${amount.div(137400)}"
    private fun megabyteToPetabit(amount: Double) = "${amount.div(1.25.times(10.0.pow(8)))}"
    private fun megabyteTopebite(amount: Double) = "${amount.div(1.407.times(10.0.pow(8)))}"
    private fun megabyteToByte(amount: Double) = "${amount.times(10.0.pow(6))}"
    private fun megabyteToKilobyte(amount: Double) = "${amount.times(1000)}"
    private fun megabyteToKibibyte(amount: Double) = "${amount.times(976.6)}"
    private fun megabyteToMebibyte(amount: Double) = "${amount.div(1.049)}"
    private fun megabyteToGigabyte(amount: Double) = "${amount.div(1000)}"
    private fun megabyteToGibibyte(amount: Double) = "${amount.div(1074)}"
    private fun megabyteToTerabyte(amount: Double) = "${amount.div(10.0.pow(6))}"
    private fun megabyteToTebibyte(amount: Double) = "${amount.div(1.1.times(10.0.pow(6)))}"
    private fun megabyteToPetabyte(amount: Double) = "${amount.div(10.0.pow(9))}"
    private fun megabyteToPebibyte(amount: Double) = "${amount.div(1.126.times(10.0.pow(9)))}"


    private fun mebibyteToBit(amount: Double) = "${amount.times(8.389.times(10.0.pow(6)))}"
    private fun mebibyteToKilobit(amount: Double) = "${amount.times(8389)}"
    private fun mebibyteToKibibit(amount: Double) = "${amount.times(8192)}"
    private fun mebibyteToMegabit(amount: Double) = "${amount.times(8.389)}"
    private fun mebibyteToMebibit(amount: Double) = "${amount.times(8)}"
    private fun mebibyteT0Gigabit(amount: Double) = "${amount.div(119.2)}"
    private fun mebibyteToGibibit(amount: Double) = "${amount.div(128)}"
    private fun mebibyteToTerabit(amount: Double) = "${amount.div(119200)}"
    private fun mebibyteToTebibit(amount: Double) = "${amount.div(131100)}"
    private fun mebibyteToPetabit(amount: Double) = "${amount.div(1.192.times(10.0.pow(8)))}"
    private fun mebibyteTopebite(amount: Double) = "${amount.div(1.342.times(10.0.pow(8)))}"
    private fun mebibyteToByte(amount: Double) = "${amount.times(1.049.times(10.0.pow(6)))}"
    private fun mebibyteToKilobyte(amount: Double) = "${amount.times(1049)}"
    private fun mebibyteToKibibyte(amount: Double) = "${amount.times(1024)}"
    private fun mebibyteToMegabyte(amount: Double) = "${amount.times(1.049)}"
    private fun mebibyteToGigabyte(amount: Double) = "${amount.div(953.7)}"
    private fun mebibyteToGibibyte(amount: Double) = "${amount.div(1024)}"
    private fun mebibyteToTerabyte(amount: Double) = "${amount.div(953700)}"
    private fun mebibyteToTebibyte(amount: Double) = "${amount.div(1.049.times(10.0.pow(6)))}"
    private fun mebibyteToPetabyte(amount: Double) = "${amount.div(9.537.times(10.0.pow(8)))}"
    private fun mebibyteToPebibyte(amount: Double) = "${amount.div(1.074.times(10.0.pow(9)))}"


    private fun gigabyteToBit(amount: Double) = "${amount.times(8.0.times(10.0.pow(9)))}"
    private fun gigabyteToKilobit(amount: Double) = "${amount.times(8.0.times(10.0.pow(6)))}"
    private fun gigabyteToKibibit(amount: Double) = "${amount.times(7.813.times(10.0.pow(6)))}"
    private fun gigabyteToMegabit(amount: Double) = "${amount.times(8000)}"
    private fun gigabyteToMebibit(amount: Double) = "${amount.times(7629)}"
    private fun gigabyteT0Gigabit(amount: Double) = "${amount.times(8)}"
    private fun gigabyteToGibibit(amount: Double) = "${amount.times(7.451)}"
    private fun gigabyteToTerabit(amount: Double) = "${amount.div(125)}"
    private fun gigabyteToTebibit(amount: Double) = "${amount.div(137.4)}"
    private fun gigabyteToPetabit(amount: Double) = "${amount.div(125000)}"
    private fun gigabyteTopebite(amount: Double) = "${amount.div(140700)}"
    private fun gigabyteToByte(amount: Double) = "${amount.times(10.0.pow(9))}"
    private fun gigabyteToKilobyte(amount: Double) = "${amount.times(10.0.pow(6))}"
    private fun gigabyteToKibibyte(amount: Double) = "${amount.times(976600)}"
    private fun gigabyteToMegabyte(amount: Double) = "${amount.times(1000)}"
    private fun gigabyteToMebibyte(amount: Double) = "${amount.times(953.7)}"
    private fun gigabyteToGibibyte(amount: Double) = "${amount.div(1.074)}"
    private fun gigabyteToTerabyte(amount: Double) = "${amount.div(1000)}"
    private fun gigabyteToTebibyte(amount: Double) = "${amount.div(1100)}"
    private fun gigabyteToPetabyte(amount: Double) = "${amount.div(10.0.pow(6))}"
    private fun gigabyteToPebibyte(amount: Double) = "${amount.div(1.126.times(10.0.pow(6)))}"

    private fun gibibyteToBit(amount: Double) = "${amount.times(8.59.times(10.0.pow(9)))}"
    private fun gibibyteToKilobit(amount: Double) = "${amount.times(8.59.times(10.0.pow(6)))}"
    private fun gibibyteToKibibit(amount: Double) = "${amount.times(8.389.times(10.0.pow(6)))}"
    private fun gibibyteToMegabit(amount: Double) = "${amount.times(8590)}"
    private fun gibibyteToMebibit(amount: Double) = "${amount.times(8192)}"
    private fun gibibyteT0Gigabit(amount: Double) = "${amount.times(8.59)}"
    private fun gibibyteToGibibit(amount: Double) = "${amount.times(8)}"
    private fun gibibyteToTerabit(amount: Double) = "${amount.div(116.4)}"
    private fun gibibyteToTebibit(amount: Double) = "${amount.div(128)}"
    private fun gibibyteToPetabit(amount: Double) = "${amount.div(116400)}"
    private fun gibibyteTopebite(amount: Double) = "${amount.div(131100)}"
    private fun gibibyteToByte(amount: Double) = "${amount.times(1.074.times(10.0.pow(9)))}"
    private fun gibibyteToKilobyte(amount: Double) = "${amount.times(1.074.times(10.0.pow(6)))}"
    private fun gibibyteToKibibyte(amount: Double) = "${amount.times(1.049.times(10.0.pow(6)))}"
    private fun gibibyteToMegabyte(amount: Double) = "${amount.times(1074)}"
    private fun gibibyteToMebibyte(amount: Double) = "${amount.times(1024)}"
    private fun gibibyteToGigabyte(amount: Double) = "${amount.times(1.074)}"
    private fun gibibyteToTerabyte(amount: Double) = "${amount.div( 931.3)}"
    private fun gibibyteToTebibyte(amount: Double) = "${amount.div(1024)}"
    private fun gibibyteToPetabyte(amount: Double) = "${amount.div(931300)}"
    private fun gibibyteToPebibyte(amount: Double) = "${amount.div(1.049.times(10.0.pow(6)))}"

    private fun terabyteToBit(amount: Double) = "${amount.times(8.0.times(10.0.pow(12)))}"
    private fun terabyteToKilobit(amount: Double) = "${amount.times(8.0.times(10.0.pow(9)))}"
    private fun terabyteToKibibit(amount: Double) = "${amount.times(7.813.times(10.0.pow(9)))}"
    private fun terabyteToMegabit(amount: Double) = "${amount.times(8.0.times(10.0.pow(6)))}"
    private fun terabyteToMebibit(amount: Double) = "${amount.times(7.629.times(10.0.pow(6)))}"
    private fun terabyteT0Gigabit(amount: Double) = "${amount.times(8000)}"
    private fun terabyteToGibibit(amount: Double) = "${amount.times(7451)}"
    private fun terabyteToTerabit(amount: Double) = "${amount.times(8)}"
    private fun terabyteToTebibit(amount: Double) = "${amount.div(7.276)}"
    private fun terabyteToPetabit(amount: Double) = "${amount.div(125)}"
    private fun terabyteTopebite(amount: Double) = "${amount.div(140.7)}"
    private fun terabyteToByte(amount: Double) = "${amount.times(10.0.pow(12))}"
    private fun terabyteToKilobyte(amount: Double) = "${amount.times(10.0.pow(9))}"
    private fun terabyteToKibibyte(amount: Double) = "${amount.times(9.766.times(10.0.pow(8)))}"
    private fun terabyteToMegabyte(amount: Double) = "${amount.times(10.0.pow(6))}"
    private fun terabyteToMebibyte(amount: Double) = "${amount.times(953700)}"
    private fun terabyteToGigabyte(amount: Double) = "${amount.times(1000)}"
    private fun terabyteToGibibyte(amount: Double) = "${amount.times( 931.3)}"
    private fun terabyteToTebibyte(amount: Double) = "${amount.div(1.1)}"
    private fun terabyteToPetabyte(amount: Double) = "${amount.div(1000)}"
    private fun terabyteToPebibyte(amount: Double) = "${amount.div(1126)}"

    private fun tebibyteToBit(amount: Double) = "${amount.times(8.796.times(10.0.pow(12)))}"
    private fun tebibyteToKilobit(amount: Double) = "${amount.times(8.796.times(10.0.pow(9)))}"
    private fun tebibyteToKibibit(amount: Double) = "${amount.times(8.59.times(10.0.pow(9)))}"
    private fun tebibyteToMegabit(amount: Double) = "${amount.times(8.796.times(10.0.pow(6)))}"
    private fun tebibyteToMebibit(amount: Double) = "${amount.times(8.389.times(10.0.pow(6)))}"
    private fun tebibyteT0Gigabit(amount: Double) = "${amount.times(8796)}"
    private fun tebibyteToGibibit(amount: Double) = "${amount.times(8192)}"
    private fun tebibyteToTerabit(amount: Double) = "${amount.times(8.796)}"
    private fun tebibyteToTebibit(amount: Double) = "${amount.div(8)}"
    private fun tebibyteToPetabit(amount: Double) = "${amount.div(113.7)}"
    private fun tebibyteTopebite(amount: Double) = "${amount.div(128)}"
    private fun tebibyteToByte(amount: Double) = "${amount.times(1.1.times(10.0.pow(12)))}"
    private fun tebibyteToKilobyte(amount: Double) = "${amount.times(1.1.times(10.0.pow(9)))}"
    private fun tebibyteToKibibyte(amount: Double) = "${amount.times(1.074.times(10.0.pow(9)))}"
    private fun tebibyteToMegabyte(amount: Double) = "${amount.times(1.1.times(10.0.pow(6)))}"
    private fun tebibyteToMebibyte(amount: Double) = "${amount.times(1.049.times(10.0.pow(6)))}"
    private fun tebibyteToGigabyte(amount: Double) = "${amount.times(1100)}"
    private fun tebibyteToGibibyte(amount: Double) = "${amount.times( 1024)}"
    private fun tebibyteToTerabyte(amount: Double) = "${amount.times(1.1)}"
    private fun tebibyteToPetabyte(amount: Double) = "${amount.div(909.5)}"
    private fun tebibyteToPebibyte(amount: Double) = "${amount.div(1024)}"

    private fun petabyteToBit(amount: Double) = "${amount.times(8.0.times(10.0.pow(15)))}"
    private fun petabyteToKilobit(amount: Double) = "${amount.times(8.0.times(10.0.pow(12)))}"
    private fun petabyteToKibibit(amount: Double) = "${amount.times(7.813.times(10.0.pow(12)))}"
    private fun petabyteToMegabit(amount: Double) = "${amount.times(8.0.times(10.0.pow(9)))}"
    private fun petabyteToMebibit(amount: Double) = "${amount.times(7.629.times(10.0.pow(9)))}"
    private fun petabyteT0Gigabit(amount: Double) = "${amount.times(8.0.times(10.0.pow(6)))}"
    private fun petabyteToGibibit(amount: Double) = "${amount.times(7.451.times(10.0.pow(6)))}"
    private fun petabyteToTerabit(amount: Double) = "${amount.times(8000)}"
    private fun petabyteToTebibit(amount: Double) = "${amount.times(7276)}"
    private fun petabyteToPetabit(amount: Double) = "${amount.times(8)}"
    private fun petabyteTopebite(amount: Double) = "${amount.times(7.105)}"
    private fun petabyteToByte(amount: Double) = "${amount.times(10.0.pow(15))}"
    private fun petabyteToKilobyte(amount: Double) = "${amount.times(10.0.pow(12))}"
    private fun petabyteToKibibyte(amount: Double) = "${amount.times(9.766.times(10.0.pow(11)))}"
    private fun petabyteToMegabyte(amount: Double) = "${amount.times(10.0.pow(9))}"
    private fun petabyteToMebibyte(amount: Double) = "${amount.times(9.537.times(10.0.pow(8)))}"
    private fun petabyteToGigabyte(amount: Double) = "${amount.times(10.0.pow(6))}"
    private fun petabyteToGibibyte(amount: Double) = "${amount.times( 931300)}"
    private fun petabyteToTerabyte(amount: Double) = "${amount.times(1000)}"
    private fun petabyteToTebibyte(amount: Double) = "${amount.times(909.5)}"
    private fun petabyteToPebibyte(amount: Double) = "${amount.div(1.126)}"


    private fun pebibyteToBit(amount: Double) = "${amount.times(9.007.times(10.0.pow(15)))}"
    private fun pebibyteToKilobit(amount: Double) = "${amount.times(9.007.times(10.0.pow(12)))}"
    private fun pebibyteToKibibit(amount: Double) = "${amount.times(8.796.times(10.0.pow(12)))}"
    private fun pebibyteToMegabit(amount: Double) = "${amount.times(9.007.times(10.0.pow(9)))}"
    private fun pebibyteToMebibit(amount: Double) = "${amount.times(8.59.times(10.0.pow(9)))}"
    private fun pebibyteT0Gigabit(amount: Double) = "${amount.times(9.007.times(10.0.pow(6)))}"
    private fun pebibyteToGibibit(amount: Double) = "${amount.times(8.389.times(10.0.pow(6)))}"
    private fun pebibyteToTerabit(amount: Double) = "${amount.times(9007)}"
    private fun pebibyteToTebibit(amount: Double) = "${amount.times(8192)}"
    private fun pebibyteToPetabit(amount: Double) = "${amount.times( 9.007)}"
    private fun pebibyteTopebite(amount: Double) = "${amount.times(8)}"
    private fun pebibyteToByte(amount: Double) = "${amount.times(1.126.times(10.0.pow(15)))}"
    private fun pebibyteToKilobyte(amount: Double) = "${amount.times(1.126.times(10.0.pow(12)))}"
    private fun pebibyteToKibibyte(amount: Double) = "${amount.times(1.1.times(10.0.pow(12)))}"
    private fun pebibyteToMegabyte(amount: Double) = "${amount.times(1.126.times(10.0.pow(9)))}"
    private fun pebibyteToMebibyte(amount: Double) = "${amount.times(1.074.times(10.0.pow(9)))}"
    private fun pebibyteToGigabyte(amount: Double) = "${amount.times(1.126.times(10.0.pow(6)))}"
    private fun pebibyteToGibibyte(amount: Double) = "${amount.times( 1.049.times(10.0.pow(6)))}"
    private fun pebibyteToTerabyte(amount: Double) = "${amount.times(1126)}"
    private fun pebibyteToTebibyte(amount: Double) = "${amount.times(1024)}"
    private fun pebibyteToPetabyte(amount: Double) = "${amount.times(1.126)}"

}