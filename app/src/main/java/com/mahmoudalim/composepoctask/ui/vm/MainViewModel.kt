package com.mahmoudalim.composepoctask.ui.vm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahmoudalim.data.di.DataManager
import com.mahmoudalim.data.models.Response
import com.mahmoudalim.data.repo.FeedsRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Mahmoud Alim on 04/03/2022.
 */

class MainViewModel(private val dm: DataManager) : ViewModel() {

    var response: Response? by mutableStateOf(null)

    fun loadNewsFeedData() {
        viewModelScope.launch(Dispatchers.IO) {
            response = dm.feedsRepo.fetchNewsFeedData()
        }
    }

}


val mainViewModel = module {
    viewModel { MainViewModel(get()) }
}