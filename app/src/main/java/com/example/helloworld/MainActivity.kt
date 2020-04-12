package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        //val btn_click_me = findViewById(R.id.button) as Button
        // set on-click listener
        var tClicked = 0
        button.setOnClickListener {
            tClicked += 1
            textView.text=tClicked.toString()

           // Toast.makeText(this@MainActivity, "Hi.", Toast.LENGTH_SHORT).show()
        }
    }
}
