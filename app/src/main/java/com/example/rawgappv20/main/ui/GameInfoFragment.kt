package com.example.rawgappv20.main.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.rawgappv20.R
import com.example.rawgappv20.databinding.FragmentGameInfoBinding
import com.example.rawgappv20.main.model.Results


class GameInfoFragment : Fragment(R.layout.fragment_game_info) {
    private val binding: FragmentGameInfoBinding by lazy{
        FragmentGameInfoBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = with(binding){
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = arguments?.getParcelable<Results>("result") as Results
        with(binding){
            name.text = data.name
            context?.let { Glide.with(it).load(data.backgroundImage).into(gameImageInfo) }

        }
    }

}