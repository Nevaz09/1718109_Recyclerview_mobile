package com.example.a1718109_recyclerview_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val musicList = listOf<Music>(
            Music(
                R.drawable.gitar,
                nameMusic = "Alat Musik Gitar",
                descMusic = "Gitar adalah sebuah alat musik berdawai yang dipertontonkan dengan cara dipetik."
            ),
            Music(
                R.drawable.bass,
                nameMusic = "Alat Musik Gitar Bas Elektrik",
                descMusic = "Gitar Bas adalah alat musik dawai yang menggunakan listrik untuk memperbesar suaranya, umumnya memiliki empat senar."
            ),
            Music(
                R.drawable.drum,
                nameMusic = "Alat Musik Drum",
                descMusic = "Drum adalah kelompok alat musik perkusi yang terdiri dari kulit yang direntangkan dan dipukul dengan sebuah batang atau tangan."
            ),
            Music(
                R.drawable.piano,
                nameMusic = "Alat Musik Piano",
                descMusic = "Piano adalah alat musik tuts yang diklarifikasikan sebagai instrument dawai dan perkusi yang dimainkan dengan menekan tuts-tuts pada papan piano"
            ),
            Music(
                R.drawable.biola,
                nameMusic = "Alat Musik Biola",
                descMusic = "Biola adalah alat musik dawai yang dimainkan dengan cara digesek dan memiliki empat senar yang disetel berbeda satu sama lain dengan interval sempurna kelima"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_music)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MusicAdapter(this,musicList){

        }
    }
}