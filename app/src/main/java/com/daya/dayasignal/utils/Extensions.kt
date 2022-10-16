package com.daya.dayasignal.utils

import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity


inline fun AppCompatActivity.onBack(crossinline fn: () -> Unit) {
    onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            fn()
        }
    })
}

fun AppCompatActivity.backCalled() = onBackPressedDispatcher.onBackPressed()
