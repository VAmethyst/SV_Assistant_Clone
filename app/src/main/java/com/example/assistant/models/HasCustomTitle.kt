package com.example.assistant.models

import androidx.annotation.StringRes

/**
 * Интерфейс для изменения из фрагмента названия в тулбаре активити
 * Details или имя жителя
 */

/**
 * Implement this interface in your fragment if you want to override default toolbar title
 */
interface HasCustomTitle {

    /**
     * @return the string resource which should be displayed instead of default title
     */
    @StringRes
    fun getTitleRes(): Int

}