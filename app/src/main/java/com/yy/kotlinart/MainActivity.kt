package com.yy.kotlinart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contenxt: MainActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contenxt = this
        var intent:Intent
        tvA.setOnClickListener { startActivity(Intent(contenxt,BActivity::class.java)) }
    }
}