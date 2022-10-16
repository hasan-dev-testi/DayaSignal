package com.daya.dayapush

import android.content.Context
import com.onesignal.OneSignal

object PushInitializer {

    private const val ONESIGNAL_APP_ID = "606a40bb-d231-443b-bf84-0ff470972acb"

    fun initDayaPush(context: Context) {
        setLogLevel()
        initWithContext(context)
        setAppId()
    }

    private fun setLogLevel() = OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
    private fun initWithContext(context: Context) = OneSignal.initWithContext(context)
    private fun setAppId() = OneSignal.setAppId(ONESIGNAL_APP_ID)

}

