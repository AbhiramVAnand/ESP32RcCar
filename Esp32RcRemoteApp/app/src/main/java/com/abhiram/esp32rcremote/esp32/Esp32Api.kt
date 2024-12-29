package com.abhiram.esp32rcremote.esp32

import retrofit2.http.GET

interface Esp32Api {

    @GET("/16/on")
    suspend fun onUpArrow()

    @GET("/16/off")
    suspend fun onDownArrow()

}