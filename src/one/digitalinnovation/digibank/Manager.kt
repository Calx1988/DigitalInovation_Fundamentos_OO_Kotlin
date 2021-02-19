package one.digitalinnovation.digibank

import java.math.BigDecimal

class Manager(name:String,
              surname:String,
              cpf:String,
              salary:Double,
              val password: String):Employee(name, surname, cpf, salary), Loggable {
    private val premium=0.4
    override fun calculateBenefits()=salary*premium
    override fun loggin(): Boolean = "password#1" == password
}