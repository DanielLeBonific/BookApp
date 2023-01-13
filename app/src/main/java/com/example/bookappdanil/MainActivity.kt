package com.example.bookappdanil

import android.app.Activity
import android.app.Instrumentation.ActivityResult
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.bookappdanil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //handle click, login
        binding.loginBtn.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))

        }

        //hand click, skip and continue to main screen
        binding.skipBtn.setOnClickListener {
            startActivity(Intent(this,DashboardUserActivity::class.java))

        }

        
    }
}