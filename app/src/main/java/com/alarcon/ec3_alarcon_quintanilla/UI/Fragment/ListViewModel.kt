package com.alarcon.ec3_alarcon_quintanilla.UI.Fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alarcon.ec3_alarcon_quintanilla.model.Personajes
import com.alarcon.ec3_alarcon_quintanilla.model.getData

class ListViewModel: ViewModel() {
    val personajes: MutableLiveData<List<Personajes>> = MutableLiveData<List<Personajes>>()

    fun getPersonajes(){
        val allPersonajes = getData()
    }
}