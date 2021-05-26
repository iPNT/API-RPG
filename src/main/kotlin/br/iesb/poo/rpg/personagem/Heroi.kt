package main.kotlin.br.iesb.poo.rpg.personagem

class Heroi(vida: Int, mana: Int, ataque: Int, magia: Int, defesa: Int, velocidade: Int): Personagem(vida, mana, ataque, magia, defesa,
    velocidade
){

    fun cavaleiro(){

        var vidaCavaleiro: Int = vida
        var manaCavaleiro: Int = mana
        var ataqueCavaleiro: Int = ataque
        var magiaCavaleiro: Int = magia
        var defesaCavaleiro: Int = defesa
        var velocidadeCavaleiro: Int = velocidade

    }

    fun arqueiro(){

        var vidaArqueiro: Int = vida
        var manaArqueiro: Int = mana
        var ataqueArqueiro: Int = ataque
        var magiaArqueiro: Int = magia
        var defesaArqueiro: Int = defesa
        var velocidadeArqueiro: Int = velocidade

    }

    fun mago(){

        var vidaMago: Int = vida
        var manaMago: Int = mana
        var ataqueMago: Int = ataque
        var magiaMago: Int = magia
        var defesaMago: Int = defesa
        var velocidadeMago: Int = velocidade

    }


}