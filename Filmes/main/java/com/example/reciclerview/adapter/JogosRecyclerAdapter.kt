package com.example.reciclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerview.R
import com.example.reciclerview.model.Filme
import kotlinx.android.synthetic.main.layout_lista_jogos.view.*


class JogosRecyclerAdapter(var listaFilme: ArrayList<Filme>):
    RecyclerView.Adapter<JogosRecyclerAdapter.FilmeViewHolder>() {
    override fun getItemCount(): Int {
        return  listaFilme.size
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        val movie = listaFilme[position]
        holder.bind(movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_lista_jogos,parent,false)
        return  FilmeViewHolder(itemView)
    }

    class FilmeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(movie: Filme){
            itemView.txtNomeFilme.text = movie.nome
            itemView.txtDtLancamento.text = movie.dataLancamento
            itemView.notaFilme.numStars = movie.nota.toFloat().toInt()
        }
    }
    }