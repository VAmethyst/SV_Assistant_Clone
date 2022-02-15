package com.example.assistant.utilits

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.assistant.R

fun showToast(message: String) {
    /* Функция показывает сообщение */
    Toast.makeText(APP_ACTIVITY, message, Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.replaceActivity(activity: AppCompatActivity) {
    val intent = Intent(this, activity::class.java)
    startActivity(intent)
    this.finish()
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