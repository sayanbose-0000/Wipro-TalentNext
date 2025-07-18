import java.util.Arrays;
import java.util.Vector;

class Employee {
  int id;
  String name;
  double salary;

  Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
}

public class EmployeeVector {
  public static void main(String[] args) {
    Vector<Employee> employeeVector = new Vector<>();

    Employee e1 = new Employee(1, "Tony Stark", 968445.05);
    Employee e2 = new Employee(2, "Bruce Banner", 896335.62);
    Employee e3 = new Employee(3, "Stephen Strange", 896336.96);

    employeeVector.addAll(Arrays.asList(e1, e2, e3));

    for (Employee e : employeeVector) {
      System.out.println(e.id + " " + e.name + " " + e.salary);
    }
  }
}
