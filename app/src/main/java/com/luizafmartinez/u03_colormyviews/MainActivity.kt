package com.luizafmartinez.u03_colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {

        val box_one_text = findViewById<TextView>(R.id.box_one_text)
        val box_two_text = findViewById<TextView>(R.id.box_two_text)
        val box_three_text = findViewById<TextView>(R.id.box_three_text)
        val box_four_text = findViewById<TextView>(R.id.box_four_text)
        val box_five_text = findViewById<TextView>(R.id.box_five_text)

        val red_button = findViewById<TextView>(R.id.box_three_text)
        val yellow_button = findViewById<TextView>(R.id.box_four_text)
        val green_button = findViewById<TextView>(R.id.box_five_text)

        val clickableViews: List<View> = listOf( box_one_text,
            box_two_text, box_three_text, box_four_text,
            box_five_text,  red_button, yellow_button, green_button)

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it) }
        }
    }


    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using Custom colors for background
            R.id.box_three_text -> view.setBackgroundResource(R.color.my_red)
            R.id.box_four_text -> view.setBackgroundResource(R.color.my_yellow)
            R.id.box_five_text -> view.setBackgroundResource(R.color.my_green)
          /*  R.id.red_button -> view.setBackgroundResource(@android:color/m)
            R.id.yellow_button -> view.setBackgroundResource(android.R.color.)
            R.id.green_button -> view.setBackgroundResource(android.R.color.my_green)*/

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}