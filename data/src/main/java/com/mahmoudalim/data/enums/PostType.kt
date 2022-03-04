package com.mahmoudalim.data.enums

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

enum class PostType(val value: String) {
    SINGLE("single"),
    NESTED("nested");

    companion object {
        fun fromType(value: String?): PostType {
            if (value == null) return SINGLE
            return values()
                .firstOrNull { it.value == value } ?: SINGLE
        }
    }
}