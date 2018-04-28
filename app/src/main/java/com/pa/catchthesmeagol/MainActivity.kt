package com.pa.catchthesmeagol

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var score : Int = 0
    var imageArray = ArrayList<ImageView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        score = 0
        imageArray

        //// countdown for 30 seconds on the timer text
        object: CountDownTimer(30000, 1000) {
            override fun onFinish() {
                timeText.text = "Time is up!"
            }

            override fun onTick(p0: Long) {
                timeText.text = "Time: " + p0 / 1000
            }

        }.start()

    }

    //// increase score by one when imageview is clicked an report it into the scoretext
    fun increaseScore (view: View) {

        score++

        scoreText.text = "Score: " + score

    }

}
