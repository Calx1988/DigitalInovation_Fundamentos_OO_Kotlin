package one.digitalinnovation.digibank

class Customer(name: String,
               surname: String,
               cpf: String,
               val customerType: CustomerType,
               val password: String):Person(name, surname, cpf),Loggable {

    override fun loggin(): Boolean = "customer#1" == password
    override fun toString(): String = """
                Name = $name
                Surname = $surname
                CPF = $cpf
                Type = ${customerType.description}
                """.trimIndent()
}