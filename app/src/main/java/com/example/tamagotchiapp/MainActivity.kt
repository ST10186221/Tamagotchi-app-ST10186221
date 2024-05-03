package com.example.tamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonSTART: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSTART = findViewById(R.id.button_START)
        buttonSTART.setOnClickListener {
            val intent1 = Intent(this, tamagotchiapp2::class.java)

            startActivity(intent1)
        }

    }

    }
    
