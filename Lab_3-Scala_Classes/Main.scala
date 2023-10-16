import faker._
import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    val rnd = new Random

    val directory: List[Employee] = (1 to 5).map { _ =>
    val randomSalary = 50000 + rnd.nextInt((100000 - 50000) + 1)
      new Employee(
        Name.name, 
        Internet.free_email(Name.first_name), 
        faker.PhoneNumber.phone_number, 
        randomSalary
      )
    }.toList

    // Loop through the directory and print each employee's information
    for (employee <- directory) {
      println(s"Name: ${employee.name}, Email: ${employee.email}, Office Number: ${employee.officeNumber}, Salary: ${employee.salary}")
    }
  }
}
