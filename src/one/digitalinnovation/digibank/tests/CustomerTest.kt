package one.digitalinnovation.digibank.tests

import one.digitalinnovation.digibank.Customer
import one.digitalinnovation.digibank.CustomerType

fun main(){
    val test=Customer("Fulano", "Melquior", "135.791.246-80", CustomerType.PF, "customer#1")
    println(test)
    AuthenticationTest().authenticate(test)
}