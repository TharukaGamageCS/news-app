package com.example.newsapp.home

import com.example.newsapp.data.remote.NewsApi
import com.example.newsapp.data.models.Headline
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class HomeRepository @Inject constructor(private val newsApi: NewsApi) {

    fun getLatestNews(): Flow<Result<List<Headline>?>> {
        return flow {
            val response = newsApi.getHeadlines()
            emit(Result.success(response.body()?.articles))
        }
    }

}