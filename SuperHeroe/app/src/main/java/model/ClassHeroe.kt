package model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ClassHeroe (
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
