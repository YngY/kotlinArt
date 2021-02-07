package com.yy.kotlinart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
        //master才有这个方法
    }
}