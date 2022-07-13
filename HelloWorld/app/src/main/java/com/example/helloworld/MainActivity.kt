package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


// This Kotlin file is used to handle user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button).setOnClickListener {
        Log.i("Alex", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.light_blue))

        }

        // changing background color
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(Color.BLACK)
         }
            }
    }
