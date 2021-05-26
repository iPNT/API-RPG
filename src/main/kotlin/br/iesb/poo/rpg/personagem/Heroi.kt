package main.kotlin.br.iesb.poo.rpg.personagem

open class Heroi(): Personagem() {

    fun cavaleiro(){

        var vidaCavaleiro: Int = vida
        var manaCavaleiro: Int = mana
        var ataqueFisicoCavaleiro: Int = ataqueFisico
        var defesaCavaleiro: Int = defesa
        var velocidadeCavaleiro: Int = velocidade
        var nivelCavaleiro: Int = nivel

    }

    fun arqueiro(){

        var vidaArqueiro: Int = vida
        var manaArqueiro: Int = mana
        var ataqueFisicoArqueiro: Int = ataqueFisico
        var defesaArqueiro: Int = defesa
        var velocidadeArqueiro: Int = velocidade
        var nivelArqueiro: Int = nivel

    }

    fun mago(){

        var vidaMago: Int = vida
        var manaMago: Int = mana
        var ataqueFisicoArqueiro: Int = ataqueFisico
        var defesaMago: Int = defesa
        var velocidadeMago: Int = velocidade
        var nivelMago: Int = nivel

    }


}