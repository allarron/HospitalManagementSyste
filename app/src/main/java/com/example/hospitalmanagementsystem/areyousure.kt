package com.example.hospitalmanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_areyousure.*
import kotlinx.android.synthetic.main.activity_patients_page.*

class areyousure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areyousure)

        yesBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        noBtn.setOnClickListener{
            val intent = Intent(this, patients_page::class.java)
            startActivity(intent)
        }
    }
}