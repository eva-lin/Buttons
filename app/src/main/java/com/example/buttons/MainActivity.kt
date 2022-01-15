package com.example.buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun turnSecondDisplay(view: View) {
        val openDisplay = Intent(this, SecondActivity::class.java)
        startActivity(openDisplay)
    }
}