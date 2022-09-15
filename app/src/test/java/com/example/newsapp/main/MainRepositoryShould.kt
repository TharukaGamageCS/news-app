package com.example.newsapp.main

import com.example.newsapp.BaseUnitTest
import com.example.newsapp.data.local.UserDao
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.mockito.Mockito.*

class MainRepositoryShould: BaseUnitTest() {

    private lateinit var repository:MainRepository
    private val userDao:UserDao = mock(UserDao::class.java)

    @Test
    fun callUserDaoGetAll() = runTest {

        repository = MainRepository(userDao)

        repository.getLoginStatus().firstOrNull()
        verify(userDao, times(1)).getAll()

    }

}