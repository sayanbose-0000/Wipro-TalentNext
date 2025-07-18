import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Employee implements Serializable {
  String name;
  Date dateOfBirth;
  String department;
  String designation;
  double salary;

  public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.department = department;
    this.designation = designation;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public String getDepartment() {
    return department;
  }

  public String getDesignation() {
    return designation;
  }

  public double getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee: name='" + name + '\'' + ", dateOfBirth=" + dateOfBirth + ", department='" + department + '\''
        + ", designation='" + designation + '\'' + ", salary=" + salary;
  }
}

public class EmployeeMain {
  public static void main(String[] args) {
    Employee emp = new Employee("Steve Rogers", new Date(), "Computer Science", "Develop", 75000.00);

    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"))) {
      out.writeObject(emp);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"))) {
      Employee readEmp = (Employee) in.readObject();
      System.out.println(readEmp);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

  }
}