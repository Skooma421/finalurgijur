package com.example.finalurgijur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.finalurgijur.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Patenti : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.patent_main_activity)


        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        val navHostFragment = findNavController(R.id.nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.profileFragment,
                R.id.secondFragment,
            )
        )
        setupActionBarWithNavController(navHostFragment, appBarConfiguration)
        bottomNavView.setupWithNavController(navHostFragment)





    }


}