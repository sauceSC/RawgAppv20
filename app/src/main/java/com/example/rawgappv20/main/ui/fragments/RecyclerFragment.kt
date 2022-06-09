package com.example.rawgappv20.main.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rawgappv20.R
import com.example.rawgappv20.common.basemvp.BaseFragmentMvp
import com.example.rawgappv20.databinding.ItemRecyclerBinding
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.model.genres.MainGenres
import com.example.rawgappv20.main.ui.GamesContract
import com.example.rawgappv20.main.ui.adapters.ByGenreAdapter
import com.example.rawgappv20.main.ui.adapters.NestedAdapter
import com.example.rawgappv20.main.ui.replaceFragment
import org.koin.android.ext.android.inject
import timber.log.Timber

class RecyclerFragment :
    BaseFragmentMvp<GamesContract.View, GamesContract.Presenter>(R.layout.item_recycler),
    GamesContract.View {

    private lateinit var binding: ItemRecyclerBinding

    override val presenter: GamesContract.Presenter by inject()

    private val byGenreAdapter: ByGenreAdapter by lazy {
        ByGenreAdapter(
            onClick = { onClick(it) },
            getGamesByGenre = {getGenreName(it)}
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ItemRecyclerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            innerRecyclerView.layoutManager = LinearLayoutManager(requireContext())
            innerRecyclerView.adapter = byGenreAdapter
            presenter.getGenres()
        }
    }


    private fun onClick(results: Results) {
//        val fragment = GameInfoFragment()
//        val bundle = Bundle()
//        bundle.putParcelable("result", results)
//        fragment.arguments = bundle
//        replaceFragment(fragment)
    }


    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }

    override fun showGames(results: List<Results>, position: Int) {
        byGenreAdapter.setItems(results, position)
    }

    override fun onFail(throwable: Throwable) {
        Timber.e(throwable.message)
    }

    override fun showGenres(genres: MainGenres) {
        byGenreAdapter.setGenres(genres.games)
    }

    private fun getGenreName(genre: GenreGame) {
        presenter.getGamesList(genre)
    }
}