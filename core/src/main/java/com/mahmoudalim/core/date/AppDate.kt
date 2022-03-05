package com.mahmoudalim.core.date

import org.threeten.bp.Duration
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter


object AppDate {
    enum class Format(val value: String) {
        SERVER_DATE_FORMAT("yyyy-MM-dd H:mm:ss"),
        H_mm_ss("HH:MM:ss");
    }

    private fun localDate(date: String, format: Format = Format.SERVER_DATE_FORMAT): LocalDate {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(format.value))
    }

    private fun localDateHours(date: String, format: Format = Format.H_mm_ss): LocalDate {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(format.value))
    }

    fun durationInDaysOf(lhs: String): Long {
        val localDate1 = localDate(lhs)
        val localDate2 = LocalDateTime.now()
        return Duration.between(localDate1.atStartOfDay(), localDate2).toDays()
    }


    fun durationInHoursOf(lhs: String): Long {
        val localDate1 = localDateHours(lhs)
        val localDate2 = LocalDateTime.now()
        return Duration.between(localDate1, localDate2).toHours()
    }

}


