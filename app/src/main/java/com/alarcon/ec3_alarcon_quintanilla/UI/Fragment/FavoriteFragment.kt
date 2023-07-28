package com.alarcon.ec3_alarcon_quintanilla.UI.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alarcon.ec3_alarcon_quintanilla.databinding.FragmentFavoriteBinding
import com.alarcon.ec3_alarcon_quintanilla.model.getDataFavorite


class FavoriteFragment : Fragment() {
    private lateinit var binding: FragmentFavoriteBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvPersonajesFavorite.adapter = RVPersonajeFavoriteAdapter(getDataFavorite())
        binding.rvPersonajesFavorite.layoutManager = GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)
    }
}