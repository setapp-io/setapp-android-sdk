package io.setapp.android.settings.test

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import io.setapp.android.settings.client.Settings

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var etUser: EditText? = null
    private var etPassword: EditText? = null
    private var username: String = ""
    private var password: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUser = findViewById(R.id.username)
        etUser?.doOnTextChanged { text, _, _, _ -> username = text?.toString() ?: "" }

        etPassword = findViewById(R.id.password)
        etPassword?.doOnTextChanged { text, _, _, _ -> password = text?.toString() ?: "" }

        val bCheck = findViewById<Button>(R.id.check)
        bCheck.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
        updateField(etUser, KEY_USERNAME)
        updateField(etPassword, KEY_PASSWORD)
    }

    override fun onClick(p0: View?) {
        if (username == USERNAME && password == PASSWORD) {
            Toast.makeText(this, "The username and password are correct.", Toast.LENGTH_SHORT)
                .show()
        } else {
            Toast.makeText(this, "The username or password is incorrect.", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun updateField(editText: EditText?, key: String) {
        if (editText == null) {
            return
        }

        val current: String = editText.text?.toString() ?: ""
        val value = Settings.getString(key, current)

        editText.setText(value)
    }

    companion object {
        private const val KEY_USERNAME = "username"
        private const val KEY_PASSWORD = "password"

        private const val USERNAME = "admin"
        private const val PASSWORD = "password"
    }
}
