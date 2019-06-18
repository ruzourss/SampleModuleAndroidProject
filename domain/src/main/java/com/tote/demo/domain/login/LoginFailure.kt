package com.tote.demo.domain.login

sealed class LoginFailure {

    object Unauthorized : LoginFailure()

}
