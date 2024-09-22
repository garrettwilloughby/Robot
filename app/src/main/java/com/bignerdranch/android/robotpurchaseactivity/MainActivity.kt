package com.bignerdranch.android.robotpurchaseactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast





class MainActivity : AppCompatActivity() {

    private lateinit var robot : ImageView
    private lateinit var buttonA : Button
    private lateinit var buttonB : Button
    private lateinit var buttonC : Button
    private lateinit var balanceText : TextView
    private var balance = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        robot = findViewById(R.id.robot)
        buttonA = findViewById(R.id.buttonA)
        buttonB = findViewById(R.id.buttonB)
        buttonC = findViewById(R.id.buttonC)
        balanceText = findViewById(R.id.balanceText)

        fun setBalance(){

            balanceText.text = balance.toString()
        }


        buttonA.setOnClickListener {
            Toast.makeText(this, "Button A", Toast.LENGTH_SHORT).show()
            setBalance()
        }

        buttonB.setOnClickListener {
            Toast.makeText(this, "Button B", Toast.LENGTH_SHORT).show()
            setBalance()
        }

        buttonC.setOnClickListener {
            Toast.makeText(this, "Button C", Toast.LENGTH_SHORT).show()
            setBalance()
        }



    }

}

