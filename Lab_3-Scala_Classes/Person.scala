class Person(val name: String, val email: String)

class Employee(name: String, email: String, val officeNumber: String, val salary: Double) extends Person(name, email)