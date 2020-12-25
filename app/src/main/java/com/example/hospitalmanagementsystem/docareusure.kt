package com.example.hospitalmanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_areyousure.*
import kotlinx.android.synthetic.main.activity_docareusure.*

class docareusure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_docareusure)

        yess.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        noo.setOnClickListener{
            val intent = Intent(this, doctors_page::class.java)
            startActivity(intent)
        }
    }
}