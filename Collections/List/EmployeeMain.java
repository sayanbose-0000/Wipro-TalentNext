import java.util.ArrayList;

class Employee {
  int empId;
  String empName;
  String email;
  String gender;
  float salary;

  Employee(int empId, String empName, String email, String gender, float salary) {
    this.email = email;
    this.empId = empId;
    this.empName = empName;
    this.gender = gender;
    this.salary = salary;
  }

  void getEmployeeDetails() {
    System.out.println(empId);
    System.out.println(email);
    System.out.println(gender);
    System.out.println(salary);
  }
}

class EmployeeDB {
  ArrayList<Employee> list = new ArrayList<Employee>();

  boolean addEmployee(Employee e) {
    return list.add(e);
  }

  boolean deleteEmplotee(int empId) {
    return list.removeIf(e -> e.empId == empId);
  }

  String showPaySlip(int empId) {
    for (Employee e : list) {
      if (e.empId == empId) {
        return "Sal is: " + e.salary;
      }
    }
    return "Emp not found";
  }
}

public class EmployeeMain {
  static void display(EmployeeDB edb) {
    for (Employee e : edb.list) {
      System.out.println(e.empId + " | " + e.empName + " | " + e.email + " | " + e.gender + " | Rs." + e.salary);
    }

  }

  public static void main(String[] args) {
    Employee e1 = new Employee(1, "Aman Gupta", "amangupta5651@gmail.com", "M", 18181.18f);
    Employee e2 = new Employee(3, "Aisha Ghosh", "aishaghosh84448@gmail.com", "F", 15896.15f);

    EmployeeDB edb = new EmployeeDB();

    edb.addEmployee(e1);
    edb.addEmployee(e2);

    display(edb);

    edb.deleteEmplotee(e1.empId);

    display(edb);

    edb.addEmployee(e1);

    display(edb);

    System.out.println(edb.showPaySlip(e1.empId));
  }
}