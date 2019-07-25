package com.tote.demo.examplemoduleproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tote.demo.domain.login.LoginRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val loginRepository: LoginRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.async {
            loginRepository.login("","")
        }

    }

}
