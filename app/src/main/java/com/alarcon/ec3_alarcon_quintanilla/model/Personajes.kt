package com.alarcon.ec3_alarcon_quintanilla.model

data class Personajes(
    val id: Int,
    val name: String,
    val rarity: String,
    val weapon: String,
    val vision: String,
    val wiki_url: String = ""

)
fun getData():List<Personajes> = listOf(
    Personajes(1,"Amber","4-star","Bow","Pyro","https://genshin-impact.fandom.com/wiki/Amber"),
    Personajes(2,"Barbara","4-star","Catalyst","Hydro","https://genshin-impact.fandom.com/wiki/Barbara"),
    Personajes(3,"Beidou","4-star","Claymore","Electro","https://genshin-impact.fandom.com/wiki/Beidou"),
    Personajes(4,"Bennett","4-start","Sword","Pyron","https://genshin-impact.fandom.com/wiki/Amber"),
    Personajes(5,"Chongyun","4-start","Claymore","Cryo","https://genshin-impact.fandom.com/wiki/Chongyun"),
    Personajes(6,"Fischl","4-start","Bow","Electro","https://genshin-impact.fandom.com/wiki/Fischl"),
    Personajes(7,"Kaeya","4-start","Sword","Cryo","https://genshin-impact.fandom.com/wiki/Kaeya"),
    Personajes(8,"Electro","4-start","Catalyst","Electro","https://genshin-impact.fandom.com/wiki/Lisa"),
    Personajes(9,"Ningguang","4-start","Catalyst","Geo","https://genshin-impact.fandom.com/wiki/Ningguang"),
    Personajes(10,"Noelle","4-start","Claymore","Geo","https://genshin-impact.fandom.com/wiki/Noelle")

)
