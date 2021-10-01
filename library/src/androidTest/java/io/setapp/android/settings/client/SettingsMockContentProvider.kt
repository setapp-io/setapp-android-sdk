package io.setapp.android.settings.client

import android.database.Cursor
import android.database.MatrixCursor
import android.net.Uri
import android.test.mock.MockContentProvider

class SettingsMockContentProvider : MockContentProvider() {

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        val baseUrl = "content://$AUTHORITY/v1/io.setapp.android.settings.client"
        val paths = mapOf<String, Any>(
            "$baseUrl/INT/$KEY_INT" to VALUE_INT,
            "$baseUrl/LONG/$KEY_LONG" to VALUE_LONG,
            "$baseUrl/FLOAT/$KEY_FLOAT" to VALUE_FLOAT,
            "$baseUrl/STRING/$KEY_STRING" to VALUE_STRING,
            "$baseUrl/BOOLEAN/$KEY_BOOL" to if (VALUE_BOOL) 1 else 0,
        )

        val matrixCursor = MatrixCursor(arrayOf("key", "value"), 2)
        val value = paths.firstNotNullOfOrNull {
            if (it.key == "$uri") it.value else null
        } ?: return null

        val type = uri.pathSegments[2]

        return matrixCursor.apply { newRow().add(type).add(value) }
    }

    companion object {
        const val AUTHORITY = "io.setapp.android.settings.provider"
        const val PACKAGE_NAME = "io.setapp.android.settings.client"

        const val KEY_INT = "key_int"
        const val KEY_LONG = "key_long"
        const val KEY_FLOAT = "key_float"
        const val KEY_STRING = "key_string"
        const val KEY_BOOL = "key_bool"

        const val VALUE_INT = 100
        const val VALUE_LONG = 200L
        const val VALUE_FLOAT = 300F
        const val VALUE_STRING = "string"
        const val VALUE_BOOL = true

        const val DEFAULT_VALUE_INT = 200
        const val DEFAULT_VALUE_LONG = 300L
        const val DEFAULT_VALUE_FLOAT = 400F
        const val DEFAULT_VALUE_STRING = "_string"
        const val DEFAULT_VALUE_BOOL = false

        const val NOT_EXISTING_KEY = "not_existing_key"
    }
}
