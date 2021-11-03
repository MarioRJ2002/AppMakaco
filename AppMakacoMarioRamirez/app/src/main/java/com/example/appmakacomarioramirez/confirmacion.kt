package com.example.appmakacomarioramirez

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.app.Activity

import android.content.Intent




class Confirmacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var tv = findViewById<TextView>(R.id.textView11)
        var aceptar = findViewById<Button>(R.id.button6)
        var cancelar = findViewById<Button>(R.id.button5)

        val parametros = this.intent.extras
        if (parametros != null) {
            val datos = parametros.getString("mensaje")
            tv.setText(datos)
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.confirmacion)

    aceptar.setOnClickListener(){
        val resultIntent = Intent()
        resultIntent.putExtra("result", tv.text.toString())
        setResult(RESULT_OK, resultIntent)
        finish()
    }

        cancelar.setOnClickListener(){
            finish()
        }

    }
}