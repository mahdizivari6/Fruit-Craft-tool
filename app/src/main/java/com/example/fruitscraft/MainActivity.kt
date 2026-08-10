package com.example.fruitscraft

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Fruit Craft Tool"
        text.textSize = 30f

        setContentView(text)
    }
}
