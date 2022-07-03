package com.nadafeteiha.unitconverter.model

import kotlin.math.pow
import kotlin.text.Typography.times

enum class Time(val title: String, val symbol: String) {
    NANOSECOND("Nanosecond", "ns"),
    MICROSECOND("Microsecond", "μs"),
    MILLISECOND("Millisecond", "ms"),
    SECOND("Second", "Sec"),
    MINUTE("Minute", "Min"),
    HOUR("Hour", "h"),
    DAY("Day", "D"),
    WEEK("Week", "Wk"),
    MONTH("Month", "M"),
    CALENDAR_YEAR("Year", "Y"),
    DECADE("Decade", "dec"),
    CENTURY("Century", "c")
}

class TimeConverter : UnitConverter {
    override fun getUnits(): Map<String, String> {
        return Time.values().associate { Pair(it.title, it.symbol) }
    }

    override fun converter(amount: Double, fromUnit: String, toUnit: String): String {
        return when (fromUnit) {
            Time.NANOSECOND.title -> nanosecondToAny(amount, toUnit)
            Time.MICROSECOND.title -> microsecondToAny(amount, toUnit)
            Time.MILLISECOND.title -> millisecondToAny(amount, toUnit)
            Time.SECOND.title -> secondToAny(amount, toUnit)
            Time.MINUTE.title -> minuteToAny(amount, toUnit)
            Time.HOUR.title -> hourToAny(amount, toUnit)
            Time.DAY.title -> dayToAny(amount, toUnit)
            Time.WEEK.title -> weekToAny(amount, toUnit)
            Time.MONTH.title -> monthToAny(amount, toUnit)
            Time.CALENDAR_YEAR.title -> calenderYearToAny(amount,toUnit)
            Time.DECADE.title -> decadeToAny(amount,toUnit)
            Time.CENTURY.title -> centuryToAny(amount,toUnit)
            else -> ""
        }
    }

    private fun nanosecondToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.MICROSECOND.title -> nanosecondToMicrosecond(amount)
            Time.MILLISECOND.title -> nanosecondToMillisecond(amount)
            Time.SECOND.title -> nanosecondToSecond(amount)
            Time.MINUTE.title -> nanosecondToMinute(amount)
            Time.HOUR.title -> nanosecondToHour(amount)
            Time.DAY.title -> nanosecondToDay(amount)
            Time.WEEK.title -> nanosecondToWeek(amount)
            Time.MONTH.title -> nanosecondToMonth(amount)
            Time.CALENDAR_YEAR.title -> nanosecondToCalenderYear(amount)
            Time.DECADE.title -> nanosecondToDecade(amount)
            Time.CENTURY.title -> nanosecondToCentury(amount)
            else -> ""
        }
    }

    private fun microsecondToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> microsecondToNanosecond(amount)
            Time.MILLISECOND.title -> microsecondToMillisecond(amount)
            Time.SECOND.title -> microsecondToSecond(amount)
            Time.MINUTE.title -> microsecondToMinute(amount)
            Time.HOUR.title -> microsecondToHour(amount)
            Time.DAY.title -> microsecondToDay(amount)
            Time.WEEK.title -> microsecondToWeek(amount)
            Time.MONTH.title -> microsecondToMonth(amount)
            Time.CALENDAR_YEAR.title -> microsecondToCalenderYear(amount)
            Time.DECADE.title -> microsecondToDecade(amount)
            Time.CENTURY.title -> microsecondToCentury(amount)
            else -> ""
        }
    }

    private fun millisecondToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> millisecondToNanosecond(amount)
            Time.MICROSECOND.title -> millisecondToMicrosecond(amount)
            Time.SECOND.title -> millisecondToSecond(amount)
            Time.MINUTE.title -> millisecondToMinute(amount)
            Time.HOUR.title -> millisecondToHour(amount)
            Time.DAY.title -> millisecondToDay(amount)
            Time.WEEK.title -> millisecondToWeek(amount)
            Time.MONTH.title -> millisecondToMonth(amount)
            Time.CALENDAR_YEAR.title -> millisecondToCalenderYear(amount)
            Time.DECADE.title -> millisecondToDecade(amount)
            Time.CENTURY.title -> millisecondToCentury(amount)
            else -> ""
        }
    }

    private fun secondToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> secondToNanosecond(amount)
            Time.MICROSECOND.title -> secondToMicrosecond(amount)
            Time.MILLISECOND.title -> secondToMilli(amount)
            Time.MINUTE.title -> secondToMinute(amount)
            Time.HOUR.title -> secondToHour(amount)
            Time.DAY.title -> secondToDay(amount)
            Time.WEEK.title -> secondToWeek(amount)
            Time.MONTH.title -> secondToMonth(amount)
            Time.CALENDAR_YEAR.title -> secondToCalenderYear(amount)
            Time.DECADE.title -> secondToDecade(amount)
            Time.CENTURY.title -> secondToCentury(amount)
            else -> ""
        }
    }

    private fun minuteToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> minuteToNanosecond(amount)
            Time.MICROSECOND.title -> minuteToMicrosecond(amount)
            Time.MILLISECOND.title -> minuteToMilli(amount)
            Time.SECOND.title -> minuteToSecond(amount)
            Time.HOUR.title -> minuteToHour(amount)
            Time.DAY.title -> minuteToDay(amount)
            Time.WEEK.title -> minuteToWeek(amount)
            Time.MONTH.title -> minuteToMonth(amount)
            Time.CALENDAR_YEAR.title -> minuteToCalenderYear(amount)
            Time.DECADE.title -> minuteToDecade(amount)
            Time.CENTURY.title -> minuteToCentury(amount)
            else -> ""
        }
    }

    private fun hourToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> hourToNanosecond(amount)
            Time.MICROSECOND.title -> hourToMicrosecond(amount)
            Time.MILLISECOND.title -> hourToMilli(amount)
            Time.SECOND.title -> hourToSecond(amount)
            Time.MINUTE.title -> hourToMinute(amount)
            Time.DAY.title -> hourToDay(amount)
            Time.WEEK.title -> hourToWeek(amount)
            Time.MONTH.title -> hourToMonth(amount)
            Time.CALENDAR_YEAR.title -> hourToCalenderYear(amount)
            Time.DECADE.title -> hourToDecade(amount)
            Time.CENTURY.title -> hourToCentury(amount)
            else -> ""
        }
    }

    private fun dayToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> dayToNanosecond(amount)
            Time.MICROSECOND.title -> dayToMicrosecond(amount)
            Time.MILLISECOND.title -> dayToMilli(amount)
            Time.SECOND.title -> dayToSecond(amount)
            Time.MINUTE.title -> dayToMinute(amount)
            Time.HOUR.title -> dayToHour(amount)
            Time.WEEK.title -> dayToWeek(amount)
            Time.MONTH.title -> dayToMonth(amount)
            Time.CALENDAR_YEAR.title -> dayToCalenderYear(amount)
            Time.DECADE.title -> dayToDecade(amount)
            Time.CENTURY.title -> dayToCentury(amount)
            else -> ""
        }
    }

    private fun weekToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> weekToNanosecond(amount)
            Time.MICROSECOND.title -> weekToMicrosecond(amount)
            Time.MILLISECOND.title -> weekToMilli(amount)
            Time.SECOND.title -> weekToSecond(amount)
            Time.MINUTE.title -> weekToMinute(amount)
            Time.HOUR.title -> weekToHour(amount)
            Time.DAY.title -> weekToDay(amount)
            Time.MONTH.title -> weekToMonth(amount)
            Time.CALENDAR_YEAR.title -> weekToCalenderYear(amount)
            Time.DECADE.title -> weekToDecade(amount)
            Time.CENTURY.title -> weekToCentury(amount)
            else -> ""
        }
    }

    private fun monthToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> monthToNanosecond(amount)
            Time.MICROSECOND.title -> monthToMicrosecond(amount)
            Time.MILLISECOND.title -> monthToMilli(amount)
            Time.SECOND.title -> monthToSecond(amount)
            Time.MINUTE.title -> monthToMinute(amount)
            Time.HOUR.title -> monthToHour(amount)
            Time.DAY.title -> monthToDay(amount)
            Time.WEEK.title -> monthToWeek(amount)
            Time.CALENDAR_YEAR.title -> monthToCalenderYear(amount)
            Time.DECADE.title -> monthToDecade(amount)
            Time.CENTURY.title -> monthToCentury(amount)
            else -> ""
        }
    }

    private fun calenderYearToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> calenderYearToNanosecond(amount)
            Time.MICROSECOND.title -> calenderYearToMicrosecond(amount)
            Time.MILLISECOND.title -> calenderYearToMilli(amount)
            Time.SECOND.title -> calenderYearToSecond(amount)
            Time.MINUTE.title -> calenderYearToMinute(amount)
            Time.HOUR.title -> calenderYearToHour(amount)
            Time.DAY.title -> calenderYearToDay(amount)
            Time.WEEK.title -> calenderYearToWeek(amount)
            Time.MONTH.title -> calenderYearToMonth(amount)
            Time.DECADE.title -> calenderYearToDecade(amount)
            Time.CENTURY.title -> calenderYearToCentury(amount)
            else -> ""
        }
    }

    private fun decadeToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> decadeToNanosecond(amount)
            Time.MICROSECOND.title -> decadeToMicrosecond(amount)
            Time.MILLISECOND.title -> decadeToMilli(amount)
            Time.SECOND.title -> decadeToSecond(amount)
            Time.MINUTE.title -> decadeToMinute(amount)
            Time.HOUR.title -> decadeToHour(amount)
            Time.DAY.title -> decadeToDay(amount)
            Time.WEEK.title -> decadeToWeek(amount)
            Time.MONTH.title -> decadeToMonth(amount)
            Time.CALENDAR_YEAR.title -> decadeToCalenderYear(amount)
            Time.CENTURY.title -> decadeToCentury(amount)
            else -> ""
        }
    }

    private fun centuryToAny(amount: Double, toUnit: String): String {
        return when (toUnit) {
            Time.NANOSECOND.title -> centuryToNanosecond(amount)
            Time.MICROSECOND.title -> centuryToMicrosecond(amount)
            Time.MILLISECOND.title -> centuryToMilli(amount)
            Time.SECOND.title -> centuryToSecond(amount)
            Time.MINUTE.title -> centuryToMinute(amount)
            Time.HOUR.title -> centuryToHour(amount)
            Time.DAY.title -> centuryToDay(amount)
            Time.WEEK.title -> centuryToWeek(amount)
            Time.MONTH.title -> centuryToMonth(amount)
            Time.CALENDAR_YEAR.title -> centuryToCalenderYear(amount)
            Time.DECADE.title -> centuryToDecade(amount)
            else -> ""
        }
    }

    //NANOSECOND to Any..
    private fun nanosecondToMicrosecond(value: Double) = "${value.div(1000)}"
    private fun nanosecondToMillisecond(value: Double) = "${value.div(10.0.pow(6))}"
    private fun nanosecondToSecond(value: Double) = "${value.div(10.0.pow(9))}"
    private fun nanosecondToMinute(value: Double) = "${value.div(6.times(10.0.pow(10)))}"
    private fun nanosecondToHour(value: Double) = "${value.div(3.6.times(10.0.pow(12)))}"
    private fun nanosecondToDay(value: Double) = "${value.div(8.64.times(10.0.pow(13)))}"
    private fun nanosecondToWeek(value: Double) = "${value.div(6.048.times(10.0.pow(14)))}"
    private fun nanosecondToMonth(value: Double) = "${value.div(2.628.times(10.0.pow(15)))}"
    private fun nanosecondToCalenderYear(value: Double) = "${value.div(3.154.times(10.0.pow(16)))}"
    private fun nanosecondToDecade(value: Double) = "${value.div(3.154.times(10.0.pow(17)))}"
    private fun nanosecondToCentury(value: Double) = "${value.div(3.154.times(10.0.pow(18)))}"

    //MICROSECOND to Any..
    private fun microsecondToNanosecond(value: Double) = "${value.times(1000)}"
    private fun microsecondToMillisecond(value: Double) = "${value.div(1000)}"
    private fun microsecondToSecond(value: Double) = "${value.div(10.0.pow(6))}"
    private fun microsecondToMinute(value: Double) = "${value.div(6.times(10.0.pow(7)))}"
    private fun microsecondToHour(value: Double) = "${value.div(3.6.times(10.0.pow(9)))}"
    private fun microsecondToDay(value: Double) = "${value.div(8.64.times(10.0.pow(10)))}"
    private fun microsecondToWeek(value: Double) = "${value.div(6.048.times(10.0.pow(11)))}"
    private fun microsecondToMonth(value: Double) = "${value.div(2.628.times(10.0.pow(12)))}"
    private fun microsecondToCalenderYear(value: Double) = "${value.div(3.154.times(10.0.pow(13)))}"
    private fun microsecondToDecade(value: Double) = "${value.div(3.154.times(10.0.pow(14)))}"
    private fun microsecondToCentury(value: Double) = "${value.div(3.154.times(10.0.pow(15)))}"

    //MILLISECOND to Any..
    private fun millisecondToNanosecond(value: Double) = "${value.times(10.0.pow(6))}"
    private fun millisecondToMicrosecond(value: Double) = "${value.times(1000)}"
    private fun millisecondToSecond(value: Double) = "${value.div(1000)}"
    private fun millisecondToMinute(value: Double) = "${value.div(60000)}"
    private fun millisecondToHour(value: Double) = "${value.div(3.6.times(10.0.pow(6)))}"
    private fun millisecondToDay(value: Double) = "${value.div(8.64.times(10.0.pow(7)))}"
    private fun millisecondToWeek(value: Double) = "${value.div(6.048.times(10.0.pow(8)))}"
    private fun millisecondToMonth(value: Double) = "${value.div(2.628.times(10.0.pow(9)))}"
    private fun millisecondToCalenderYear(value: Double) = "${value.div(3.154.times(10.0.pow(10)))}"
    private fun millisecondToDecade(value: Double) = "${value.div(3.154.times(10.0.pow(11)))}"
    private fun millisecondToCentury(value: Double) = "${value.div(3.154.times(10.0.pow(12)))}"


    //SECOND to Any..
    private fun secondToNanosecond(value: Double) = "${value.times(10.0.pow(9))}"
    private fun secondToMicrosecond(value: Double) = "${value.times(10.0.pow(6))}"
    private fun secondToMilli(value: Double) = "${value.times(1000)}"
    private fun secondToMinute(value: Double) = "${value.div(60)}"
    private fun secondToHour(value: Double) = "${value.div(3600)}"
    private fun secondToDay(value: Double) = "${value.div(86400)}"
    private fun secondToWeek(value: Double) = "${value.div(604800)}"
    private fun secondToMonth(value: Double) = "${value.div(2.628.times(10.0.pow(6)))}"
    private fun secondToCalenderYear(value: Double) = "${value.div(3.154.times(10.0.pow(7)))}"
    private fun secondToDecade(value: Double) = "${value.div(3.154.times(10.0.pow(8)))}"
    private fun secondToCentury(value: Double) = "${value.div(3.154.times(10.0.pow(9)))}"

    //MINUTE to Any..
    private fun minuteToNanosecond(value: Double) = "${value.times(6.0.times(10.0.pow(10)))}"
    private fun minuteToMicrosecond(value: Double) = "${value.times(6.0.times(10.0.pow(7)))}"
    private fun minuteToMilli(value: Double) = "${value.times(60000)}"
    private fun minuteToSecond(value: Double) = "${value.times(60)}"
    private fun minuteToHour(value: Double) = "${value.div(60)}"
    private fun minuteToDay(value: Double) = "${value.div(1440)}"
    private fun minuteToWeek(value: Double) = "${value.div(10080)}"
    private fun minuteToMonth(value: Double) = "${value.div(43800)}"
    private fun minuteToCalenderYear(value: Double) = "${value.div(525600)}"
    private fun minuteToDecade(value: Double) = "${value.div(5.256.times(10.0.pow(6)))}"
    private fun minuteToCentury(value: Double) = "${value.div(5.256.times(10.0.pow(7)))}"

    //HOUR to Any..
    private fun hourToNanosecond(value: Double) = "${value.times(3.6.times(10.0.pow(12)))}"
    private fun hourToMicrosecond(value: Double) = "${value.times(3.6.times(10.0.pow(9)))}"
    private fun hourToMilli(value: Double) = "${value.times(3.6.times(10.0.pow(6)))}"
    private fun hourToSecond(value: Double) = "${value.times(3600)}"
    private fun hourToMinute(value: Double) = "${value.times(60)}"
    private fun hourToDay(value: Double) = "${value.div(24)}"
    private fun hourToWeek(value: Double) = "${value.div(168)}"
    private fun hourToMonth(value: Double) = "${value.div(730)}"
    private fun hourToCalenderYear(value: Double) = "${value.div(8760)}"
    private fun hourToDecade(value: Double) = "${value.div(87600)}"
    private fun hourToCentury(value: Double) = "${value.div(876000)}"

    //Day to Any..
    private fun dayToNanosecond(value: Double) = "${value.times(8.64.times(10.0.pow(13)))}"
    private fun dayToMicrosecond(value: Double) = "${value.times(8.64.times(10.0.pow(10)))}"
    private fun dayToMilli(value: Double) = "${value.times(8.64.times(10.0.pow(7)))}"
    private fun dayToSecond(value: Double) = "${value.times(86400)}"
    private fun dayToMinute(value: Double) = "${value.times(1440)}"
    private fun dayToHour(value: Double) = "${value.times(24)}"
    private fun dayToWeek(value: Double) = "${value.div(7)}"
    private fun dayToMonth(value: Double) = "${value.div(30.417)}"
    private fun dayToCalenderYear(value: Double) = "${value.div(365)}"
    private fun dayToDecade(value: Double) = "${value.div(3650)}"
    private fun dayToCentury(value: Double) = "${value.div(36500)}"

    //Week to Any..
    private fun weekToNanosecond(value: Double) = "${value.times(6.048.times(10.0.pow(14)))}"
    private fun weekToMicrosecond(value: Double) = "${value.times(6.048.times(10.0.pow(11)))}"
    private fun weekToMilli(value: Double) = "${value.times(6.048.times(10.0.pow(8)))}"
    private fun weekToSecond(value: Double) = "${value.times(604800)}"
    private fun weekToMinute(value: Double) = "${value.times(10080)}"
    private fun weekToHour(value: Double) = "${value.times(168)}"
    private fun weekToDay(value: Double) = "${value.times(7)}"
    private fun weekToMonth(value: Double) = "${value.div(4.345)}"
    private fun weekToCalenderYear(value: Double) = "${value.div(52.143)}"
    private fun weekToDecade(value: Double) = "${value.div(521.4)}"
    private fun weekToCentury(value: Double) = "${value.div(5214)}"

    //Month to Any..
    private fun monthToNanosecond(value: Double) = "${value.times(2.628.times(10.0.pow(14)))}"
    private fun monthToMicrosecond(value: Double) = "${value.times(2.628.times(10.0.pow(12)))}"
    private fun monthToMilli(value: Double) = "${value.times(2.628.times(10.0.pow(9)))}"
    private fun monthToSecond(value: Double)= "${value.times(2.628.times(10.0.pow(6)))}"
    private fun monthToMinute(value: Double) = "${value.times(43800)}"
    private fun monthToHour(value: Double) = "${value.times(730)}"
    private fun monthToDay(value: Double) = "${value.times(30.417)}"
    private fun monthToWeek(value: Double) = "${value.times(4.345)}"
    private fun monthToCalenderYear(value: Double) = "${value.div(12)}"
    private fun monthToDecade(value: Double) = "${value.div(120)}"
    private fun monthToCentury(value: Double) = "${value.div(1200)}"

    //CalenderYear to Any..
    private fun calenderYearToNanosecond(value: Double) = "${value.times(3.154.times(10.0.pow(16)))}"
    private fun calenderYearToMicrosecond(value: Double) = "${value.times(3.154.times(10.0.pow(13)))}"
    private fun calenderYearToMilli(value: Double) = "${value.times(3.154.times(10.0.pow(10)))}"
    private fun calenderYearToSecond(value: Double)= "${value.times(3.154.times(10.0.pow(7)))}"
    private fun calenderYearToMinute(value: Double) = "${value.times(525600)}"
    private fun calenderYearToHour(value: Double) = "${value.times(8760)}"
    private fun calenderYearToDay(value: Double) = "${value.times(365)}"
    private fun calenderYearToWeek(value: Double) = "${value.times(52.143)}"
    private fun calenderYearToMonth(value: Double) = "${value.times(12)}"
    private fun calenderYearToDecade(value: Double) = "${value.div(10)}"
    private fun calenderYearToCentury(value: Double) = "${value.div(100)}"

    //Decade to Any..
    private fun decadeToNanosecond(value: Double) = "${value.times(3.154.times(10.0.pow(17)))}"
    private fun decadeToMicrosecond(value: Double) = "${value.times(3.154.times(10.0.pow(14)))}"
    private fun decadeToMilli(value: Double) = "${value.times(3.154.times(10.0.pow(11)))}"
    private fun decadeToSecond(value: Double)= "${value.times(3.154.times(10.0.pow(8)))}"
    private fun decadeToMinute(value: Double) =  "${value.times(3.154.times(10.0.pow(6)))}"
    private fun decadeToHour(value: Double) = "${value.times(87600)}"
    private fun decadeToDay(value: Double) = "${value.times(3650)}"
    private fun decadeToWeek(value: Double) = "${value.times(521.4)}"
    private fun decadeToMonth(value: Double) = "${value.times(120)}"
    private fun decadeToCalenderYear(value: Double) = "${value.times(10)}"
    private fun decadeToCentury(value: Double) = "${value.div(10)}"

    //Century to Any..
    private fun centuryToNanosecond(value: Double) = "${value.times(3.154.times(10.0.pow(18)))}"
    private fun centuryToMicrosecond(value: Double) = "${value.times(3.154.times(10.0.pow(15)))}"
    private fun centuryToMilli(value: Double) = "${value.times(3.154.times(10.0.pow(12)))}"
    private fun centuryToSecond(value: Double)= "${value.times(3.154.times(10.0.pow(9)))}"
    private fun centuryToMinute(value: Double) =  "${value.times(3.154.times(10.0.pow(7)))}"
    private fun centuryToHour(value: Double) = "${value.times(876000)}"
    private fun centuryToDay(value: Double) = "${value.times(36500)}"
    private fun centuryToWeek(value: Double) = "${value.times(5214)}"
    private fun centuryToMonth(value: Double) = "${value.times(1200)}"
    private fun centuryToCalenderYear(value: Double) = "${value.times(100)}"
    private fun centuryToDecade(value: Double) = "${value.times(10)}"
}