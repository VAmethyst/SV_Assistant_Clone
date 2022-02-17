package com.example.assistant.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.assistant.R
import com.example.assistant.databinding.FragmentSearchBinding
import com.example.assistant.models.navigator
import com.example.assistant.utilits.showToast

class SearchFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        binding.buttonBuildings.setOnClickListener(this)
        binding.buttonVillagers.setOnClickListener(this)
        return binding.root
        }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.buttonBuildings->{ onBuildingsButtonPressed() }
            R.id.buttonVillagers->{ onVillagersButtonPressed() }
        }
    }

    private fun onVillagersButtonPressed() {
        navigator().goToVillagesList()
    }

    private fun onBuildingsButtonPressed() {
        navigator().goToBuildingsList()
    }

}