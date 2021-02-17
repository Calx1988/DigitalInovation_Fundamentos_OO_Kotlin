package one.digitalinnovation.digibank.tests

import one.digitalinnovation.digibank.Person

fun main(){
    val test= Person("Fulano", "de Tal", "123.456.789-09")
    println("${test.surname}, ${test.name}, ${test.cpf}")
    }