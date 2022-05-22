package com.example.rawgappv20.main.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Platform (
    val platform: PlatformX,
    val releasedAt: String,
    val requirements: Requirements
): Parcelable