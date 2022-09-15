package com.example.newsapp.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
import com.example.newsapp.data.models.Headline

class HomeViewModel(private val repository: HomeRepository): ViewModel() {

    val headlines:LiveData<Result<List<Headline>?>> = liveData {
        emitSource(repository.getLatestNews().asLiveData())
    }

}
