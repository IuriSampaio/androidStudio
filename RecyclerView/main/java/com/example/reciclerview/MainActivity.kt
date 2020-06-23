package com.example.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reciclerview.adapter.JogosRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import com.example.reciclerview.dataSource.dataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = recyclerViewJogos
        recyclerView.layoutManager=LinearLayoutManager(applicationContext)
        recyclerView.adapter=JogosRecyclerAdapter(dataSource.getJogos())
    }
}
