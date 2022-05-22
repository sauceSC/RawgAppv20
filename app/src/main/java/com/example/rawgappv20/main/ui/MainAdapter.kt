package com.example.rawgappv20.main.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.main.model.MainGames.*
import com.example.rawgappv20.main.ui.viewholders.DescriptionViewHolder
import com.example.rawgappv20.main.ui.viewholders.ImageViewHolder
import com.example.rawgappv20.main.ui.viewholders.SmallViewHolder
import com.example.rawgappv20.utils.Constants.BIGIMAGE_VIEW_TYPE
import com.example.rawgappv20.utils.Constants.NOIMAGE_VIEW_TYPE
import com.example.rawgappv20.utils.Constants.SMALLIMAGE_VIEW_TYPE

class MainAdapter(val onClick: (MainGames) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val data = mutableListOf<MainGames>()

    fun setData(list: List<MainGames>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].type!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            BIGIMAGE_VIEW_TYPE -> ImageViewHolder(parent, onClick)
            SMALLIMAGE_VIEW_TYPE -> SmallViewHolder(parent, onClick)
            NOIMAGE_VIEW_TYPE -> DescriptionViewHolder(parent, onClick)
            else -> throw IllegalArgumentException("Invalid view type: $viewType")
        }
    }


    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is DescriptionViewHolder -> holder.bind(data[position] as Description)
            is ImageViewHolder -> holder.bind(data[position] as Image)
            is SmallViewHolder -> holder.bind(data[position] as SmallImage)
            else -> throw IllegalArgumentException()
        }
    }


}