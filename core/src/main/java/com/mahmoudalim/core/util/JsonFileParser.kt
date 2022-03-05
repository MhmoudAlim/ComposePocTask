package com.mahmoudalim.core.util

import android.content.Context
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

object JsonFileParser {

    private const val CHARSET = "UTF-8"
    private const val JSON_FILE_NAME = "mockResponse.json"

    operator fun invoke(context: Context, fileName: String = JSON_FILE_NAME): String? {

        val jsonString: String = try {
            val stream: InputStream = context.assets.open(fileName)
            val size: Int = stream.available()
            val buffer = ByteArray(size)
            stream.apply {
                read(buffer)
                close()
            }
            String(buffer, Charset.forName(CHARSET))
        } catch (e: IOException) {
            e.printStackTrace()
            return e.message
        }
        return jsonString
    }
}