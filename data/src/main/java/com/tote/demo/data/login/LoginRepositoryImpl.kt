package com.tote.demo.data.login

import com.tote.demo.commons.Either
import com.tote.demo.commons.Either.Left
import com.tote.demo.domain.login.LoginFailure
import com.tote.demo.domain.login.LoginFailure.Unauthorized
import com.tote.demo.domain.login.LoginRepository
import com.tote.demo.domain.login.LoginResponse

class LoginRepositoryImpl : LoginRepository {

    override suspend fun login(username: String, password: String): Either<LoginFailure, LoginResponse> =
        Left(Unauthorized)

}
