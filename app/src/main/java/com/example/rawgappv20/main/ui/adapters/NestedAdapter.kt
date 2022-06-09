package com.example.rawgappv20.main.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rawgappv20.R
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.ui.viewholders.GamesViewHolder

class NestedAdapter(
    private val onClick: (Results) -> Unit,
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val gameData = mutableListOf<Results>()

    override fun getItemViewType(position: Int): Int = when {
        else -> R.layout.item_horizontal
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            R.layout.item_horizontal -> GamesViewHolder(parent, onClick)
            else -> throw IllegalStateException("Unknown viewtype: $viewType")
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GamesViewHolder -> holder.bind(item = gameData[position])
        }
    }

    override fun getItemCount() = gameData.size


    fun setItems(games: List<Results>){
        gameData.clear()
        gameData.addAll(games)
        notifyDataSetChanged()
    }
}