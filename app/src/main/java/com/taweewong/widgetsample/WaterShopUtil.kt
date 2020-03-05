package com.taweewong.widgetsample

import org.threeten.bp.DayOfWeek
import org.threeten.bp.LocalDate
import org.threeten.bp.Year
import org.threeten.bp.YearMonth
import org.threeten.bp.format.DateTimeFormatter

object WaterShopUtil {
    fun getNextRoundOfWaterShopAsFormat(pattern: String = "dd/MM/yyyy"): String {
        val thursday = getNextRoundOfWaterShop()
        thursday?.let {
            return thursday.format(DateTimeFormatter.ofPattern(pattern))
        }
        return ""
    }

    fun getNextRoundOfWaterShop(): LocalDate? {
        val today = LocalDate.now()
        for (count in 0 .. findAllThursdayThisYear().size) {
            val thursday = findAllThursdayThisYear()[count]
            if ((today.isBefore(thursday) or today.isEqual(thursday)) and count.isEven()) {
                return thursday
            }
        }
        return null
    }

    fun findRangeToNextRound(): Int {
        val today = LocalDate.now()
        val nextRound = getNextRoundOfWaterShop()
        nextRound?.let {
            return today.until(nextRound).days
        }
        return -1
    }

    private fun findAllThursdayThisYear(): ArrayList<LocalDate> {
        val thursdayList = arrayListOf<LocalDate>()
        for (month in 1 until 12) {
            thursdayList.addAll(getThursdayInMonth(Year.now().atMonth(month)))
        }
        return thursdayList
    }

    private fun getThursdayInMonth(month: YearMonth): ArrayList<LocalDate> {
        val thursdayList =  arrayListOf<LocalDate>()
        for (day in 1 until month.lengthOfMonth()) {
            val date = month.atDay(day)
            if (date.dayOfWeek == DayOfWeek.THURSDAY) {
                thursdayList.add(date)
            }
        }
        return thursdayList
    }
}