package com.example.assistant.models

import androidx.fragment.app.Fragment

fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}

interface Navigator {

    fun goToNextActivity()

}