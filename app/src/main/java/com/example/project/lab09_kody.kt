package com.example.project

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


class lab09_kody : AppCompatActivity() {
    var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab09_kody)
        textView = findViewById(R.id.textView)
    }

    @Throws(IOException::class)
    fun readTextFile1(view: View?) {
        var string: String? = ""
        val stringBuilder = StringBuilder()
        val `is`= this.resources.openRawResource(R.raw.lab09_kod1)
        val reader = BufferedReader(InputStreamReader(`is`))
        while (true) {
            try {
                if (reader.readLine().also { string = it } == null) break
            } catch (e: IOException) {
                e.printStackTrace()
            }
            stringBuilder.append(string).append("\n")
            textView!!.text = stringBuilder
        }
        `is`.close()
        Toast.makeText(
            baseContext, stringBuilder.toString(),
            Toast.LENGTH_LONG
        )//.show()
    }
    fun readTextFile2(view: View?) {
        var string: String? = ""
        val stringBuilder = StringBuilder()
        val `is`= this.resources.openRawResource(R.raw.lab09_kod2)
        val reader = BufferedReader(InputStreamReader(`is`))
        while (true) {
            try {
                if (reader.readLine().also { string = it } == null) break
            } catch (e: IOException) {
                e.printStackTrace()
            }
            stringBuilder.append(string).append("\n")
            textView!!.text = stringBuilder
        }
        `is`.close()
        Toast.makeText(
                baseContext, stringBuilder.toString(),
                Toast.LENGTH_LONG
        )//.show()
    }
    fun readTextFile3(view: View?) {
        var string: String? = ""
        val stringBuilder = StringBuilder()
        val `is`= this.resources.openRawResource(R.raw.lab09_kod3)
        val reader = BufferedReader(InputStreamReader(`is`))
        while (true) {
            try {
                if (reader.readLine().also { string = it } == null) break
            } catch (e: IOException) {
                e.printStackTrace()
            }
            stringBuilder.append(string).append("\n")
            textView!!.text = stringBuilder
        }
        `is`.close()
        Toast.makeText(
                baseContext, stringBuilder.toString(),
                Toast.LENGTH_LONG
        )//.show()
    }


}