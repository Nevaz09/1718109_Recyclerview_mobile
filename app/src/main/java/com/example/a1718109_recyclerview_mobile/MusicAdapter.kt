package com.example.a1718109_recyclerview_mobile

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter (private val context: Context, private val music: List<Music>, val listener: (Music) -> Unit)
    : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>(){
    class MusicViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        val  imgMusic = view.findViewById<ImageView>(R.id.img_item_photo)
        val  nameMusic = view.findViewById<TextView>(R.id.tv_item_name)
        val  descMusic = view.findViewById<TextView>(R.id.tv_item_desc)

        fun bindView(music: Music, listener: (Music) -> Unit){
            imgMusic.setImageResource(music.imgMusic)
            nameMusic.text = music.nameMusic
            descMusic.text = music.descMusic
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_musik, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bindView(music[position], listener)
    }

    override fun getItemCount(): Int = music.size
    }
