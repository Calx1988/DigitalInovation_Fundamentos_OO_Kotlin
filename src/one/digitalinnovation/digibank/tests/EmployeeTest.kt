package one.digitalinnovation.digibank.tests

import one.digitalinnovation.digibank.Employee
import java.math.BigDecimal

fun main(){
    val teste=Employee("Ciclano", "Qualquer", "012.345.678-98", BigDecimal.valueOf(2000))
    println("${teste.surname}, ${teste.name}, ${teste.cpf}, ${teste.salary}")
    }