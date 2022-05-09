package com.example.rawgappv20.main.api.model


import com.google.gson.annotations.SerializedName

data class ResultResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("released")
    val released: String,
    @SerializedName("tba")
    val tba: Boolean,
    @SerializedName("background_image")
    val backgroundImage: String,
    @SerializedName("rating")
    val rating: Double,
    @SerializedName("rating_top")
    val ratingTop: Int,
    @SerializedName("ratings")
    val ratings: List<RatingsResponse>,
    @SerializedName("ratings_count")
    val ratingsCount: Int,
    @SerializedName("reviews_text_count")
    val reviewsTextCount: String,
    @SerializedName("added")
    val added: Int,
    @SerializedName("added_by_status")
    val addedByStatus: AddedByStatusResponse,
    @SerializedName("metacritic")
    val metacritic: Int,
    @SerializedName("playtime")
    val playtime: Int,
    @SerializedName("suggestions_count")
    val suggestionsCount: Int,
    @SerializedName("updated")
    val updated: String,
    @SerializedName("user_game")
    val userGame: String,
    @SerializedName("reviews_count")
    val reviewsCount: Int,
    @SerializedName("saturated_color")
    val saturatedColor: String,
    @SerializedName("dominant_color")
    val dominantColor: String,
    @SerializedName("esrb_rating")
    val esrbRating: EsrbRatingResponse,
    @SerializedName("platforms")
    val platforms: List<PlatformResponse>,
    @SerializedName("parent_platforms")
    val parentPlatforms: List<ParentPlatformsResponse>,
    @SerializedName("genres")
    val genres: List<GenresResponse>,
    @SerializedName("stores")
    val stores: List<StoresResponse>,
    @SerializedName("clip")
    val clip: String,
    @SerializedName("tags")
    val tags: List<TagsResponse>,
    @SerializedName("short_screenshots")
    val shortScreenshots: ShortScreenshotsResponse
)