package com.example.project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class lab09 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab09)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent1 = Intent(this, lab09_wykl::class.java)
            startActivity(intent1)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent2 = Intent(this, lab09_kody::class.java)
            startActivity(intent2)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent3 = Intent(this, lab09_quiz::class.java)
            startActivity(intent3)
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent4 = Intent(this, lab09_linki::class.java)
            startActivity(intent4)
        }
    }
}