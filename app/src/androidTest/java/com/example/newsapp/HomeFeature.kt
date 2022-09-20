package com.example.newsapp

import com.adevinta.android.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import org.junit.Test

class HomeFeature: BaseAndroidTest() {

    @Test
    fun showsHomeScreenWithSearchBar(){
        assertDisplayed(R.id.til_search)
    }

}