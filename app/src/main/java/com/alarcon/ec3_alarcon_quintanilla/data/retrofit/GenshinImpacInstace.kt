package com.alarcon.ec3_alarcon_quintanilla.data.retrofit

import com.alarcon.ec3_alarcon_quintanilla.data.response.PersonajesListREsponse
import retrofit2.http.GET

interface GenshinImpacInstace {
    @GET("characters/")
    fun getAllPersonajes(): PersonajesListREsponse

   // @GET("/characters/:id")
    //fun getIdPersonajes():
}