package main.kotlin.br.iesb.poo.rpg.personagem

import main.kotlin.br.iesb.poo.rpg.magia.Magia

open class Personagem(vida: Int,
                      mana: Int,
                      ataqueFisico: Int,
                      ataqueMagico: Int,
                      magia: Int,
                      defesa: Int,
                      velocidade: Int,
                      nivel: Int) {

    var maxVida: Int = vida
    var vida: Int = vida
    var maxMana: Int = mana
    var mana: Int = mana
    var ataqueFisico: Int = 1
    var ataqueMagico: Int = 1
    var magia: Int = 1 //Arranjar uma forma de associar com a classe Magia (que apresenta a estrutura de uma habilidade/magia)
    var defesa: Int = 1
    var velocidade: Int = 1
    var nivel: Int = 1

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

