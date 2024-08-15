package com.teamsparta.studykotlin.study

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class StudyTest {

    private fun createUser(): Any {
    }

    @Test
    fun `회원의 비밀번호와 다를 경우 예외가 발생한다`(){
        val user = createUser()
        assertThrows<UnidentifiedUserException> {
            user.authenticate("wrong password")
        }
    }
}