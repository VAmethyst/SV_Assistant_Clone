package com.example.assistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assistant.databinding.ActivityDetailsBinding
import com.example.assistant.ui.MainFragment
import com.example.assistant.ui.fragments.details.BuildingsFragment
import com.example.assistant.utilits.APP_ACTIVITY
import com.example.assistant.utilits.replaceFragment

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment((BuildingsFragment()))
    }

}