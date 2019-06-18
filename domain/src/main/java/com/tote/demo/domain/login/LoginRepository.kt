package com.tote.demo.domain.login

import com.tote.demo.commons.Either

interface LoginRepository {

    suspend fun login(username: String, password: String): Either<LoginFailure, LoginResponse>

}
