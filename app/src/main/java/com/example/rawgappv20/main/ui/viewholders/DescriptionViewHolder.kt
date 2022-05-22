package com.example.rawgappv20.main.ui.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rawgappv20.R
import com.example.rawgappv20.common.basemvp.BaseViewHolder
import com.example.rawgappv20.databinding.DescriptionItemBinding
import com.example.rawgappv20.databinding.ItemImagesBinding
import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.main.ui.MainAdapter

class DescriptionViewHolder(
    private val binding: DescriptionItemBinding,
    private val onClicked: (MainGames) -> Unit
    ):
RecyclerView.ViewHolder(binding.root){

    private val mainAdapter: MainAdapter by lazy {
        MainAdapter(onClick = onClicked)
    }

    constructor(
        parent: ViewGroup,
        onClicked: (MainGames) -> Unit
    ) : this(
        DescriptionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
        onClicked
    )

    fun bind(item: MainGames.Description) {
       with(binding){
           Glide.with(descriptionImage)
               .load(item.image)
               .placeholder(R.drawable.logo)
               .error(R.drawable.logo)
               .into(descriptionImage)
           descriptionName.text = item.name
           metacriticDescription.text = when (item.metacritic) {
               0 -> "none"
               null -> "none"
               else -> item.metacritic.toString()
           }
           itemView.setOnClickListener {onClicked.invoke(item)}
       }
    }
}