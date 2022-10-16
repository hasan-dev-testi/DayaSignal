package com.daya.dayapush

import android.app.Activity
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity


fun Activity.toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()


inline fun AppCompatActivity.onBack(crossinline fn: () -> Unit) {
    onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            fn()
        }
    })
}

fun AppCompatActivity.backCalled() = onBackPressedDispatcher.onBackPressed()