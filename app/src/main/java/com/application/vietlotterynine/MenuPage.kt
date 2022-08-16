package com.application.vietlotterynine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuPage : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Details>

    //    private lateinit var imageId : Array<Int>
    private lateinit var heading: Array<String>
    private lateinit var briefNews: Array<String>

    private var btnN: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)

        btnN = findViewById(R.id.btnN)
        btnN?.setOnClickListener{
            onBackPressed()}

            heading = arrayOf(
                getString(R.string.m1),
                getString(R.string.m2),
                getString(R.string.m3)
            )
            briefNews = arrayOf(
                getString(R.string.m11),
                getString(R.string.m22),
                getString(R.string.m33)
            )
            newRecyclerView = findViewById(R.id.recyclerItems)
            newRecyclerView.layoutManager = LinearLayoutManager(this)
            newRecyclerView.setHasFixedSize(true)

            newArrayList = arrayListOf<Details>()
            getUserdata()
        }
    private fun getUserdata() {
        for (i in heading.indices) {

            val news = Details(heading[i], briefNews[i])
            newArrayList.add(news)
        }
        val adapter = MyAdapter2(newArrayList)
        newRecyclerView.adapter = adapter
    }
}