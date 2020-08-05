package com.example.tugas_day33_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAnime = arrayListOf(
            Anime("Kimi No Nawa","Drama", 1),
            Anime("Sword Art Online", "Action", 24),
            Anime("Touch", "Sport", 52),
            Anime("Capeta","Racing", 36)
        )

        val adapter = AnimeAdapter(listAnime)

        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val gridLayoutManager = GridLayoutManager(this,3, GridLayoutManager.VERTICAL,false)

        val grid = radioBTNGrid.id
        val linear = radioBTNLiniear.id

        radioBTN.setOnCheckedChangeListener { group, i ->
            val radio: RadioButton = findViewById(i)

            if (radio.id == linear){
                recycleView.layoutManager = linearLayoutManager
            } else if (radio.id == grid){
                recycleView.layoutManager = gridLayoutManager
            }

            recycleView.adapter = adapter
        }
    }
}