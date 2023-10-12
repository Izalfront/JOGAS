package com.example.jogas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Recyclerview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val items = ArrayList<Item>()
        items.add(Item("John Wick", "jhonwick@gmail.com", R.drawable.post))
        items.add(Item("John Wicki", "jhonwiiick@gmail.com", R.drawable.post))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(this, items)
    }
}
