package one.digitalinnovation.digibank.tests

import one.digitalinnovation.digibank.*

fun main(){
    val test= Manager("Beltrana", "da Silva", "098.765.432-10", salary=4000.00, password="password#1")
    printReport(test)
    AuthenticationTest().authenticate(test)
}
