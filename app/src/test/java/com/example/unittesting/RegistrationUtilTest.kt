package com.example.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest() {

    @Test
    fun validateSignUpInput_usernameOrPasswordIsEmpty_returnFalse() {
        val result = RegistrationUtil.validateSignUpInput(
            "",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun validateSignUpInput_usernameAlreadyTaken_returnFalse() {
        val result = RegistrationUtil.validateSignUpInput(
            "Chike",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun validateSignUpInput_confirmedPasswordNotSameAsPassword_returnFalse() {
        val result = RegistrationUtil.validateSignUpInput(
            "Tom",
            "123",
            "123a"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun validateSignUpInput_passwordContainsLessThan3Digits_returnFalse() {
        val result = RegistrationUtil.validateSignUpInput(
            "Daniel",
            "12",
            "12"
        )
        assertThat(result).isFalse()
    }@Test
    fun validateSignUpInput_usernameAndPasswordCorrectlyFilled_returnTrue() {
        val result = RegistrationUtil.validateSignUpInput(
            "Biden",
            "John123",
            "John123"
        )
        assertThat(result).isTrue()
    }
}