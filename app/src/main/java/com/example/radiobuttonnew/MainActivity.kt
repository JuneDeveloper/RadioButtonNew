package com.example.radiobuttonnew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var buttonStartBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStartBTN = findViewById(R.id.buttonStartBTN)

        buttonStartBTN.setOnClickListener{
            val intent = Intent(this,MainActivity1::class.java)
            startActivity(intent)
        }
    }
}