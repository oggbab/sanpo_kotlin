package com.example.sanpo_kotlin.common.screen

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.orhanobut.logger.Logger

class BaseActivity: AppCompatActivity() {
    private val _callback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            // TODO: BackPressed 처리
            Logger.e("backPressed !")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.onBackPressedDispatcher.addCallback(this, _callback)
    }
}