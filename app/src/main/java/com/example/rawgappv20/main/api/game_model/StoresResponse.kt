package com.example.rawgappv20.main.api.game_model

import com.google.gson.annotations.SerializedName

data class StoresResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("store")
    val store: StoreResponse
)
