package com.example.riskaanggun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity_skill : AppCompatActivity() {

    lateinit var SkillView: RecyclerView
    lateinit var SkillAdapter: SkillAdapter
    val list = ArrayList<SkillData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        SkillView = findViewById(R.id.rvskill)
        SkillView.layoutManager = LinearLayoutManager(this)

        list.add(SkillData("Kotlin", "Pemrograman Android"))
        list.add(SkillData("Laravel", "Pemrograman Web"))

        SkillAdapter = SkillAdapter(list)
        SkillView.adapter = SkillAdapter
    }
}