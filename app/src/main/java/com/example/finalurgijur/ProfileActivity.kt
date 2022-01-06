package com.example.finalurgijur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_profile)
        val logOutButton = findViewById<Button>(R.id.logOutButton)
        logOutButton.setOnClickListener {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }
        val passReset = findViewById<Button>(R.id.passReset)
        passReset.setOnClickListener {
            val Intent = Intent(this, PassChangeActivity::class.java)
            startActivity(Intent)
        }


    }
}