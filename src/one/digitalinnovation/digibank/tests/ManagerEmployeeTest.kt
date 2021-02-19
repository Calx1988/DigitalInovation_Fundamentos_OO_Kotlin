package one.digitalinnovation.digibank.tests

import one.digitalinnovation.digibank.Analyst
import one.digitalinnovation.digibank.Employee
import one.digitalinnovation.digibank.Manager
import one.digitalinnovation.digibank.printReport

fun main(){
    val test= Manager("Beltrana", "da Silva", "098.765.432-10", salary=4000.00)
    printReport(test)
}
