package com.example.rawgappv20.main.ui.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rawgappv20.R
import com.example.rawgappv20.databinding.ItemHorizontalBinding
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.ui.adapters.NestedAdapter

class GamesViewHolder(
    private val binding: ItemHorizontalBinding,
    private val onClick: (Results) -> Unit,
) :
    RecyclerView.ViewHolder(binding.root) {

    constructor(
        parent: ViewGroup,
        onClick: (Results) -> Unit,
    ) : this(
        ItemHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false),
        onClick
    )

    fun bind(item: Results) {
        with(binding) {
            Glide.with(ivGameIcon)
                .load(item.backgroundImage)
                .placeholder(R.drawable.logo)
                .error(R.drawable.logo)
                .into(ivGameIcon)
            tvName.text = item.name
        }
    }


    fun detach() {
        Glide.with(itemView).clear(binding.ivGameIcon)
    }


}