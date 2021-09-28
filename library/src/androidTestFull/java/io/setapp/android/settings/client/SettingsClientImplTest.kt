package io.setapp.android.settings.client

import android.test.ProviderTestCase2
import android.test.mock.MockContentResolver
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.AUTHORITY
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.DEFAULT_VALUE_BOOL
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.DEFAULT_VALUE_FLOAT
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.DEFAULT_VALUE_INT
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.DEFAULT_VALUE_LONG
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.DEFAULT_VALUE_STRING
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.KEY_BOOL
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.KEY_FLOAT
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.KEY_INT
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.KEY_LONG
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.KEY_STRING
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.NOT_EXISTING_KEY
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.PACKAGE_NAME
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.VALUE_BOOL
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.VALUE_FLOAT
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.VALUE_INT
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.VALUE_LONG
import io.setapp.android.settings.client.SettingsMockContentProvider.Companion.VALUE_STRING
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SettingsClientImplTest : ProviderTestCase2<SettingsMockContentProvider>(
    SettingsMockContentProvider::class.java,
    AUTHORITY
) {
    private lateinit var settingsClient: SettingsClient

    override fun getMockContentResolver(): MockContentResolver {
        val settingsMockContentResolver = SettingsMockContentResolver()
        settingsMockContentResolver.addProvider(AUTHORITY, provider)
        return settingsMockContentResolver
    }

    @Throws(Exception::class)
    @Before
    fun before() {
        setUp()
        SettingsClientContext.initialize(mockContext)
        settingsClient = SettingsClientImpl(mockContentResolver, PACKAGE_NAME)
    }

    @After
    fun after() {
        tearDown()
    }

    @Test
    fun get_wrong_type_from_settings() {
        val value = settingsClient.getInt(KEY_STRING, DEFAULT_VALUE_INT)

        Assert.assertEquals(value, DEFAULT_VALUE_INT)
    }

    @Test
    fun get_int_from_settings() {
        val value = settingsClient.getInt(KEY_INT, DEFAULT_VALUE_INT)

        Assert.assertEquals(value, VALUE_INT)
    }

    @Test
    fun get_non_existing_int_from_settings() {
        val value = settingsClient.getInt(NOT_EXISTING_KEY, DEFAULT_VALUE_INT)

        Assert.assertEquals(value, DEFAULT_VALUE_INT)
    }

    @Test
    fun get_long_from_settings() {
        val value = settingsClient.getLong(KEY_LONG, DEFAULT_VALUE_LONG)

        Assert.assertEquals(value, VALUE_LONG)
    }

    @Test
    fun get_non_existing_long_from_settings() {
        val value = settingsClient.getLong(NOT_EXISTING_KEY, DEFAULT_VALUE_LONG)

        Assert.assertEquals(value, DEFAULT_VALUE_LONG)
    }

    @Test
    fun get_float_from_settings() {
        val value = settingsClient.getFloat(KEY_FLOAT, DEFAULT_VALUE_FLOAT)

        Assert.assertEquals(value, VALUE_FLOAT)
    }

    @Test
    fun get_non_existing_float_from_settings() {
        val value = settingsClient.getFloat(NOT_EXISTING_KEY, DEFAULT_VALUE_FLOAT)

        Assert.assertEquals(value, DEFAULT_VALUE_FLOAT)
    }

    @Test
    fun get_string_from_settings() {
        val value = settingsClient.getString(KEY_STRING, DEFAULT_VALUE_STRING)

        Assert.assertEquals(value, VALUE_STRING)
    }

    @Test
    fun get_non_existing_string_from_settings() {
        val value = settingsClient.getString(NOT_EXISTING_KEY, DEFAULT_VALUE_STRING)

        Assert.assertEquals(value, DEFAULT_VALUE_STRING)
    }

    @Test
    fun get_boolean_from_settings() {
        val value = settingsClient.getBoolean(KEY_BOOL, DEFAULT_VALUE_BOOL)

        Assert.assertEquals(value, VALUE_BOOL)
    }

    @Test
    fun get_non_existing_boolean_from_settings() {
        val value = settingsClient.getBoolean(NOT_EXISTING_KEY, DEFAULT_VALUE_BOOL)

        Assert.assertEquals(value, DEFAULT_VALUE_BOOL)
    }
}
