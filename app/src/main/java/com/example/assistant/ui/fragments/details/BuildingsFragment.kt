package com.example.assistant.ui.fragments.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assistant.databinding.FragmentBuildingsBinding

class BuildingsFragment : Fragment() {

    private lateinit var binding: FragmentBuildingsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentBuildingsBinding.inflate(inflater, container, false)
        return binding.root
    }

}