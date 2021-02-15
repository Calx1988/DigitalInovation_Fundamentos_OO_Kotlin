package one.digitalinnovation.digibank

class Person {
    var name:String="Joao"
    var surname:String="Fulano"
    var cpf:String="123.123.123.123"
    private set
}

fun main(){
    val Joao=Person()
    println(Joao.name)
    println(Joao.surname)
    println(Joao.cpf)

}