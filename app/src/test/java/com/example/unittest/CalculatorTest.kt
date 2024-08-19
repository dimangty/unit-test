package com.example.unittest

import com.example.dz.Calculator
import org.junit.Assert
import org.junit.Test

class CalculatorTest {
    @Test
    fun testAdd() {
        val calculator = Calculator()
        val expected = 10
        Assert.assertEquals(expected, calculator.add(5,5))
    }

    @Test
    fun testSub() {
        val calculator = Calculator()
        val expected = 5
        Assert.assertEquals(expected, calculator.sub(15,10))
    }
}