package one.digitalinnovation.digibank

class Person {

    var name:String="Joao"
    var surname:String="Fulano"
    var cpf:String="123.123.123.123"
    private set
    constructor()

    fun personInfo() = "$surname, $name, $cpf"
    }

fun main(){
    val joao=Person()
    println(joao.personInfo())
}