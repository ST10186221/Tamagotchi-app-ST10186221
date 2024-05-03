package com.example.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Tamagotchiapp2 : AppCompatActivity() {
    lateinit var buttonplay: Button
    lateinit var buttonclean: Button
    lateinit var buttoneat: Button
    lateinit var imageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tamagotchiapp2)

        buttonplay = findViewById(R.id.btn_play)
        buttonclean = findViewById(R.id.btn_clean)
        buttoneat = findViewById(R.id.button_eat)
        imageView = findViewById(R.id.imageView)

        buttonplay.setOnClickListener {


            if (imageView.tag=="welcome")
            {
            imageView.setImageResource(R.drawable.playing)
                imageView.tag="play"
            }
else
            {
                imageView.setImageResource(R.drawable.welcome)
                imageView.tag="welcome"


            }

        }
// button sad clicked

        buttonclean.setOnClickListener {


            if (imageView.tag == "welcome" || imageView.tag == "playing") {
                imageView.setImageResource(R.drawable.bathing)
                imageView.tag = "clean"
            } else {
                imageView.setImageResource(R.drawable.welcome)
                imageView.tag = "welcome"

            }
        }
// button cool clicked

        buttoneat.setOnClickListener {


            if (imageView.tag == "welcome" || imageView.tag == "play" || imageView.tag == "clean")

            {
                imageView.setImageResource(R.drawable.eating)
                imageView.tag = "eat"
            } else {
                imageView.setImageResource(R.drawable.welcome)
                imageView.tag = "welcome"

            }
        }









            }

}

class tamagotchiapp2 {

}

