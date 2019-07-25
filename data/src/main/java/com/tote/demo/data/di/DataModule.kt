package com.tote.demo.data.di

import com.tote.demo.data.login.LoginRepositoryImpl
import com.tote.demo.domain.login.LoginRepository
import org.koin.dsl.module

val dataModule = module {

    single { LoginRepositoryImpl() as LoginRepository }

}
