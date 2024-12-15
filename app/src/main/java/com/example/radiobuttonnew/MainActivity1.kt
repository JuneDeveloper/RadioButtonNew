package com.example.radiobuttonnew

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity1 : AppCompatActivity() {

    private lateinit var firstRB: RadioButton
    private lateinit var secondRB: RadioButton
    private lateinit var thirdRB: RadioButton
    private lateinit var questionMainTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        firstRB = findViewById(R.id.firstRB)
        secondRB = findViewById(R.id.secondRB)
        thirdRB = findViewById(R.id.thirdRB)
        questionMainTV = findViewById(R.id.questionMainTV)

        firstRB.setOnClickListener(radioButtonClickListener)
        secondRB.setOnClickListener(radioButtonClickListener)
        thirdRB.setOnClickListener(radioButtonClickListener)
        replace()
    }

    private val radioButtonClickListener =
        View.OnClickListener { view ->
            val radioButton = view as RadioButton
            var x = intent.getIntExtra("value", 0)
            var result = intent.getIntExtra("key",0)
            when (radioButton.id) {
                R.id.firstRB -> {
                    Toast.makeText(this, "Верно", Toast.LENGTH_SHORT).show()
                    result += 100
                    x++
                }

                R.id.secondRB -> {
                    Toast.makeText(this, "Балда.Учи историю", Toast.LENGTH_SHORT).show()
                    x++

                }

                R.id.thirdRB -> {
                    Toast.makeText(this, "Балда.Учи историю", Toast.LENGTH_SHORT).show()
                    x++

                }
            }
            if (x < 5) {
                val intent = Intent(this, MainActivity1::class.java)
                intent.putExtra("key", result)
                intent.putExtra("value", x)
                startActivity(intent)
            }else{
                val res = Intent(this,ResultActivity::class.java)
                res.putExtra("final",result)
                startActivity(res)
            }
        }

    private fun replace() {
        val value = intent.getIntExtra("value", 0)
        when (value) {
            1 -> {
                questionMainTV.setText(R.string.que2)
                firstRB.setText(R.string.que2_1)
                secondRB.setText(R.string.que2_2)
                thirdRB.setText(R.string.que2_3)
            }
            2 -> {
                questionMainTV.setText(R.string.que3)
                firstRB.setText(R.string.que3_1)
                secondRB.setText(R.string.que3_2)
                thirdRB.setText(R.string.que3_3)
            }
            3 -> {
                questionMainTV.setText(R.string.que4)
                firstRB.setText(R.string.que4_1)
                secondRB.setText(R.string.que4_2)
                thirdRB.setText(R.string.que4_3)
            }
            4 -> {
                questionMainTV.setText(R.string.que5)
                firstRB.setText(R.string.que5_1)
                secondRB.setText(R.string.que5_2)
                thirdRB.setText(R.string.que5_3)
            }
            else -> {
                questionMainTV.setText(R.string.question1)
                firstRB.setText(R.string._1914)
                secondRB.setText(R.string._1890)
                thirdRB.setText(R.string._1930)
            }
        }
    }
}
