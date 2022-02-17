package com.example.assistant.ui.fragments.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assistant.R
import com.example.assistant.databinding.FragmentObjectDetailsBinding
import com.example.assistant.databinding.FragmentSearchBinding
import com.example.assistant.models.CustomAction
import com.example.assistant.models.HasCustomAction
import com.example.assistant.models.HasCustomTitle

class ObjectDetailsFragment : Fragment(), HasCustomAction, HasCustomTitle {

    private lateinit var binding: FragmentObjectDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentObjectDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun getCustomAction(): CustomAction {
        TODO("Not yet implemented")
    }

    override fun getTitleRes(): Int {
        TODO("Not yet implemented")
    }

}