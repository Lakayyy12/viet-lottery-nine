package com.application.vietlotterynine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.application.vietlotterynine.Navigator.Companion.openPage

class GuidePage : AppCompatActivity(), View.OnClickListener {

    private var btnG1 : TextView? = null
    private var btnG2 : TextView? = null
    private var btnG3 : TextView? = null
    private var btnG4 : TextView? = null
    private var btnG5 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_page)
        initComponents()
        initListener()
    }
    private fun initComponents(){
        btnG1 = findViewById(R.id.btnG1)
        btnG2 = findViewById(R.id.btnG2)
        btnG3 = findViewById(R.id.btnG3)
        btnG4 = findViewById(R.id.btnG4)
        btnG5 = findViewById(R.id.btnG5)
    }
    private fun initListener(){
        btnG1?.setOnClickListener(this)
        btnG2?.setOnClickListener(this)
        btnG3?.setOnClickListener(this)
        btnG4?.setOnClickListener(this)
        btnG5?.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnG1 -> openPage(this, GuideContent::class.java, btnG1?.text.toString(), "${getString(R.string.gt1)} ${getString(R.string.gt11)}")
            R.id.btnG2 -> openPage(this, GuideContent::class.java, btnG2?.text.toString(), "${getString(R.string.gt2)} ${getString(R.string.gt22)}")
            R.id.btnG3 -> openPage(this, GuideContent::class.java, btnG3?.text.toString(), "${getString(R.string.gt3)} ${getString(R.string.gt33)}")
            R.id.btnG4 -> openPage(this, GuideContent::class.java, btnG4?.text.toString(), "${getString(R.string.gt4)} ${getString(R.string.gt44)}")
            R.id.btnG5 -> openPage(this, GuideContent::class.java, btnG5?.text.toString(), "${getString(R.string.gt5)} ${getString(R.string.gt55)}")
        }
    }
}