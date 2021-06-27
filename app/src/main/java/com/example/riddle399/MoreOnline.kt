package com.example.riddle399

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import org.jsoup.Jsoup
import java.io.IOException
import kotlin.collections.ArrayList

class MoreOnline : AppCompatActivity() {

    private val allRiddlesOnline : ArrayList<RiddleItem> = ArrayList()

    private lateinit var progressBar : ProgressBar
    private lateinit var  questionsTxt : TextView
    private lateinit var  answersTxt : TextView

    private var question : String = ""
    private var answer : String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_online)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Online Riddles"
        supportActionBar!!.setDisplayShowTitleEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.icon)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        progressBar = findViewById(R.id.progressBar)
        questionsTxt = findViewById(R.id.textView2)
        answersTxt = findViewById(R.id.textView4)

        GetSomeRiddles().execute()

        val nextButton : Button = findViewById(R.id.button3)
        val showButton : Button = findViewById(R.id.button2)


        nextButton.setOnClickListener {
            showNextRiddle()
        }

        showButton.setOnClickListener {
            showAnswer()
        }


    }

    fun riddlesOnline() : ArrayList<RiddleItem>{

        val howMany = (0 until 25).random() //any pages in dis range
        val allRiddles = ArrayList<RiddleItem>()

        try {
            val document =  Jsoup.connect("https://riddles.fyi/page/"+howMany).get()
            var article = document.getElementsByTag("article")

            for(articles in article){
                var question = articles.select("div header h2 a").text()
                var answer = articles.select("div div div div.su-spoiler-content").text()

                allRiddles.add(RiddleItem(question,answer))
            }


            } catch (e: IOException) {
                e.printStackTrace()
            }
        return allRiddles
    }


    fun showNextRiddle(){
        val couldnt = "Could not get riddles online, check your internet"
        if(allRiddlesOnline.isEmpty()){
            Toast.makeText(this,couldnt,Toast.LENGTH_LONG).show()
        }
        else{
            val rnds = (0 until allRiddlesOnline.size).random()
            val aRiddle = allRiddlesOnline.get(rnds)

            question = aRiddle.question
            answer = aRiddle.answer


            questionsTxt.text = question //change question
            answersTxt.text = ""
        }
    }

    fun showAnswer(){
        if (answer.isNotEmpty() && answersTxt.text.isEmpty())
            answersTxt.text = answer
    }



    inner class GetSomeRiddles : AsyncTask<Void, Void, Void>() {
        private var riddles : ArrayList<RiddleItem> =  ArrayList()


        override fun doInBackground(vararg params: Void): Void? {

            riddles.addAll(riddlesOnline())
            riddles.addAll(riddlesOnline())
            riddles.addAll(riddlesOnline())
            riddles.addAll(riddlesOnline())
            riddles.addAll(riddlesOnline())

            return null
        }

        override fun onPostExecute(aVoid: Void?) {
            super.onPostExecute(aVoid)
            progressBar.visibility = View.GONE// remove the progressBar
            allRiddlesOnline.addAll(riddles)//and set the ridddles

            showNextRiddle()
        }
    }
}