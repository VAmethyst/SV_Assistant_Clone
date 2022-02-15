package com.example.assistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assistant.databinding.ActivityMainBinding
import com.example.assistant.ui.BundlesFragment
import com.example.assistant.ui.MuseumFragment
import com.example.assistant.ui.SearchFragment
import com.example.assistant.utilits.APP_ACTIVITY
import com.example.assistant.utilits.replaceFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP_ACTIVITY = this
        initListener()
        replaceFragment(MainFragment())
    }

    private fun initListener() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.main -> {
                    replaceFragment(MainFragment())}
                R.id.search -> {
                    replaceFragment(SearchFragment())}
                R.id.bundles -> {
                    replaceFragment(BundlesFragment())}
                R.id.museum -> {
                    replaceFragment(MuseumFragment())}
            }
            true
        }
    }

}