package com.example.assistant.utilits

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.assistant.R

fun showToast(message: String) {
    /* Функция показывает сообщение */
    Toast.makeText(APP_ACTIVITY, message, Toast.LENGTH_SHORT).show()
}

fun replaceFragment(fragment: Fragment, addStack: Boolean = true) {
    /* Функция расширения для AppCompatActivity, позволяет устанавливать фрагменты */
    if (addStack) {
        APP_ACTIVITY.supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(
                R.id.place_holder,
                fragment
            ).commit()
    } else {
        APP_ACTIVITY.supportFragmentManager.beginTransaction()
            .replace(
                R.id.place_holder,
                fragment
            ).commit()
    }

}