package com.daya.dayasignal

import android.app.Application
import com.daya.dayapush.PushInitializer

class DayaApplications: Application() {

    override fun onCreate() {
        super.onCreate()
        PushInitializer.initDayaPush(this)
    }
}
