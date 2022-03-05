package com.mahmoudalim.core.util

import android.content.Context

object ImageResource {

    fun getIdentifier(context: Context, resName: String) =
        context.resources.getIdentifier(
            resName,
            "drawable",
            context.packageName
        )

}