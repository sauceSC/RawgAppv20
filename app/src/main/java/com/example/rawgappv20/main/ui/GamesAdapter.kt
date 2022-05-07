package com.example.rawgappv20.main.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rawgappv20.R
import com.example.rawgappv20.main.model.Results

class GamesAdapter(val onClick: (Results) -> Unit) : RecyclerView.Adapter<GamesAdapter.MyViewHolder>(){
    private val data = mutableListOf<Results>()

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val gameName: TextView = itemView.findViewById(R.id.text)
        private val gameImage: ImageView = itemView.findViewById(R.id.game_image)
        fun bind(results: Results){
            Log.i("###", results.name)
            gameName.text = results.name
            Glide.with(itemView.context).load(results.backgroundImage).into(gameImage)
            itemView.setOnClickListener { onClick.invoke(results) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_images, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = data[position]
        holder.bind(listItem)
    }

    override fun getItemCount() = data.size

    fun setData(list: List<Results>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }
}
