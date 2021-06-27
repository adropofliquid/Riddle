package com.example.riddle399

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val name = intent.getStringExtra("name").toString()
        val welcome : TextView = findViewById(R.id.textView)

        if(name.isNotEmpty()){
            welcome.text = "Welcome "+name
        }


        val start : Button = findViewById(R.id.button)
        start.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("category","Random")
            startActivity(intent) }


        val categories : Button = findViewById(R.id.button2)
        categories.setOnClickListener {
            val intent = Intent(this, CategoriesActivity::class.java)
            startActivity(intent) }


        val getMore : Button = findViewById(R.id.button3)
        getMore.setOnClickListener {
            val intent = Intent(this, GetMoreInfo::class.java)
            startActivity(intent) }
    }
}