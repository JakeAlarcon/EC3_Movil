package com.alarcon.ec3_alarcon_quintanilla.UI.Fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alarcon.ec3_alarcon_quintanilla.data.repository.PersonajesRepository
import com.alarcon.ec3_alarcon_quintanilla.model.Personajes
import com.alarcon.ec3_alarcon_quintanilla.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListViewModel: ViewModel() {
    val personajes: MutableLiveData<List<Personajes>> = MutableLiveData<List<Personajes>>()
    val repository = PersonajesRepository()

    fun getPersonajes(){
        val allPersonajes = getData()
        personajes.value = allPersonajes
    }

    fun getPersonajesFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response = repository.getPersonajes()
            personajes.postValue(response)
        }
    }

}