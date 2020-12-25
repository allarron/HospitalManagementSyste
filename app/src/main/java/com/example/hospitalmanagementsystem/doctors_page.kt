package com.example.hospitalmanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doctors_page.*
import kotlinx.android.synthetic.main.activity_request.*


class doctors_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctors_page)

        schedule.setOnClickListener{
            val intent = Intent(this, ScheduledAppointments::class.java)
            startActivity(intent)
        }

        logout.setOnClickListener{
            val intent = Intent(this, docareusure::class.java)
            startActivity(intent)
        }
    }
}