package com.alarcon.ec3_alarcon_quintanilla.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private  val retrofitInstant: Retrofit = Retrofit.Builder()
        .baseUrl("https://gsi.fly.dev/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val genshinInstance = retrofitInstant.create(GenshinImpacInstace::class.java)
}