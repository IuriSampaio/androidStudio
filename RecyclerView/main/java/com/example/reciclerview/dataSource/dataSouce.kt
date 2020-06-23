package com.example.reciclerview.dataSource

import com.example.reciclerview.model.jogo

class dataSource{
    //fazendo a classe ter métodos estáticos
    companion object{

        fun getJogos():ArrayList<jogo>{

            // instanciando o obj jogos como um obj ArrayList da classe jogo
            var jogos = ArrayList<jogo>()
                // adicionando jogos no ArrayList da classe jogo
                jogos.add(jogo(10,"Resident Evil",5,"PS4"))
                jogos.add(jogo(12,"subway surfs",5,"celular"))
                jogos.add(jogo(10,"mario",3,"nintendo"))
                jogos.add(jogo(7,"fifa",4,"todos"))
                jogos.add(jogo(15,"South Park",5,"XBOX"))
                jogos.add(jogo(13,"PES",4,"todos"))
                jogos.add(jogo(14,"LEGO",3,"todos"))
                jogos.add(jogo(11,"Zé pikeno",4,"polystasion2"))

            return jogos
        }
    }
}