package one.digitalinnovation.digibank

import java.math.BigDecimal

abstract class Employee(name:String,
               surname:String,
               cpf:String,
               val salary:BigDecimal) : Person(name, surname, cpf
        ) {
        abstract fun calculateBenefits()
}