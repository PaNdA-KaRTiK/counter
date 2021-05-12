package com.example.counter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        btnCountIncrement.setOnClickListener{
            count++;
            tvCount.text = "Current Count is: $count"

        }

        btnCountDecrement.setOnClickListener {
            count--;
            if (count < 0) {
                tvCount.text = "Current Count is: 0"
                count = 0
            } else {
                tvCount.text = "Current Count is: $count"
            }
        }
    }
}