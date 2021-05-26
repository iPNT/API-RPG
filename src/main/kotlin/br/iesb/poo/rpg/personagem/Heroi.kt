package main.kotlin.br.iesb.poo.rpg.personagem

import main.kotlin.br.iesb.poo.rpg.magia.Magia

class Heroi(vida: Int, mana: Int, ataqueFisico: Int, ataqueMagico: Int, magia: Int, defesa: Int, velocidade: Int, nivel: Int): Personagem(vida, mana, ataqueFisico, ataqueMagico, magia, defesa,
    velocidade, nivel
){

    fun cavaleiro(){

        var vidaCavaleiro: Int = vida
        var manaCavaleiro: Int = mana
        var ataqueFisicoCavaleiro: Int = ataqueFisico
        var ataqueMagicoCavaleiro: Int = ataqueMagico
        var magiaCavaleiro: Int = magia
        var defesaCavaleiro: Int = defesa
        var velocidadeCavaleiro: Int = velocidade
        var nivelCavaleiro: Int = nivel

    }

    fun arqueiro(){

        var vidaArqueiro: Int = vida
        var manaArqueiro: Int = mana
        var ataqueFisicoArqueiro: Int = ataqueFisico
        var ataqueMagicoArqueiro: Int = ataqueMagico
        var magiaArqueiro: Int = magia
        var defesaArqueiro: Int = defesa
        var velocidadeArqueiro: Int = velocidade
        var nivelArqueiro: Int = nivel

    }

    fun mago(){

        var vidaMago: Int = vida
        var manaMago: Int = mana
        var ataqueFisicoArqueiro: Int = ataqueFisico
        var ataqueMagicoArqueiro: Int = ataqueMagico
        var magiaMago: Int = magia
        var defesaMago: Int = defesa
        var velocidadeMago: Int = velocidade
        var nivelMago: Int = nivel

    }


}