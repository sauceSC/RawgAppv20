package com.example.rawgappv20.main.ui.viewholders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rawgappv20.databinding.ItemRecyclerBinding
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.ui.adapters.ByGenreAdapter
import com.example.rawgappv20.main.ui.adapters.NestedAdapter
import java.text.FieldPosition

class GenresViewHolder(
    val binding: ItemRecyclerBinding,
    val onClick: (Results) -> Unit,
    val getGamesByGenre: (GenreGame) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    private val nestedAdapter: NestedAdapter by lazy {
        NestedAdapter(onClick)
    }

//    private val linearLayoutManager: LinearLayoutManager by lazy {
//        LinearLayoutManager(binding.innerRecyclerView.context, RecyclerView.HORIZONTAL, false)
//    }

    constructor(
        parent: ViewGroup,
        onClick: (Results) -> Unit,
        getGamesByGenre: (GenreGame) -> Unit
    ) : this(
        ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false),
        onClick,
        getGamesByGenre
    )
    init{
        with(binding){
            innerRecyclerView.layoutManager = LinearLayoutManager(innerRecyclerView.context, RecyclerView.HORIZONTAL, false)
            innerRecyclerView.adapter = nestedAdapter
        }
    }
    fun bind(item: GenreGame, position: Int) {
        with(binding) {
            item.position = position
            getGamesByGenre(item)
            nestedAdapter.setItems(item.games)
            genres.text = "${item.name}"
        }
    }
}