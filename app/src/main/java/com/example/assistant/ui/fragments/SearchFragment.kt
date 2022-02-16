package com.example.assistant.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assistant.databinding.FragmentSearchBinding
import com.example.assistant.models.navigator

class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        binding.buttonBuildings.setOnClickListener { onBuildingsPressed() }
        return binding.root
    }

    private fun onBuildingsPressed() {
        navigator().goToNextActivity()
    }

}