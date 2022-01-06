package com.example.finalurgijur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextActivity = findViewById<Button>(R.id.nextActivity)
        nextActivity.setOnClickListener {
            val Intent = Intent(this,LoginActivity::class.java)
            startActivity(Intent)
        }
    }
}