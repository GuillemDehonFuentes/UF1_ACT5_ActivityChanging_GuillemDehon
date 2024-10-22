package com.example.uf1_act5_activitychanging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val boton1 = findViewById<Button>(R.id.pimpom1)
        boton1.setOnClickListener{
                 val intent = Intent(this, Activity2::class.java)
                startActivity(intent)
        }



    }

}