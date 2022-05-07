package com.example.rawgappv20.main.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rawgappv20.R
import com.example.rawgappv20.common.basemvp.BaseFragmentMvp
import com.example.rawgappv20.databinding.FragmentRecyclerBinding
import com.example.rawgappv20.main.model.Results
import org.koin.android.ext.android.inject
import timber.log.Timber

class RecyclerFragment :
    BaseFragmentMvp<GamesContract.View, GamesContract.Presenter>(R.layout.fragment_recycler),
    GamesContract.View {

    private lateinit var binding: FragmentRecyclerBinding

    override val presenter: GamesContract.Presenter by inject()

    private val gamesAdapter: GamesAdapter by lazy {
        GamesAdapter ( onClick = { showDetailsItem(it) } )
    }

    private fun showDetailsItem(results: Results) {
        val fragment = GameInfoFragment()
        val bundle = Bundle()
        bundle.putParcelable("result", results)
        fragment.arguments = bundle
        replaceFragment(fragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRecyclerBinding.inflate(inflater, container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("###", "Recycler")
        mainRecyclerView.layoutManager = LinearLayoutManager(context)
        Log.i("###", "Layoutmanager")
        mainRecyclerView.adapter = gamesAdapter
        Log.i("###", "adapter")
        presenter.getGamesList()
    }

    override fun showGames(results: List<Results>) {
        gamesAdapter.setData(results)
        Log.i("###", results.toString())
    }

    override fun onFail(throwable: Throwable) {
        Timber.e(throwable.message)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }
}