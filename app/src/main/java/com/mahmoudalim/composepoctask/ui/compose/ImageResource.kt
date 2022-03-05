package com.mahmoudalim.composepoctask.ui.compose

import android.content.Context

object ImageResource {

    fun getIdentifier(context: Context, resName: String) =
        context.resources.getIdentifier(
            resName,
            "drawable",
            context.packageName
        )

}