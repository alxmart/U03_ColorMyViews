package com.luizafmartinez.u03_colormyviews

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.graphics.convertTo
import androidx.core.graphics.red
import androidx.core.graphics.toColor
import com.luizafmartinez.u03_colormyviews.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

     fun setListeners() {

        val box_one_text = findViewById<TextView>(R.id.box_one_text)
        val box_two_text = findViewById<TextView>(R.id.box_two_text)
        val box_three_text = findViewById<TextView>(R.id.box_three_text)
        val box_four_text = findViewById<TextView>(R.id.box_four_text)
        val box_five_text = findViewById<TextView>(R.id.box_five_text)

        val red_button = findViewById<Button>(R.id.red_button)
        val yellow_button = findViewById<Button>(R.id.yellow_button)
        val green_button = findViewById<Button>(R.id.green_button)

        val clickableViews: List<View> = listOf( box_one_text,
            box_two_text, box_three_text, box_four_text,
            box_five_text,  red_button, yellow_button, green_button)

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it) }
        }
    }

      fun makeColored(view: View) {

        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using Custom colors for background
            R.id.red_button -> {
                val box_three_text = findViewById<TextView>(R.id.box_three_text)
                box_three_text.setBackgroundResource(R.color.my_red)
            }
            R.id.yellow_button -> {
                val box_four_text = findViewById<TextView>(R.id.box_four_text)
                box_four_text.setBackgroundResource(R.color.my_yellow)
            }
            R.id.green_button -> {
                val box_five_text = findViewById<TextView>(R.id.box_five_text)
                box_five_text.setBackgroundResource(R.color.my_green)
            }

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}