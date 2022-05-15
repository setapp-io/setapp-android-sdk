package io.setapp.android.settings.client

object Settings {

    private val settingsClient = SettingsClient()

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getInt(key: String, default: Int): Int = settingsClient.getInt(key, default)

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getLong(key: String, default: Long): Long = settingsClient.getLong(key, default)

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getFloat(key: String, default: Float): Float = settingsClient.getFloat(key, default)

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getString(key: String, default: String): String = settingsClient.getString(key, default)

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getBoolean(key: String, default: Boolean): Boolean = settingsClient.getBoolean(key, default)

    /**
     * Retrieve an Int value from the setapp.
     *
     * @param key The name of the setting to retrieve.
     *
     * @return Returns the setting value if it exists, otherwise null.  Throws
     * ClassCastException if there is a setting with this name that is not
     * an Int.
     *
     * @throws ClassCastException
     */
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getIntOrNull(key: String): Int? = settingsClient.getIntOrNull(key)

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getLongOrNull(key: String): Long? = settingsClient.getLongOrNull(key)

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getFloatOrNull(key: String): Float? = settingsClient.getFloatOrNull(key)

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getStringOrNull(key: String): String? = settingsClient.getStringOrNull(key)

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
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getBooleanOrNull(key: String): Boolean? = settingsClient.getBooleanOrNull(key)
}
