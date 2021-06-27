package com.example.riddle399

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class GetMoreInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_more_info)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Acknowledgement"
        supportActionBar!!.setDisplayShowTitleEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.icon)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val getMore : Button = findViewById(R.id.button)
        val checkBox : CheckBox = findViewById(R.id.checkBox)

        getMore.setOnClickListener {

            if (checkBox.isChecked) {
                val intent = Intent(this, MoreOnline::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this, "Please check the box to proceed", Toast.LENGTH_SHORT).show()
        }


    }
}