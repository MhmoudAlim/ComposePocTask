package com.mahmoudalim.data.data_source

import android.content.Context
import com.google.gson.Gson
import com.mahmoudalim.data.models.Response
import com.mahmoudalim.core.util.JsonFileParser

/**
 * Created by Mahmoud Alim on 05/03/2022.
 */

class FeedsLocalDataSrc(private val jsonFileParser: JsonFileParser, private val context: Context) {

    fun getNewsFeedResponse(): Response {
        val responseString = jsonFileParser(context)
        return Gson().fromJson(responseString, Response::class.java)
    }


}