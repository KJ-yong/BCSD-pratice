package com.example.bcsdpractice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.textView)
        val buttonToast = findViewById<Button>(R.id.buttonToast)
        val buttonCount = findViewById<Button>(R.id.buttonCount)
        val buttonRandom = findViewById<Button>(R.id.buttonRandom)
        text.text = "0"
        buttonToast.setOnClickListener {
            Toast.makeText(this, "TOAST", Toast.LENGTH_SHORT).show()
        }
        buttonCount.setOnClickListener {
            text.text = (text.text.toString().toInt()+1).toString()
        }
        buttonRandom.setOnClickListener {
            Intent(this, RandomActivity::class.java).apply {
                putExtra("number",text.text.toString())
                startActivity(this)
            }
        }
    }
}