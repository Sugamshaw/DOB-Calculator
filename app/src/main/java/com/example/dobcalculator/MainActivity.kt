package com.example.dobcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //hexa code are used for colour code
        //0123456789ABCDEF -> hexadecimal values
        //000000 -> white (red,green,blue)
        //1
        val btnSelectDate:Button=findViewById(R.id.btnSelectDate)

        btnSelectDate.setOnClickListener {
            Toast.makeText(this@MainActivity,"Button clicked",Toast.LENGTH_LONG).show()
        }

    }
}