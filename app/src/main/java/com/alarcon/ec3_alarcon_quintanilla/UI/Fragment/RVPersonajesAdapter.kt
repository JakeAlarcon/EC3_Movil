package com.alarcon.ec3_alarcon_quintanilla.UI.Fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alarcon.ec3_alarcon_quintanilla.R
import com.alarcon.ec3_alarcon_quintanilla.databinding.ItemPersonajesBinding
import com.alarcon.ec3_alarcon_quintanilla.model.Personajes

class RVPersonajesAdapter(var personajes: List<Personajes>): RecyclerView.Adapter<PersonajeVH> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajeVH {
        val binding = ItemPersonajesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PersonajeVH(binding)
    }

    override fun getItemCount(): Int =personajes.size


    override fun onBindViewHolder(holder: PersonajeVH, position: Int) {
        holder.bind(personajes[position])
    }
}

class PersonajeVH(private  val binding: ItemPersonajesBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(personajes: Personajes){
        binding.txtName.text = personajes.name
        binding.txtRarity.text = personajes.rarity
        binding.txtVision.text = personajes.vision
        binding.txtWeapon.text = personajes.weapon

        if (personajes.isFavorite){
            binding.btnFavorite.setImageResource(R.drawable.ic_favorite_red)
        }else{
            binding.btnFavorite.setImageResource(R.drawable.ic_favorite2)
        }
    }

}