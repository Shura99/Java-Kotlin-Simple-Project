package com.example.project

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class lab09_wykl : AppCompatActivity() {
    private var iv_display: ImageView? = null
    private var btn_right: Button? = null
    private var btn_left: Button? = null
    private var current_image_index = 0
    private val images = intArrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3,
        R.drawable.img4, R.drawable.img5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab12_wykl)
        DisplayImage()
        SwitchButton()
    }

    fun DisplayImage() {
        iv_display = findViewById<View>(R.id.iv_display) as ImageView
    }
    fun SwitchButton() {
        btn_right = findViewById<View>(R.id.btn_right) as Button
        btn_left = findViewById<View>(R.id.btn_left) as Button
        btn_right!!.setOnClickListener {
            current_image_index++
            current_image_index = current_image_index % images.size
            iv_display!!.setImageResource(images[current_image_index])
        }
        btn_left!!.setOnClickListener {
            current_image_index--
            if (current_image_index < 0) {
                current_image_index = images.size - 1
            }
            iv_display!!.setImageResource(images[current_image_index])
        }
    }
}