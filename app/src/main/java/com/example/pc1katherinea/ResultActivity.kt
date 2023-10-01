package com.example.pc1katherinea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)

        val message = intent.getStringExtra("param")
        val textView = findViewById<TextView>(R.id.txtNota)


    }


}