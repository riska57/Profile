package com.example.riskaanggun

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class SchoolAdapter (private val list: ArrayList<SchoolData>):
    RecyclerView.Adapter<SchoolAdapter.SchoolViewHorder>(){

    class SchoolViewHorder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namasekolah)
        private val alamat = itemView.findViewById<TextView>(R.id.alamatsekolah)

        fun bind(get: SchoolData) {
            nama.text = get.nama
            alamat.text = get.alamat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolViewHorder {
        return SchoolViewHorder(LayoutInflater.from(parent.context)
            .inflate(R.layout.school_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SchoolViewHorder, position: Int) {
        holder.bind(list[position])
    }

}