package com.example.rawgappv20.main.model

import android.os.Parcelable
import com.example.rawgappv20.main.api.model.PlatformXResponse
import com.example.rawgappv20.main.api.model.RequirementsResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class Platform (
    val platform: PlatformX,
    val releasedAt: String,
    val requirements: Requirements
): Parcelable