package com.plantilla.app.utils.extensions

import android.util.Log

const val LoggerExtensions = "LoggerExtensions"

fun String.logVerbose(title: String? = null, e: Exception? = null){
    e?.printStackTrace()
    Log.v(title ?: LoggerExtensions, this)
}

fun String.logDebug(title: String? = null, e: Exception? = null){
    e?.printStackTrace()
    Log.d(title ?: LoggerExtensions, this)
}

fun String.logInfo(title: String? = null, e: Exception? = null){
    e?.printStackTrace()
    Log.i(title ?: LoggerExtensions, this)
}

fun String.logWarning(title: String? = null, e: Exception? = null){
    e?.printStackTrace()
    Log.w(title ?: LoggerExtensions, this)
}

fun String.logError(title: String? = null, e: Exception? = null){
    e?.printStackTrace()
    Log.e(title ?: LoggerExtensions, this)
}