package com.plantilla.app.utils.extensions

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

fun Fragment.safeNavController(@IdRes resId: Int, bundle: Bundle = Bundle.EMPTY) = try {
    findNavController().navigate(resId, bundle)
} catch (e: Exception) {
    (e.message ?: "Ocurrio algo en la navegación").logError("SafeNavController", e)
}

fun Fragment.safeNavController(action: NavDirections) = try {
    findNavController().navigate(action)
} catch (e: Exception) {
    (e.message ?: "Ocurrio algo en la navegación").logError("SafeNavController", e)
}

fun Fragment.safePopBackStack(@IdRes resId: Int, inclusive: Boolean) = try {
    findNavController().popBackStack(resId, inclusive)
} catch (e: Exception) {
    (e.message ?: "Ocurrio algo en la navegación").logError("safeNavController", e)
}