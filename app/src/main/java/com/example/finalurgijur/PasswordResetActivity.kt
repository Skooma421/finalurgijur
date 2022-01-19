package com.example.finalurgijur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class PasswordResetActivity : AppCompatActivity() {
    private lateinit var editTextEmail: EditText
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_reset)
        init()
        val resetButton = findViewById<Button>(R.id.resetButton)
        resetButton.setOnClickListener {
            val Intent = Intent(this,LoginActivity::class.java)
            startActivity(Intent)

        }
        registerListener()


    }

    private fun init() {
        editTextEmail = findViewById(R.id.editTextEmail)
        resetButton = findViewById(R.id.resetButton)

    }

    private fun registerListener() {
        resetButton.setOnClickListener {
            val email = editTextEmail.text.toString()
            if (email.isEmpty()) {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
                    FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                .addOnCompleteListener { task ->
                    if(task.isSuccessful){
                        startActivity(Intent(this, LoginActivity::class.java))
                        finish()
                        Toast.makeText(this,"Check email",Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show()
                    }
                }

        }

    }private fun goToProfile() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}