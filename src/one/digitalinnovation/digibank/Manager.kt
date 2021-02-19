package one.digitalinnovation.digibank

import java.math.BigDecimal

class Manager(name:String,
              surname:String,
              cpf:String,
              salary:Double):Employee(name, surname, cpf, salary) {
    private val premium=0.4
    override fun calculateBenefits()=salary*premium
}