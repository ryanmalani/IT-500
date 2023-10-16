class Person(val name: String, val email: String)

class Employee(override val name: String, override val email: String, val officeNumber: String, val salary: Double) extends Person(name, email)