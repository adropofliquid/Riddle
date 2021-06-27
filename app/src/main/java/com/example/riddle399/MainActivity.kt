package com.example.riddle399

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name : EditText = findViewById(R.id.editText)
        val submit : Button = findViewById(R.id.button5)


        submit.setOnClickListener {
                if(name.length() < 1 ){
                    Toast.makeText(this, "Please input your name to continue", Toast.LENGTH_LONG).show()
                }
                else{
                    val intent = Intent(this, Home::class.java)
                    intent.putExtra("name",name.text.toString())
                    startActivity(intent)
                }
             }


    }
}