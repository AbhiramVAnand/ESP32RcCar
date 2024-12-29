package com.abhiram.esp32rcremote.esp32

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Esp32ApiInstance{
    private const val BASE_URL = "http://192.168.1.1"

    val api : Esp32Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(Esp32Api::class.java)
    }
}