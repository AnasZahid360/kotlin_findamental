package eu.tutorials.kotlin_findamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIncrement = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        val btnReset = findViewById<Button>(R.id.mybutton2)
        val btnDecrement = findViewById<Button>(R.id.mybutton3)
        var timesClicked = 0
        btnIncrement.setOnClickListener {
            timesClicked ++

            tvMyTextView.text = timesClicked.toString()
        }

        btnReset.setOnClickListener {
            timesClicked = 0
            tvMyTextView.text = timesClicked.toString()
        }
btnDecrement.setOnClickListener {
    timesClicked --

    tvMyTextView.text = timesClicked.toString()
}
        }

    }

