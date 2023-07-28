package com.alarcon.ec3_alarcon_quintanilla.data.repository

import com.alarcon.ec3_alarcon_quintanilla.data.retrofit.RetrofitHelper
import com.alarcon.ec3_alarcon_quintanilla.model.Personajes

class PersonajesRepository {

    suspend fun getPersonajes(): List<Personajes>{
        val response = RetrofitHelper.genshinInstance.getAllPersonajes()
        return response.personajes
    }
}