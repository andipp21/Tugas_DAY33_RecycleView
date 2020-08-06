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

        val listChatWA = arrayListOf(
            ChatWA("Abdi","Mas dimana?","19:30", R.drawable.img_avatar),
            ChatWA("Usin","Makan Yok","18:30", R.drawable.img_avatar_dua),
            ChatWA("Udin Banjar","Bagi Jawaban Yang kemarin","18:25", R.drawable.img_avatar),
            ChatWA("RodaLink","Promo sepeda hari ini ...","17:56", R.drawable.img_avatar_dua),
            ChatWA("Ratri","Cuy jangan lupa skripsi uee yak","kemarin", R.drawable.img_avatar),
            ChatWA("Abimayu","Shooting jadi?","kemarin", R.drawable.img_avatar_dua),
            ChatWA("Roda Sepeda","bisa nego ga?","kemarin", R.drawable.img_avatar),
            ChatWA("Animeindo","Update anime terbaru","04/08/20", R.drawable.img_avatar_dua),
            ChatWA("Bukan Nekopoi","masih nonton hentai? tobat bor","04/08/20", R.drawable.img_avatar),
            ChatWA("dokter hewan","ANJING KAMU","01/08/20", R.drawable.img_avatar_dua),
            ChatWA("Roda Sepeda","bisa nego ga?","01/08/20", R.drawable.img_avatar)
        )

        val adapter = AnimeAdapter(listAnime)

        val adapterChat = ChatAdapter(listChatWA)

        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val gridLayoutManager = GridLayoutManager(this,3, GridLayoutManager.HORIZONTAL,false)

        val grid = radioBTNGrid.id
        val linear = radioBTNLiniear.id

        recycleView.layoutManager = linearLayoutManager
        recycleView.adapter = adapterChat

        radioBTN.setOnCheckedChangeListener { group, i ->
            val radio: RadioButton = findViewById(i)

            if (radio.id == linear){
                recycleView.layoutManager = linearLayoutManager
                recycleView.adapter = adapterChat
            } else if (radio.id == grid){
                recycleView.layoutManager = gridLayoutManager
                recycleView.adapter = adapter
            }


        }
    }
}