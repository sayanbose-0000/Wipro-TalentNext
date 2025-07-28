class Employee implements Cloneable {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", Id: " + id);
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}

public class EmployeeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee("Tony Stark", 484683464);
        Employee emp2 = emp1.clone();

        emp2.name = "Steve Rogers";
        emp2.id = 6548844;

        System.out.println("Original Employee: ");
        emp1.display();

        System.out.println("Clone Employee: ");
        emp2.display();
    }
}
