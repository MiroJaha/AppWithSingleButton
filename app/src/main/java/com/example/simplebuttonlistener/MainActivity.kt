package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var kotlinButton: Button
    private lateinit var entryET: EditText
    private lateinit var showTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton= findViewById(R.id.kotlinButton)
        entryET= findViewById(R.id.entryET)
        showTV= findViewById(R.id.showTV)

        kotlinButton.setOnClickListener{
            if (entryET.text.isNotBlank())
                showTV.text= entryET.text
            else
                showTV.text= "Error"
            Toast.makeText(this,"Coding 1",Toast.LENGTH_SHORT).show()
        }

    }

    fun xmlClick(view: View) {
        Toast.makeText(this,"Coding 2",Toast.LENGTH_SHORT).show()
    }
}