package com.example.riskaanggun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rveducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("TK Dian Rahayu", "DS.Tangkis Kec.Guntur,Kab Demak"))
        list.add(SchoolData("SDN Tangkis 2", "Ds.Tangkis Kec.Guntur,Kab.Demak"))
        list.add(SchoolData("SMPN 3 Guntur", "DS.Tangkis Kec.Guntur,Kab.Demak"))
        list.add(SchoolData("SMKN 1 Sayung", "Jl. Raya Semarang-Demak"))

        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter
    }
}