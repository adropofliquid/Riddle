package com.example.riddle399

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        val category = intent.getStringExtra("category").toString()

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = category+" Riddles"
        supportActionBar!!.setDisplayShowTitleEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.icon)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val riddles = getFromCategory(category)

        var question = riddles.get(0).question
        var answer = riddles.get(0).answer

        val questionsTxt : TextView= findViewById(R.id.textView2)
        val answersTxt : TextView= findViewById(R.id.textView4)

        questionsTxt.text = question

        val nextButton : Button = findViewById(R.id.button3)
        val showButton : Button = findViewById(R.id.button2)

        nextButton.setOnClickListener {
            val rnds = (0 until riddles.size).random()
            val aRiddle = riddles.get(rnds)

            question = aRiddle.question
            answer = aRiddle.answer


            questionsTxt.text = question //change question
            answersTxt.text = ""

        }

        showButton.setOnClickListener {
            if (answer.isNotEmpty() && answersTxt.text.isEmpty())
            answersTxt.text = answer
        }

    }

    private fun  getFromCategory(category : String) : ArrayList<RiddleItem>{
        var riddles : ArrayList<RiddleItem>
        when (category) {
            "Science" -> riddles = Riddles().getScienceRiddles()
            "Time" -> riddles = Riddles().getTimeRiddles()
            "Love" -> riddles = Riddles().getLoveRiddles()
            "Sports" -> riddles = Riddles().getSportsRiddles()
            "Money" -> riddles = Riddles().getMoneyRiddles()
            else -> {
                riddles = Riddles().getAllRiddles()
            }
        }
        return riddles
    }
}