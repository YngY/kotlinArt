package com.yy.kotlinart

import android.app.Application
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi

class App :Application() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate() {
        super.onCreate()
        Log.d("Application","onCreate 进程:${getProcessName()}")
    }
}