package com.alarcon.ec3_alarcon_quintanilla.UI.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alarcon.ec3_alarcon_quintanilla.databinding.FragmentListBinding
import com.alarcon.ec3_alarcon_quintanilla.model.getData
import androidx.lifecycle.ViewModelProvider

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var  viewModel: ListViewModel

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ListViewModel::class.java]

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVPersonajesAdapter(listOf())
        binding.rvPersonajes.adapter = adapter
        binding.rvPersonajes.layoutManager = GridLayoutManager(requireContext(),2,RecyclerView.VERTICAL,false)
        viewModel.personajes.observe(requireActivity()){personajes ->
            adapter.personajes = personajes
            adapter.notifyDataSetChanged()
        }
        viewModel.getPersonajes()
    }


}