package io.setapp.android.settings.client

import android.content.Context

internal object SettingsClientContext {

    var applicationContext: Context? = null
        private set

    fun initialize(context: Context) {
        this.applicationContext = context.applicationContext
    }

}
