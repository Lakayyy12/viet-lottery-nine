package com.application.vietlotterynine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class AboutPage : AppCompatActivity() {

    private var back : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        back = findViewById(R.id.back)
        back?.setOnClickListener{
            onBackPressed()
        }
    }
}