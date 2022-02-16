package com.example.assistant.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Интерейс для настройки из фрагмента иконок в тулбаре активити
 */

/**
 * Implement this interface in your fragment if you want to show additional action in the toolbar
 * while that fragment is displayed to the user.
 */
interface HasCustomAction {

    /**
     * @return a custom action specification, see [CustomAction] class for details
     */
    fun getCustomAction(): CustomAction

}

class CustomAction(
    @DrawableRes val iconRes: Int,
    @StringRes val textRes: Int,
    val onCustomAction: Runnable
)