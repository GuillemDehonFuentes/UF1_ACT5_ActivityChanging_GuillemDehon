package com.example.uf1_act5_activitychanging

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Activity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val boton2 = findViewById<Button>(R.id.pimpom2)
        boton2.setOnClickListener{
            finish()
        }
    }
}