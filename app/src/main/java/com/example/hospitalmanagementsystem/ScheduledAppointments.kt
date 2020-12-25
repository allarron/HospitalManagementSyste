package com.example.hospitalmanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_request.*
import kotlinx.android.synthetic.main.activity_scheduled_appointments.*

class ScheduledAppointments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scheduled_appointments)

        buttonMenu.setOnClickListener{
            val intent = Intent(this, doctors_page::class.java)
            startActivity(intent)
        }

        buttonMenu.setOnClickListener{
            val intent = Intent(this, doctors_page::class.java)
            startActivity(intent)
        }
    }
}