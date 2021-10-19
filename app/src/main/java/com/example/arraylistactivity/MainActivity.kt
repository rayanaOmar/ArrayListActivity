package com.example.arraylistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.textView2)

        var names = ArrayList<String>()
        button1.setOnClickListener {
            val userEnter = editText1.text.toString()
            names.add(userEnter)
            editText1.text.clear()
        }
        button2.setOnClickListener {
            val userEnter2 = editText2.text.toString().toInt()
            textView.setText(names[userEnter2])
            editText2.text.clear()
        }
    }
}