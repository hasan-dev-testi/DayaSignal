package com.daya.dayasignal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.daya.dayapush.backCalled
import com.daya.dayapush.onBack
import com.daya.dayapush.toast
import com.daya.dayasignal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.setOnClickListener {
            toast("Hasan's Library is working...")
        }

        onBack { toast("No way to exit") }
    }

}

