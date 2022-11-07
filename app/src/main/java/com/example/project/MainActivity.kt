package com.example.project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val button = findViewById<Button>(R.id.button1)
            button.setOnClickListener{
                val intent9 = Intent(this, lab09::class.java)
                startActivity(intent9)
            }
            val button5 = findViewById<Button>(R.id.button5)
            button5.setOnClickListener{
                val intent12 = Intent(this, lab12::class.java)
                startActivity(intent12)
            }

        }
}
