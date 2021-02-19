package one.digitalinnovation.digibank

import java.math.BigDecimal

abstract class Employee(name:String,
               surname:String,
               cpf:String,
               val salary:Double) : Person(name, surname, cpf
        ) {

        protected abstract fun calculateBenefits():Double

        override fun toString(): String = """
                Name = $name
                Surname = $surname
                CPF = $cpf
                Salary = $salary
                Benefits = ${calculateBenefits()}
        """.trimIndent()

}
fun printReport(employee: Employee)=println(employee.toString())
