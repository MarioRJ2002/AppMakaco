package com.example.appmakacomarioramirez

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import android.app.Activity



class ActivityBonosExtra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitybonosextra)

        /*fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
            super.onActivityResult(requestCode, resultCode, data)
            when (requestCode) {
                if Confirmacion{
                    if (resultCode == Activity.RESULT_OK) {
                        val returnValue = data.getStringExtra("result")
                    }
                }
            }
        }*/

        var wifi = ""
        var mins = ""
        var Butt = findViewById<Button>(R.id.button4)
        var vuat = findViewById<Button>(R.id.button7)
        var tv5 = findViewById<TextView>(R.id.textView5)
        var tv6 = findViewById<TextView>(R.id.textView6)
        var tv7 = findViewById<TextView>(R.id.textView7)
        var tv9 = findViewById<TextView>(R.id.textView9)
        var tv10 = findViewById<TextView>(R.id.textView10)

        var B1 = findViewById<Switch>(R.id.switch1)
        var B2 = findViewById<Switch>(R.id.switch2)
        var B3 = findViewById<Switch>(R.id.switch3)
        var B4 = findViewById<Switch>(R.id.switch6)
        var B5 = findViewById<Switch>(R.id.switch5)

        Butt.setOnClickListener(){
            var mensaje = wifi + "" + mins
            val intent = Intent(this, Confirmacion::class.java)

            intent.putExtra("Mensaje", mensaje )
            startActivity(intent)
        }

        B1.setOnClickListener(){
            if(B2.isChecked){
                B2.isChecked=false
            }
            if(B3.isChecked){
                B3.isChecked=false
            }
            wifi = tv5.text.toString()
        }
        B2.setOnClickListener(){
            if(B1.isChecked){
                B1.isChecked=false
            }
            if(B3.isChecked){
                B3.isChecked=false
            }
            wifi = tv6.text.toString()
        }
        B3.setOnClickListener(){
            if(B2.isChecked){
                B2.isChecked=false
            }
            if(B1.isChecked){
                B1.isChecked=false
            }
            wifi = tv7.text.toString()
        }
        B4.setOnClickListener(){
            if(B5.isChecked){
                B5.isChecked=false
            }
            mins = tv9.text.toString()
        }
        B5.setOnClickListener(){
            if(B4.isChecked){
                B4.isChecked=false
            }
            mins = tv10.text.toString()
        }
        vuat.setOnClickListener(){
            val resultIntent = Intent()
            resultIntent.putExtra("msg", "returnValue")
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}