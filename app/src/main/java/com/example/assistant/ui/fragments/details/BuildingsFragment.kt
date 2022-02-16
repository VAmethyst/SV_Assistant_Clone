package com.example.assistant.ui.fragments.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assistant.R
import com.example.assistant.databinding.FragmentSearchBinding
import com.example.assistant.utilits.APP_ACTIVITY

class BuildingsFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

}