package com.explorigin.host

import android.app.Application
import com.sensorsdata.analytics.android.sdk.SAConfigOptions
import com.sensorsdata.analytics.android.sdk.SensorsAnalyticsAutoTrackEventType
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI


class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (ProcessUtils.isMainProcess(this)) {
            initSensors()
        }
    }

    fun initSensors() {
        val SA_SERVER_URL = "数据接收地址"
        val saConfigOptions = SAConfigOptions(SA_SERVER_URL)
        saConfigOptions.setAutoTrackEventType(
            SensorsAnalyticsAutoTrackEventType.APP_CLICK or
                    SensorsAnalyticsAutoTrackEventType.APP_START or
                    SensorsAnalyticsAutoTrackEventType.APP_END or
                    SensorsAnalyticsAutoTrackEventType.APP_VIEW_SCREEN
        ).enableLog(true)
        SensorsDataAPI.startWithConfigOptions(this, saConfigOptions)
        SensorsDataAPI.sharedInstance().track("SDKInit")
    }
}