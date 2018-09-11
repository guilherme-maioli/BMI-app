package com.bmi.eep.bmi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

const val EXTRA_MESSAGE="com.example.guilherme.myapplication.message"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun sendMessage(view: View) {
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)

        val message = editText4.text.toString()
        val peso : Float = message.toFloat()
        val saltura : String = editText3.text.toString()
        val altura : Float = saltura.toFloat()

        val result : Float = peso / (altura.pow(2))

        val message2 : String = result.toString()
        // PESO / (ALTURA^2)
        // PESO KG E ALTURA M

        val intent = Intent(this, Main2Activity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message2)
        }
        startActivity(intent)
    }

}