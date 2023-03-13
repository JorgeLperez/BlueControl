package com.example.bluecontrol

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SendMovetoFront (view: View) {
        Toast.makeText(this, "Mover para el frente", Toast.LENGTH_SHORT).show();
    }
    fun SendMovetoBack (view: View) {
        Toast.makeText(this, "Mover para atrás", Toast.LENGTH_SHORT).show();
    }
    fun SendMovetoLeft (view: View) {
        Toast.makeText(this, "Mover para la izquierda", Toast.LENGTH_SHORT).show();
    }
    fun SenMovetoRight (view: View) {
        Toast.makeText(this, "Mover para la derecha", Toast.LENGTH_SHORT).show();
    }
}