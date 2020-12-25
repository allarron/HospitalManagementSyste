package com.example.hospitalmanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        regnow.setOnClickListener{
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }

        signin.setOnClickListener{
            val intent = Intent(this, doctors_page::class.java)
            startActivity(intent)
        }
    }
}