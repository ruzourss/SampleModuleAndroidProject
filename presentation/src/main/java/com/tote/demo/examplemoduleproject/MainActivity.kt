package com.tote.demo.examplemoduleproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tote.demo.commons.Either.Left
import com.tote.demo.commons.Either.Right
import com.tote.demo.domain.login.LoginRepository
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val loginRepository: LoginRepository by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener {
            login()
        }
    }

    private fun login() {
        val deferred = GlobalScope.async(Dispatchers.IO, CoroutineStart.DEFAULT) {
            loginRepository.login("mock", "mock")
        }

        GlobalScope.launch(Dispatchers.Main, CoroutineStart.DEFAULT) {
            deferred.await().let {
                when (it) {
                    is Left -> text_view.text = "Login failure..."
                    is Right -> text_view.text = "Login success, welcome ${it.b.username}"
                }
            }
        }
    }

}
