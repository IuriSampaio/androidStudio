package com.example.reciclerview.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reciclerview.R
import com.example.reciclerview.adapter.JogosRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import com.example.reciclerview.dataSource.dataSource
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarRecyclerView()

        insertToolbar()

        cadastrarFilme.setOnClickListener(this)
    }
    // função que inicia a recyclerView
    private fun iniciarRecyclerView(){
        //LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false) --> se colocasse isso no lugar do que esta ali em baixo o barato ia ficar andando de lado
        recyclerViewFilmes.layoutManager=LinearLayoutManager(applicationContext)
        recyclerViewFilmes.adapter=JogosRecyclerAdapter(dataSource.getFilmes())
    }
    override fun onClick(v: View) {
        // DoubleBang (!!) -> significa que ele deve tentar executar mesmo com a possibidade de ser nulo
        // ou pode-se tirar a interogação que diz que o componente passado pelo onclick pode ser nulo
        if (v.id == R.id.cadastrarFilme){
            val intent = Intent(this,cadastroFilmeActivity::class.java)
            startActivity(intent)
        }
    }
    private fun insertToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Filmes Cadastrados"
    }

}
