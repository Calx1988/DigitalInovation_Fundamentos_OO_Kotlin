package one.digitalinnovation.digibank.tests
import one.digitalinnovation.digibank.CustomerType
fun main(){
    CustomerType.values().forEach { element -> println("${element.name} + ${element.description}") }

    CustomerType.values().forEach { it:CustomerType -> println("${it.name} + ${it.description}") }

    val pf=CustomerType.PF
    println("${pf.name} >> ${pf.description} ")

    val pj=CustomerType.PJ
    println("${pj.name} >> ${pj.description}")
    }
