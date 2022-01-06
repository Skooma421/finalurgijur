package com.example.finalurgijur

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_pass_change.*

class PassChangeActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_change)


        val button4 = findViewById<Button>(R.id.buttonChangePass)
        button4.setOnClickListener {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }
        auth = FirebaseAuth.getInstance()
        buttonChangePass.setOnClickListener {
            changePassword()
        }


    }

    private fun changePassword() {
        if (editTextOldPass.text.isNotEmpty()
            && editTextNewPass.text.isNotEmpty()
            && editTextConfirmPass.text.isNotEmpty()
        ) {
            if (editTextNewPass.text.toString().equals(editTextConfirmPass.text.toString())) {
                val user: FirebaseUser? = auth.currentUser
                if (user != null && user.email != null) {
                    val credential = EmailAuthProvider
                        .getCredential(user.email!!, editTextOldPass.text.toString())

                    user.reauthenticate(credential)
                        .addOnCompleteListener {
                            if (it.isSuccessful) {
                                Toast.makeText(
                                    this,
                                    "Password Changed Successfully",
                                    Toast.LENGTH_SHORT
                                ).show()
                                user!!.updatePassword(editTextNewPass.text.toString())
                                    .addOnCompleteListener { task ->
                                        if (task.isSuccessful) {
                                            Toast.makeText(
                                                this,
                                                "Password Changed Successfully",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                            auth.signOut()
                                            startActivity(Intent(this, LoginActivity::class.java))
                                            finish()
                                        }
                                    }

                            } else {
                                Toast.makeText(this, "Couldn't Change Password", Toast.LENGTH_SHORT)
                                    .show()

                            }
                        }


                } else {
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()

                }

            } else {
                Toast.makeText(this, "Password doesn't match", Toast.LENGTH_SHORT).show()
            }

        } else {
            Toast.makeText(this, "Please enter all the fields", Toast.LENGTH_SHORT).show()
        }


    }


}
