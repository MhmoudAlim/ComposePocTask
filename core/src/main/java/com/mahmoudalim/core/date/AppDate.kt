package com.mahmoudalim.core.date

import org.threeten.bp.Duration
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter


object AppDate {
    enum class Format(val value: String) {
        SERVER_DATE_FORMAT("yyyy-MM-dd H:mm:ss"),
    }

    private fun localDate(date: String, format: Format = Format.SERVER_DATE_FORMAT): LocalDate {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(format.value))
    }

    fun durationInDaysOf(lhs: String): Long {
        val localDate1 = localDate(lhs)
        val localDate2 = LocalDateTime.now()
        return Duration.between(localDate1.atStartOfDay(), localDate2).toDays()
    }

}


