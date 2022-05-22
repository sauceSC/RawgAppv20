package com.example.rawgappv20.main.ui.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rawgappv20.R
import com.example.rawgappv20.databinding.ItemImagesBinding
import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.main.ui.MainAdapter

class ImageViewHolder(
    private val binding: ItemImagesBinding,
    private val onClicked: (MainGames) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    private val mainAdapter: MainAdapter by lazy {
        MainAdapter(onClick = onClicked)
    }

    constructor(
        parent: ViewGroup,
        onClicked: (MainGames) -> Unit
        ) : this(
        ItemImagesBinding.inflate(LayoutInflater.from(parent.context), parent, false),
        onClicked
    )

    fun bind(item: MainGames.Image){
        with(binding){
            Glide.with(gameImage)
                .load(item.image)
                .placeholder(R.drawable.logo)
                .error(R.drawable.logo)
                .into(gameImage)
            tvMetacritic.text = item.metacritic.toString()
            text.text = item.name
            itemView.setOnClickListener {onClicked.invoke(item)}
        }
    }
}