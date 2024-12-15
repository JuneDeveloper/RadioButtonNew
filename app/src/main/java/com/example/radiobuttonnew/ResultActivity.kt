package com.example.radiobuttonnew

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {

    private lateinit var textResultTV:TextView
    private lateinit var infoTextTV:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        textResultTV = findViewById(R.id.textResultTV)
        infoTextTV = findViewById(R.id.infoTextTV)

        getInfo(textResultTV)

    }
    @SuppressLint("SetTextI18n")
    fun getInfo(view: TextView){
        val x = intent.getIntExtra("final",0)
        view.text = x.toString()
        when(Integer.parseInt(view.text.toString())) {
            100 -> infoTextTV.text = one
            200 -> infoTextTV.text = two
            300 -> infoTextTV.text = three
            400 -> infoTextTV.text = four
            500 -> infoTextTV.text = five
            else -> infoTextTV.text = zero
        }
    }
}