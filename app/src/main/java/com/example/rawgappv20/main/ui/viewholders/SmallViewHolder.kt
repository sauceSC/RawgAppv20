package com.example.rawgappv20.main.ui.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rawgappv20.R
import com.example.rawgappv20.common.basemvp.BaseViewHolder
import com.example.rawgappv20.databinding.ItemImagesBinding
import com.example.rawgappv20.databinding.ItemLittleImagesBinding
import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.main.ui.MainAdapter

class SmallViewHolder(
    private val binding: ItemLittleImagesBinding,
    private val onClicked: (MainGames) -> Unit
):
    RecyclerView.ViewHolder(binding.root) {


    private val mainAdapter: MainAdapter by lazy {
        MainAdapter(onClick = onClicked)
    }

    constructor(
        parent: ViewGroup,
        onClicked: (MainGames) -> Unit
    ) : this(
        ItemLittleImagesBinding.inflate(LayoutInflater.from(parent.context), parent, false),
        onClicked
    )

    fun bind(item: MainGames.SmallImage) {
        with(binding){
            Glide.with(littleImage)
                .load(item.image)
                .placeholder(R.drawable.logo)
                .error(R.drawable.logo)
                .into(littleImage)
            tvMetacriticLittle.text = "${item. metacritic}"
            tvLittleName.text = item.name
            itemView.setOnClickListener {onClicked.invoke(item)}
        }
    }
}