package com.bmi.eep.bmi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
        if ((message.toFloat() < 18.5)||(message.toFloat()> 30)) {
            imageView2.visibility = View.VISIBLE
            imageView.visibility = View.INVISIBLE
        } else {
            imageView.visibility = View.VISIBLE
            imageView2.visibility = View.INVISIBLE
        }
    }
}
