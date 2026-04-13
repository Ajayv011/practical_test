class Employee {
  String name;
  double salary;

  Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  void disp() {
    System.out.println("Employee Name: " + name);
    System.out.println("Monthly Salary: " + salary);
  }

  void incrSal(double amount) {
    salary = salary + amount;
    System.out.println("Salary incremented by: " + amount);
  }

  double calcuyearSal() {
    return salary * 12;
  }

}

public class SALARY {
  public static void main(String[] args) {

    Employee emp = new Employee("Ajay", 20000);

    emp.disp();

    emp.incrSal(5000);

    emp.disp();

    double yearly = emp.calcuyearSal();
    System.out.println("Yearly Salary: " + yearly);
  }
}