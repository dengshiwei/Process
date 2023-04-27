package com.explorigin.host

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Log.i("Exploring", "onReceive")
        val intentFilter = Intent()
        intentFilter.action = "com.dsw.service"
        intentFilter.setPackage(context.packageName)
        context.startService(intentFilter)
    }
}