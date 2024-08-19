package com.example.unittest

import com.example.dz.ApiService
import com.example.dz.RateData
import com.example.dz.RateResponse
import com.google.gson.Gson
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

class ApiServiceTest {
    private val mockApiService = mock(ApiService::class.java)
    @Test
    fun testFetch() = runBlocking {
        val fakeResponse = RateResponse(RateData("bitcoin", "BTC", "$", "45000.00"))
        `when`(mockApiService.getBitcoinRate()).thenReturn(fakeResponse)

        val result = mockApiService.getBitcoinRate()
        assertEquals("45000.00", result.data.rateUsd)
    }
}