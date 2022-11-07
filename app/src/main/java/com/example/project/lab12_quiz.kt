package com.example.project

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class lab12_quiz : AppCompatActivity() {
    var tv1: TextView? = null
    var tv2: TextView? = null
    var a: RadioButton? = null
    var b: RadioButton? = null
    var c: RadioButton? = null
    var d: RadioButton? = null
    var btn: Button? = null
    var rg: RadioGroup? = null
    var qnumber = 0
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab12_quiz)
        tv1 = findViewById<View>(R.id.question) as TextView
        tv2 = findViewById<View>(R.id.response) as TextView
        rg = findViewById<View>(R.id.optionGroup) as RadioGroup
        a = findViewById<View>(R.id.option1) as RadioButton
        b = findViewById<View>(R.id.option2) as RadioButton
        c = findViewById<View>(R.id.option3) as RadioButton
        d = findViewById<View>(R.id.option4) as RadioButton
        btn = findViewById<View>(R.id.next) as Button
        qnumber = 0
        score = 0
    }

    fun quiz(v: View?) {
        when (qnumber) {
            0 -> {
                rg!!.visibility = View.VISIBLE
                a!!.isChecked = false
                b!!.isChecked = false
                c!!.isChecked = false
                d!!.isChecked = false
                tv2!!.text = ""
                a!!.isEnabled = true
                b!!.isEnabled = true
                c!!.isEnabled = true
                d!!.isEnabled = true
                btn!!.text = "Next"
                score = 0
                tv1!!.text = "1. Pakiet biblioteki Swing ?"
                a!!.text = "java.swing"
                b!!.text = "java.awt"
                c!!.text = "javax.swing"
                d!!.text = "javax.awt"
                rg!!.clearCheck()
                qnumber = 1
            }

            1 -> {
                tv1!!.text = "2. Która technologia jest związana z JavaFX ?"
                a!!.text = "JSP"
                b!!.text = "FXML"
                c!!.text = "JSF"
                d!!.text = "EJB"
                if (c!!.isChecked) {
                    score = score + 1
                }
                a!!.isChecked = false
                b!!.isChecked = false
                c!!.isChecked = false
                d!!.isChecked = false
                rg!!.clearCheck()
                qnumber = 2
            }

            2 -> {
                tv1!!.text = "3. Który pakiet związany jest z serwletami ?"
                a!!.text = "javax.servlet"
                b!!.text = "java.servlet"
                c!!.text = "javaee.servlet"
                d!!.text = "javae.servlet"
                if (b!!.isChecked) {
                    score = score + 1
                }
                a!!.isChecked = false
                b!!.isChecked = false
                c!!.isChecked = false
                d!!.isChecked = false
                rg!!.clearCheck()
                qnumber = 3
            }

            3 -> {
                tv1!!.text = "4. Który pakiet związany jest z platformą Android ?"
                a!!.text = "javax.android"
                b!!.text = "java.android"
                c!!.text = "android.java"
                d!!.text = "android.app"
                if (a!!.isChecked) {
                    score = score + 1
                }
                a!!.isChecked = false
                b!!.isChecked = false
                c!!.isChecked = false
                d!!.isChecked = false
                rg!!.clearCheck()
                qnumber = 4
            }

            4 -> {
                tv1!!.text = "5. Która technologia jest bezpośrednio związana z obsługą transakcji ?"
                a!!.text = "JDBC"
                b!!.text = "EJB"
                c!!.text = "JTA"
                d!!.text = "JPA"
                if (d!!.isChecked) {
                    score = score + 1
                }
                a!!.isChecked = false
                b!!.isChecked = false
                c!!.isChecked = false
                d!!.isChecked = false
                btn!!.text = "Finish"
                rg!!.clearCheck()
                qnumber = 5
            }

            5 -> {
                a!!.isEnabled = false
                b!!.isEnabled = false
                c!!.isEnabled = false
                d!!.isEnabled = false
               // rg!!.clearCheck()
                if (c!!.isChecked) {
                    score = score + 1
                }
                tv1!!.text = ""
                tv2!!.text = "Wynik testu: $score/5"
                btn!!.text = "Restart"
                rg!!.clearCheck()
                qnumber = 0
            }
        }
    }
}