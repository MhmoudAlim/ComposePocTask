package com.mahmoudalim.data.enums

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

enum class AuthorType(val value: String) {
    USER("user"),
    RESTAURANT("restaurant");

    companion object {
        fun fromType(value: String?): AuthorType {
            if (value == null) return USER
            return values()
                .firstOrNull { it.value == value } ?: USER
        }
    }
}