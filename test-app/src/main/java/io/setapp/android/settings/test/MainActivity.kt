package io.setapp.android.settings.test

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import io.setapp.android.settings.client.Settings

class MainActivity : AppCompatActivity() {

    private var txtKey: TextView? = null
    private var txtValue: TextView? = null

    private var key: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtKey = findViewById(R.id.key)
        txtKey?.doOnTextChanged { text, _, _, _ -> key = text?.toString() }
        txtValue = findViewById(R.id.value)

        registerButtonClickListener(R.id.btn_int) { Settings.getInt(it, -1) }
        registerButtonClickListener(R.id.btn_long) { Settings.getLong(it, -2L) }
        registerButtonClickListener(R.id.btn_float) { Settings.getFloat(it, -3.0f) }
        registerButtonClickListener(R.id.btn_string) { Settings.getString(it, "-4") }
        registerButtonClickListener(R.id.btn_boolean) { Settings.getBoolean(it, true) }
    }

    private fun getKey(block: (String) -> Unit) {
        val k = key
        if (k != null) {
            block(k)
        } else {
            Toast.makeText(this, "Please set key", Toast.LENGTH_SHORT)
                .show()
        }
    }


    private fun registerButtonClickListener(@IdRes id: Int, block: (String) -> Any) {
        findViewById<Button>(id)?.setOnClickListener {
            getKey {
                val value = block.invoke(it)
                txtValue?.text = value.toString()
            }
        }
    }
}