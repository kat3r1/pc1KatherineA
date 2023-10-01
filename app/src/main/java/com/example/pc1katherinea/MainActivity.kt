package com.example.pc1katherinea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener (View.OnClickListener()){

        }
    }

    private fun btnCalcular(){
        val exaParcial: EditText = findViewById(R.id.etExaParcial)
        val exaFinal: EditText = findViewById(R.id.etExaFinal)
        val exapromPEP: EditText = findViewById(R.id.etPromedio)

    }

}