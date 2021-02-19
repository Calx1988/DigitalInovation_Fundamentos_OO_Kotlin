package one.digitalinnovation.digibank.tests

import one.digitalinnovation.digibank.Analyst
import one.digitalinnovation.digibank.Employee
import one.digitalinnovation.digibank.printReport

fun main(){
    val test= Analyst("Ciclano", "Qualquer", "012.345.678-98", salary=2000.00)
    printReport(test)
    }
