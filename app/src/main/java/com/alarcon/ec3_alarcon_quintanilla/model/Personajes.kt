package com.alarcon.ec3_alarcon_quintanilla.model

data class Personajes(
    val id: Int,
    val name: String,
    val rarity: String,
    val weapon: String,
    val vision: String,
    val wiki_url: String = "",
    val isFavorite: Boolean = false

)
fun getData():List<Personajes> = listOf()
