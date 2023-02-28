package com.example.bluecontrol

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    private val moveF = "moveFront"
    private val moveB = "moveBack"
    private val moveR = "moveRight"
    private val moveL = "moveLeft"
    private var change = findViewById<TextView>(R.id.DisplayCommand)
    fun moveFront(view: View) {
        change.text = moveF
    }

    fun moveBack(view: View) {
        change.text = moveB
    }
    fun moveRight(view: View) {
        change.text = moveR
    }
    fun moveLeft(view: View) {
        change.text = moveL
    }


}