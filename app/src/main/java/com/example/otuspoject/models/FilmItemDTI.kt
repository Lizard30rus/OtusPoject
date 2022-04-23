package com.example.otuspoject.models

import com.google.gson.annotations.SerializedName


data class FilmItemDTI(
    @SerializedName("poster_path") val imageFilm : String,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val nameFilm: String,
    @SerializedName("description") val descriptionFilm : String
)