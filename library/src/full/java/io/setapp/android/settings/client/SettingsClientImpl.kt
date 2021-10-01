package io.setapp.android.settings.client

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import android.util.Log

internal fun SettingsClient(): SettingsClient {
    val context = SettingsClientContext.applicationContext ?: throw IllegalStateException("")
    return SettingsClientImpl(context.contentResolver, context.packageName)
}

internal class SettingsClientImpl(
    private val contentResolver: ContentResolver,
    private val packageName: String
) : SettingsClient {
    private val baseUri by lazy {
        Uri.parse("content://$AUTHORITIES")
    }

    override fun getInt(key: String, default: Int): Int {
        return get(key, SettingsType.INT, default) { getInt(1) }
    }

    override fun getLong(key: String, default: Long): Long {
        return get(key, SettingsType.LONG, default) { getLong(1) }
    }

    override fun getFloat(key: String, default: Float): Float {
        return get(key, SettingsType.FLOAT, default) { getFloat(1) }
    }

    override fun getString(key: String, default: String): String {
        return get(key, SettingsType.STRING, default) { getString(1) }
    }

    override fun getBoolean(key: String, default: Boolean): Boolean {
        return get(key, SettingsType.BOOLEAN, default) { getInt(1) == 1 }
    }

    private fun createQueryUri(type: SettingsType, key: String): Uri = baseUri.buildUpon()
        .appendPath(VERSION)
        .appendPath(packageName)
        .appendPath(type.name)
        .appendPath(key)
        .build()

    private fun <T> get(key: String, type: SettingsType, default: T, block: Cursor.() -> T): T {
        var cursor: Cursor? = null
        var result = default
        try {
            cursor = contentResolver.query(
                createQueryUri(type, key),
                null, null, null, null
            )

            if (cursor?.moveToFirst() != null) {
                result = cursor.block()
            }
        } finally {
            cursor?.close()
        }

        Log.d("SettingsClient", "get $key is $result")
        return result
    }

    companion object {
        private const val AUTHORITIES: String = "io.setapp.android.settings.provider"
        private const val VERSION = "v1"

        internal enum class SettingsType {
            INT,
            LONG,
            FLOAT,
            STRING,
            BOOLEAN
        }
    }
}
