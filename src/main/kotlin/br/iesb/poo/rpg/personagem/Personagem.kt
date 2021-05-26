package main.kotlin.br.iesb.poo.rpg.personagem

open class Personagem(){

    var vida: Int = 0
    var maxVida: Int = 0

    var mana: Int = 0
    var maxMana: Int = 0
    var elemento: Int = 0

    var ataqueFisico: Int = 0
    var defesa: Int = 0

    var velocidade: Int = 0

    var nivel: Int = 0

    fun curar(jogador: Personagem, dano: Int) {

        jogador.vida += dano

        if (jogador.vida > jogador.maxVida) {

            jogador.vida = jogador.maxVida
        }

    }

    fun gerarDano(atacante: Personagem, alvo: Personagem) { //Implementar depois de definir lvs, magia e status

    }

    fun levarDano(jogador: Personagem, dano: Int): Int {

        jogador.vida -= dano

        if (jogador.vida < 0) {

            jogador.vida = 0
        }

        return jogador.vida
    }

    fun getVida(jogador: Personagem): Int {

        return this.vida
    }

    fun getMaxVida(jogador: Personagem): Int {

        return this.maxVida
    }

    fun getMana(jogador: Personagem): Int {

        return this.mana
    }

    fun getMaxMana(jogador: Personagem): Int {

        return this.maxMana
    }


}

