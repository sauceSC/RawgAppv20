package com.example.rawgappv20.main.api.model

import com.example.rawgappv20.main.api.model.InParentPlatforms
import com.google.gson.annotations.SerializedName

data class ParentPlatformsResponse(
    @SerializedName("platform")
    val platform: List<InParentPlatforms>
)
