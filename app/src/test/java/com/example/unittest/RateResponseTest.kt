package com.example.unittest

import com.example.dz.RateResponse
import com.google.gson.Gson
import org.junit.Assert
import org.junit.Test

class RateResponseTest {

    private val jsonResponse = """
        {
            "data": {
                "id": "bitcoin",
                "symbol": "BTC",
                "currencySymbol": "$",
                "rateUsd": "45000.00"
            }
        }
    """

    @Test
    fun `test parsing of JSON response`() {
        val gson = Gson()
        val rateResponse = gson.fromJson(jsonResponse, RateResponse::class.java)

        Assert.assertEquals("bitcoin", rateResponse.data.id)
        Assert.assertEquals("BTC", rateResponse.data.symbol)
        Assert.assertEquals("$", rateResponse.data.currencySymbol)
        Assert.assertEquals("45000.00", rateResponse.data.rateUsd)
    }
}