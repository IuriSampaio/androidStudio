package com.example.reciclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerview.R
import com.example.reciclerview.model.jogo
import kotlinx.android.synthetic.main.layout_lista_jogos.view.*


class JogosRecyclerAdapter(var listaJogos: ArrayList<jogo>):
    RecyclerView.Adapter<JogosRecyclerAdapter.JogoViewHolder>() {
    override fun getItemCount(): Int {
        return  listaJogos.size
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        val jogo = listaJogos[position]
        holder.bind(jogo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_lista_jogos,parent,false)
        return  JogoViewHolder(itemView)
    }

    class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(jogo: jogo){
            itemView.txtNomeJogo.text = jogo.nomeJogo
            itemView.txtVideoGame.text = jogo.consoleJogo
            itemView.estrelinha.numStars = jogo.notaJogo.toFloat().toInt()
        }
    }
    }