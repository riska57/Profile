package com.example.riskaanggun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class portofolioActivity : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: portofolioAdapter
    var listportofolio = ArrayList<portofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)


        listportofolio.add(portofolioData(
            R.drawable.web, "portal-berita",
            "projek membuat protal berita menggunakan ci", "https://github.com/riska57/portal-berita"
        ))

        listportofolio.add(portofolioData(
            R.drawable.android, "UJIAN_PRAKTEK_3026",
            "projek ujian praktek", "https://github.com/riska57/UJIAN_PRAKTEK_3026"
        ))

        portofolioView = findViewById(R.id.rvportofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = portofolioAdapter(listportofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter

    }
}