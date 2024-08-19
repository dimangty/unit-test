package com.example.dz

import java.util.regex.Pattern

class EmailValidator {

    companion object {
        private val EMAIL_PATTERN = Pattern.compile("(?=^.{1,320}$)(?=^[\\S]+@[\\S]{1,255}$)(^[A-Za-z0-9!#$%&’;+\\-.=?^_`{}½~]{1,64}@[A-Za-z0-9.\\-’]+\\.[A-Za-z0-9.\\-]+[A-Za-z0-9]+$)",
            Pattern.CASE_INSENSITIVE
        )

        fun isValidEmail(email: CharSequence?): Boolean {
            return email != null && EMAIL_PATTERN.matcher(email).matches()
        }
    }



}