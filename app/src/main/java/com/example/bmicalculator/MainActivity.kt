package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateButton.setOnClickListener{

            val change:Double = heightInput.text.toString().toDouble() / 100
            val result: Double = weightInput.text.toString().toDouble() / ( change * change)

            if(result < 18.5)
            {
                imageView.setImageResource(R.drawable.pic3)
            }

            else if(result > 18.5 && result <= 24.9)
            {
                imageView.setImageResource(R.drawable.pic1)
            }

            else
            {
                imageView.setImageResource(R.drawable.pic2)
            }
        }

        resetButton.setOnClickListener{
            weightInput.text = null;
            heightInput.text = null;
            imageView.setImageResource(R.drawable.pic0)
        }
    }
}
