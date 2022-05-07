package com.example.rawgappv20.main.model

import android.os.Parcelable
import com.example.rawgappv20.main.api.model.StoreResponse
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Stores(
    val id: Int,
    val store: Store
):Parcelable
