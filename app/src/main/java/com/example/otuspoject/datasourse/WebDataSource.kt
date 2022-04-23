package com.example.otuspoject.datasourse

import com.example.otuspoject.models.FilmItemDTI
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET


/**
 * запросы данных с web
 */
interface WebDataSource {

    @GET("8d057607-c2c1-41f6-985e-033e145c64b3")
    fun updateFilms() : Flow<FilmItemDTI>
}