package com.example.finalurgijur.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.finalurgijur.LoginActivity
import com.example.finalurgijur.PassChangeActivity
import com.example.finalurgijur.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {
private lateinit var logOutButton:Button
private lateinit var passReset:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)

        val logOutButton = view.findViewById<Button>(R.id.logOutButton)
        logOutButton.setOnClickListener {
            requireActivity().run {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }


        }
        val passReset = view.findViewById<Button>(R.id.passReset)
        passReset.setOnClickListener {
            requireActivity().run {
                startActivity(Intent(this, PassChangeActivity::class.java))
                finish()
            }
        }
    }
}

