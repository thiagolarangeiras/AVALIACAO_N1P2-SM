package com.example.thiagolarangeiran1p1

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun trocar_tela(view: View){
        val editText = findViewById<EditText>(R.id.editText2)
        val message = editText.text.toString()
        val intent = Intent(this, tela2::class.java).apply {
            putExtra(message, message)
        }
        startActivity(intent)
    }
}