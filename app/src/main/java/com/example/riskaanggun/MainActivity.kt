package com.example.riskaanggun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnprofile : CardView = findViewById(R.id.profile)
        val btnportofolio : CardView = findViewById(R.id.portofolio)
        val btnskill : CardView = findViewById(R.id.skill)
        val btneducation : CardView = findViewById(R.id.education)
        val btnhobby : CardView = findViewById(R.id.hobby)

        btnprofile.setOnClickListener {
            val intent = Intent(this, ActivitProfileActivity::class.java)
            startActivity(intent)
        }

        btnportofolio.setOnClickListener {
            val intent = Intent(this, portofolioActivity::class.java)
            startActivity(intent)
        }

        btnskill.setOnClickListener {
            val intent = Intent(this, Activity_skill::class.java)
            startActivity(intent)
        }

        btneducation.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        btnhobby.setOnClickListener {
            val intent = Intent(this, Hobby_Activity::class.java)
            startActivity(intent)
        }

    }
}