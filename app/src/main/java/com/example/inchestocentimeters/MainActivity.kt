package com.example.inchestocentimeters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val inchValue=2.54
    private lateinit var enterInches:EditText
    private lateinit var covertButton: Button
    private lateinit var textViewCentimeters:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enterInches=findViewById(R.id.editTextInches)
        covertButton=findViewById(R.id.button_covert)
        textViewCentimeters=findViewById(R.id.textViewConvert)
        covertButton.setOnClickListener {
            val inputText = enterInches.text.toString()
            val inches = inputText.toDoubleOrNull()
            if (inches != null) {
                val result = inches * inchValue
                textViewCentimeters.text = result.toString()
            } else {
                textViewCentimeters.text = getString(R.string.text)
            }
        }



    }
}