package com.example.reciclerview.dataSource

import com.example.reciclerview.model.Filme

class dataSource{
    //fazendo a classe ter métodos estáticos
    companion object{

        fun getFilmes():ArrayList<Filme>{

            // instanciando o obj jogos como um obj ArrayList da classe jogo
            var filmes = ArrayList<Filme>()
                // adicionando jogos no ArrayList da classe jogo
                filmes.add(Filme(1,"Poderoso chefão",5,"08/09/2009"))
                filmes.add(Filme(2,"Parasita",5,"09/08/2019"))
                filmes.add(Filme(3,"Coringa",3,"07/12/1988"))
                filmes.add(Filme(4,"Luluzinha",4,"09/08/1989"))
                filmes.add(Filme(5,"Charlie brown",5,"03/08/1999"))
                filmes.add(Filme(6,"Carandiru",4,"01/01/2001"))
                filmes.add(Filme(7,"Cidade de deus",3,"26/02/1980"))
                filmes.add(Filme(8,"Tropa de elite",4,"19/09/2000"))
                filmes.add(Filme(9,"Pinneple express",5,"03/08/1999"))
                filmes.add(Filme(10,"Vizinhos",4,"01/01/2001"))
                filmes.add(Filme(11,"Bad guys",3,"26/02/1980"))
                filmes.add(Filme(12,"Vizinhos2",4,"19/09/2000"))

            return filmes
        }
    }
}