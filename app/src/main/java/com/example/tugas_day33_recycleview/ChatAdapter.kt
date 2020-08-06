package com.example.tugas_day33_recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.chat_item.view.*

class ChatAdapter(val listChat: ArrayList<ChatWA>): RecyclerView.Adapter<ChatAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_item, parent, false)

        return ChatAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listChat.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var img = holder.itemView.ivProfile

        Glide.with(holder.itemView.context).load(listChat[position].img).circleCrop().into(img)

        holder.itemView.tvUser.setText(listChat[position].user)
        holder.itemView.tvChat.setText(listChat[position].chat)
        holder.itemView.tvTime.setText(listChat[position].time)
    }


}