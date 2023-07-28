package com.alarcon.ec3_alarcon_quintanilla.model

data class PersonajesFavorite(
    val id: Int,
    val name: String,
    val rarity: String,
    val weapon: String,
    val vision: String,
    val wiki_url: String = ""
)
data class Origin(
    val id: Int
)
data class Location(
    val id: Int
)

fun getDataFavorite(): List<PersonajesFavorite> = listOf(
    PersonajesFavorite(
        1, "Amber", "4-star", "Bow","Pyro","https://genshin-impact.fandom.com/wiki/Amber"
    )
)