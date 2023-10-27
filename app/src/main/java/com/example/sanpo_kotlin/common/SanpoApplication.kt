package com.example.sanpo_kotlin.common

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SanpoApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        //Logger init
        Logger.addLogAdapter(AndroidLogAdapter())
    }
}