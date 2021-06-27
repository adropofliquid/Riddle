package com.example.riddle399

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout

class CategoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Categories"
        supportActionBar!!.setDisplayShowTitleEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.icon)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val science : ConstraintLayout = findViewById(R.id.science)
        val time : ConstraintLayout = findViewById(R.id.time)
        val love : ConstraintLayout = findViewById(R.id.love)
        val sports : ConstraintLayout = findViewById(R.id.sports)
        val money : ConstraintLayout = findViewById(R.id.money)


        science.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("category","Science")
            startActivity(intent)
        }

        time.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("category","Time")
            startActivity(intent)
        }
        love.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("category","Love")
            startActivity(intent)
        }
        sports.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("category","Sports")
            startActivity(intent)
        }
        money.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            intent.putExtra("category","Money")
            startActivity(intent)
        }
    }
}