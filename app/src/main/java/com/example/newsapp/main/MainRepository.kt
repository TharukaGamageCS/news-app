package com.example.newsapp.main

import com.example.newsapp.data.local.UserDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

class MainRepository @Inject constructor(private val userDao: UserDao) {

    fun getLoginStatus(): Flow<Result<Boolean>> {
        return flow {
            val user = userDao.getAll()[0]
            emit(Result.success(user.isLoggedIn))
        }
    }

}
