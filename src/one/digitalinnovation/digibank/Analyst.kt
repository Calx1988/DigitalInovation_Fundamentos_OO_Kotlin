package one.digitalinnovation.digibank

import java.math.BigDecimal

class Analyst(name: String,
              surname: String,
              cpf: String,
              salary: Double) :Employee(name, surname, cpf, salary) {
    private val premium=0.2
    override fun calculateBenefits() =salary*premium
}