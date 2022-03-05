package com.mahmoudalim.data.repo

import com.mahmoudalim.data.data_source.FeedsLocalDataSrc
import com.mahmoudalim.data.models.Response

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */
class FeedsRepo(private val feedsLocalDataSrc: FeedsLocalDataSrc) {

     fun fetchNewsFeedData() : Response {
        return feedsLocalDataSrc.getNewsFeedResponse()
    }

}