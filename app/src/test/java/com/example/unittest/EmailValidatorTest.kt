package com.example.unittest

import com.example.dz.EmailValidator
import org.junit.Assert
import org.junit.Test

class EmailValidatorTest {
    @Test
    fun testEmailTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("asd@mail.com"))
    }

    @Test
    fun testEmailFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("asd@mail"))
    }

    @Test
    fun testEmailEmpty() {
        Assert.assertFalse(EmailValidator.isValidEmail(""))
    }
}