import java.util.ArrayList;
import java.util.Arrays;

class Student {
  int rollNo;
  String name;
  double marks;

  Student(int rollNo, String name, double marks) {
    this.rollNo = rollNo;
    this.name = name;
    this.marks = marks;
  }
}

public class StudentMain {
  public static void main(String[] args) {
    ArrayList<Student> studentsAL = new ArrayList<>();

    Student s1 = new Student(1, "Tony Stark", 99.68);
    Student s3 = new Student(3, "Wanda Maximoff", 42.05);
    Student s2 = new Student(2, "Bruce Banner", 99.66);
    Student s4 = new Student(4, "Steve Rogers", 49.06);
    Student s5 = new Student(5, "Reed Richards", 100.00);

    studentsAL.addAll(Arrays.asList(s1, s2, s3, s4, s5));

    studentsAL.forEach(s -> System.out.println(s.rollNo + " " + s.name + " " + s.marks));

    long count = studentsAL.stream()
        .filter(s -> s.marks >= 50)
        .count();

    System.out.println("No passed: ");
    System.out.println(count);
  }
}
