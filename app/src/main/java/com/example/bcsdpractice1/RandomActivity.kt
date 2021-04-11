package com.example.bcsdpractice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class RandomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        val text = findViewById<TextView>(R.id.textView)
        val random = findViewById<TextView>(R.id.textRandom)
        text.text = "Here is random number between 0 and ${intent.extras?.getString("number")?:"0"}"
        random.text = Random.nextInt(intent.extras?.getString("number")?.toInt()?:0).toString()
    }
}