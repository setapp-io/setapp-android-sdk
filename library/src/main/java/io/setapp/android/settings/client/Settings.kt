package io.setapp.android.settings.client

object Settings {

    private val settingsClient = SettingsClient()

    /**
     * Retrieve a Int value from the SetApp.
     *
     * @param key The name of the preference to retrieve.
     * @param default Value to return if this preference does not exist.
     *
     * @return Returns the preference value if it exists, or defValue.  Throws
     * ClassCastException if there is a preference with this name that is not
     * a String.
     *
     * @throws ClassCastException
     */
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getInt(key: String, default: Int): Int = settingsClient.getInt(key, default)

    /**
     * Retrieve a Long value from the SetApp.
     *
     * @param key The name of the preference to retrieve.
     * @param default Value to return if this preference does not exist.
     *
     * @return Returns the preference value if it exists, or defValue.  Throws
     * ClassCastException if there is a preference with this name that is not
     * a String.
     *
     * @throws ClassCastException
     */
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getLong(key: String, default: Long): Long = settingsClient.getLong(key, default)

    /**
     * Retrieve a Float value from the SetApp.
     *
     * @param key The name of the preference to retrieve.
     * @param default Value to return if this preference does not exist.
     *
     * @return Returns the preference value if it exists, or defValue.  Throws
     * ClassCastException if there is a preference with this name that is not
     * a String.
     *
     * @throws ClassCastException
     */
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getFloat(key: String, default: Float): Float = settingsClient.getFloat(key, default)

    /**
     * Retrieve a String value from the SetApp.
     *
     * @param key The name of the preference to retrieve.
     * @param default Value to return if this preference does not exist.
     *
     * @return Returns the preference value if it exists, or defValue.  Throws
     * ClassCastException if there is a preference with this name that is not
     * a String.
     *
     * @throws ClassCastException
     */
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getString(key: String, default: String): String = settingsClient.getString(key, default)

    /**
     * Retrieve a Boolean value from the SetApp.
     *
     * @param key The name of the preference to retrieve.
     * @param default Value to return if this preference does not exist.
     *
     * @return Returns the preference value if it exists, or defValue.  Throws
     * ClassCastException if there is a preference with this name that is not
     * a String.
     *
     * @throws ClassCastException
     */
    @JvmStatic
    @Throws(ClassCastException::class)
    fun getBoolean(key: String, default: Boolean): Boolean = settingsClient.getBoolean(key, default)
}