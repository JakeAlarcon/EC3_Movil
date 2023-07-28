package com.alarcon.ec3_alarcon_quintanilla.UI.Fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alarcon.ec3_alarcon_quintanilla.databinding.ItemPersonajesfavoriteBinding
import com.alarcon.ec3_alarcon_quintanilla.model.PersonajesFavorite

data class RVPersonajeFavoriteAdapter(private val personajeFavorite: List<PersonajesFavorite>):RecyclerView.Adapter<PersonajeFavoriteVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajeFavoriteVH {
        val binding = ItemPersonajesfavoriteBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PersonajeFavoriteVH(binding)
    }

    override fun getItemCount(): Int = personajeFavorite.size

    override fun onBindViewHolder(holder: PersonajeFavoriteVH, position: Int) {
        holder.bind(personajeFavorite[position])
    }
}
class PersonajeFavoriteVH(private val binding: ItemPersonajesfavoriteBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(personajeFavorite: PersonajesFavorite){
        binding.txtIdFav.text = personajeFavorite.id.toString()
        binding.txtNameFav.text = personajeFavorite.name
        binding.txtRarityFav.text = personajeFavorite.rarity
        binding.txtWeaponFav.text = personajeFavorite.weapon
        binding.txtVisionFav.text = personajeFavorite.vision


    }

}
