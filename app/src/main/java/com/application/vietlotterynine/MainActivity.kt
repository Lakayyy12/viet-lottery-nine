package com.application.vietlotterynine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.application.vietlotterynine.Navigator.Companion.showInfoDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btn1: TextView? = null
    private var btn2: TextView? = null
    private var btn3: TextView? = null

    private var exit = 0
    private var fab: FloatingActionButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListener()

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener {
            val intent = Intent(this, MenuPage::class.java)
            startActivity(intent)
        }
        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener {
            val intent = Intent(this, GuidePage::class.java)
            startActivity(intent)
        }
        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener {
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }
    }

    private fun initComponents() {
        fab = findViewById(R.id.fab)
    }

    private fun initListener() {
        fab?.setOnClickListener(this)
    }

    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "Nhấp lại để thoát!", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.fab -> showInfoDialog(this)
        }
    }
}