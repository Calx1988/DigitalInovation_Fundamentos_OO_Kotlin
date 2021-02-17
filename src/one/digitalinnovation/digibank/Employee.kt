package one.digitalinnovation.digibank

import java.math.BigDecimal

class Employee(override val name:String,
               override val surname:String,
               override val cpf:String,
                val salary:BigDecimal) : Person(name, surname, cpf
        ) {
}