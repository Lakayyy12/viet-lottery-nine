package com.application.vietlotterynine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class GuideContent : AppCompatActivity(){

    private var title : TextView? = null
    private var content : TextView? = null
    private var close : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_content)

        title = findViewById(R.id.title)
        content = findViewById(R.id.content)

        title?.text = intent.getStringExtra("title")
        content?.text = intent.getStringExtra("content")

        close = findViewById(R.id.close)
        close?.setOnClickListener {
            onBackPressed()
        }
    }
    }

