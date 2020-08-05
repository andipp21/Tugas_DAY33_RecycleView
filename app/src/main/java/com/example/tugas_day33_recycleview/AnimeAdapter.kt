package com.example.tugas_day33_recycleview
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.anime_item.view.*

class AnimeAdapter(val listAnime: ArrayList<Anime>): RecyclerView.Adapter<AnimeAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.anime_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAnime.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tvJudul.setText(listAnime[position].judul)
        holder.itemView.tvGenre.setText(listAnime[position].genre)
        holder.itemView.tvJEpisode.setText(listAnime[position].jEpisode.toString())
    }


}