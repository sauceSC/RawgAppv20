package com.example.rawgappv20.main.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.ui.viewholders.GenresViewHolder

class ByGenreAdapter(
    val onClick: (Results) -> Unit,
    val getGamesByGenre: (GenreGame) -> Unit,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val genreData = mutableListOf<GenreGame>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        GenresViewHolder(parent, onClick, getGamesByGenre)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GenresViewHolder -> holder.bind(item = genreData[position], position)
        }
    }



    override fun getItemCount() = genreData.size

    fun setItems(games: List<Results>, position: Int) {
        genreData[position].games.addAll(games)
        notifyDataSetChanged()
    }

    fun setGenres(genreGame: List<GenreGame>){
        genreData.addAll(genreGame)
        notifyDataSetChanged()
    }

}