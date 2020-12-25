package com.example.hospitalmanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_docareusure.*
import kotlinx.android.synthetic.main.activity_test_results.*

class TestResults : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_results)

        PDF.setOnClickListener{
            val intent = Intent(this, patients_page::class.java)
            startActivity(intent)
        }
    }
}