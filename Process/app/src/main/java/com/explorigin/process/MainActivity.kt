package com.explorigin.process

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv_broad).setOnClickListener {
            val intentFilter = Intent()
            intentFilter.action = "com.dsw.exploring"
            this@MainActivity.sendBroadcast(intentFilter)
        }
    }
}