package com.example.newsapp.home

import com.example.newsapp.BaseUnitTest
import com.example.newsapp.data.models.Headline
import com.example.newsapp.utils.getValueForTest
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

class HomeViewModelShould: BaseUnitTest() {

    private lateinit var viewModel: HomeViewModel
    private val repository:HomeRepository = mock(HomeRepository::class.java)

    private val headlineList:List<Headline> = mock(listOf<Headline>()::class.java)

    @Before
    fun setup(){
        viewModel = HomeViewModel(repository)
    }

    private fun mockSuccessfulCase() {
        `when`(repository.getLatestNews()).then {
            flow {
                emit(Result.success(headlineList))
            }
        }
    }

    @Test
    fun callToGetLatestNews(){
        viewModel.headlines.getValueForTest()
        verify(repository, times(1)).getLatestNews()
    }

    @Test
    fun emitPagingDataOfHeadline() = runTest {
        mockSuccessfulCase()
        assertEquals(headlineList, viewModel.headlines.getValueForTest()?.getOrNull())
    }

}