package com.example.unittesting

object RegistrationUtil {
    /**
     * the input is not valid if
     * ... the username / password is empty
     * .. the username is already taken
     * ... the confirmedPassword is not the same with the real password
     * ...the password contains less than 3 digits
     * the input must be valid if
     * ... the username and password are correctly fill
     */
    private val existingUsers = listOf("John", "Chike", "Tonye")

    fun validateSignUpInput(
        username: String,
        password: String,
        comfirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != comfirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 3) {
            return false
        }
        return true
    }
}