package io.setapp.android.settings.client

internal interface SettingsClient {

    /**
     * Retrieve an Int value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     * @param default Value to return if this setting does not exist.
     *
     * @return Returns the setting value if it exists, or defValue.  Throws
     * ClassCastException if there is a setting with this name that is not
     * an Int.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getInt(key: String, default: Int): Int

    /**
     * Retrieve a Long value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     * @param default Value to return if this setting does not exist.
     *
     * @return Returns the setting value if it exists, or defValue.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a Long.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getLong(key: String, default: Long): Long

    /**
     * Retrieve a Float value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     * @param default Value to return if this setting does not exist.
     *
     * @return Returns the setting value if it exists, or defValue.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a Float.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getFloat(key: String, default: Float): Float

    /**
     * Retrieve a String value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     * @param default Value to return if this setting does not exist.
     *
     * @return Returns the setting value if it exists, or defValue.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a String.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getString(key: String, default: String): String

    /**
     * Retrieve a Boolean value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     * @param default Value to return if this setting does not exist.
     *
     * @return Returns the setting value if it exists, or defValue.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a Boolean.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getBoolean(key: String, default: Boolean): Boolean

    /**
     * Retrieve an Int value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     *
     * @return Returns the setting value if it exists, otherwise null.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a Int.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getIntOrNull(key: String): Int?

    /**
     * Retrieve a Long value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     *
     * @return Returns the setting value if it exists, otherwise null.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a Long.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getLongOrNull(key: String): Long?

    /**
     * Retrieve a Float value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     *
     * @return Returns the setting value if it exists, or defValue.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a Float.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getFloatOrNull(key: String): Float?

    /**
     * Retrieve a String value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     *
     * @return Returns the setting value if it exists, or defValue.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a String.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getStringOrNull(key: String): String?

    /**
     * Retrieve a Boolean value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     *
     * @return Returns the setting value if it exists, or defValue.  Throws
     * ClassCastException if there is a setting with this name that is not
     * a Boolean.
     *
     * @throws ClassCastException
     */
    @Throws(ClassCastException::class)
    fun getBooleanOrNull(key: String): Boolean?
}
