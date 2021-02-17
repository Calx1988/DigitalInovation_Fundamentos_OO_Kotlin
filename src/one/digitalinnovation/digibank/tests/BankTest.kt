package one.digitalinnovation.digibank.tests

import one.digitalinnovation.digibank.Bank

fun main(){
    val digiOneBank = Bank(name="DigioneBank", number=12)
    println(digiOneBank.name)
    println(digiOneBank.number)
    println(digiOneBank.info())
}