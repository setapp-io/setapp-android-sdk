package io.setapp.android.settings.client

internal fun SettingsClient(): SettingsClient = SettingsClientImpl()

internal class SettingsClientImpl : SettingsClient {
    override fun getInt(key: String, default: Int): Int {
        return default
    }

    override fun getLong(key: String, default: Long): Long {
        return default
    }

    override fun getFloat(key: String, default: Float): Float {
        return default
    }

    override fun getString(key: String, default: String): String {
        return default
    }

    override fun getBoolean(key: String, default: Boolean): Boolean {
        return default
    }
}
