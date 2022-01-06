package com.example.finalurgijur.fragments

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.finalurgijur.R

class ProfileFragment :Fragment(R.layout.fragment_profile) {
    private lateinit var passReset :EditText
    private lateinit var logOutButton:EditText
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        passReset = view.findViewById(R.id.passReset)
        logOutButton = view.findViewById(R.id.passReset)
    }
}