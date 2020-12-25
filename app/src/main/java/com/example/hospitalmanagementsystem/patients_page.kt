package com.example.hospitalmanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_patients_page.*

class patients_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patients_page)

        schedule.setOnClickListener{
            val intent = Intent(this, MakeAppointment::class.java)
            startActivity(intent)
        }

        logOut.setOnClickListener{
            val intent = Intent(this, areyousure::class.java)
            startActivity(intent)
        }

        testResults.setOnClickListener{
            val intent = Intent(this, TestResults::class.java)
            startActivity(intent)
        }
    }


}