# Java Fundamentals

## Language Basics

### 1.

Code
```java
class StringArgsMain {
  public static void main(String[] args) {
    System.out.println(args[0] + " Technologies " + args[1]);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java StringArgsMain Wipro Bangalore
Wipro Technologies Bangalore
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java StringArgsMain ABC Mumbai
ABC Technologies Mumbai
```


### 3.
Code
```java
class ArgsSumMain {
  public static void main(String[] args) {
    System.out.println("The sum of " + args[0] + " and " + args[1] + " is " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
  }
}
```

Output
```
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java ArgsSumMain 10 20
The sum of 10 and 20 is 30
```

## Flow Control Statements

### 1 a.
Code
```java
class PosNegMain {
  public static void main(String[] args) {
    int val = Integer.parseInt(args[0]);
    if (val > 0) System.out.println(val + " is positive");
    else if (val < 0) System.out.println(val + " is negative"); 
    else System.out.println(val + " is zero");
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac PosNegMain.java 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java PosNegMain 10
10 is positive
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java PosNegMain -10
-10 is negative
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java PosNegMain 0
0 is zero
```

### 1 b.
Code
```java
class SameLastDig {
  static boolean isDigit(int a, int b) {
    if ((a % 10) == (b % 10)) return true;
    else return false;    
  }

  public static void main(String[] args) {
    boolean isSame = isDigit(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    if (isSame) System.out.println("True");
    else System.out.println("False");
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java SameLastDig 10 20
True
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java SameLastDig 11 12
False
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java SameLastDig 125 225
True
```

### 2.

Code
```java
class EvenOdd {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    if (num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac EvenOdd.java 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java EvenOdd 10
Even
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java EvenOdd 21
Odd
```

### 5.
Code

```java
class DigitOrAlpha {
  public static void main(String[] args) {
    char ch = '*';

    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
      System.out.println("Alphabet");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("Digit");
    } else {
      System.out.println("Special Character");
    }
  }
}
```

Output

```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac DigitOrAlpha.java 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java DigitOrAlpha 
Special Character
```

### 8.
Code
```java
import java.util.Scanner;

public class ColorCode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter code: ");
    char ch = sc.next().charAt(0);

    switch (ch) {
      case 'R':
        System.out.println("Red");
        break;

      case 'B':
        System.out.println("Blue");
        break;

      case 'G':
        System.out.println("Green");
        break;

      case 'O':
        System.out.println("Orange");
        break;

      case 'Y':
        System.out.println("Yellow");
        break;

      case 'W':
        System.out.println("White");
        break;

      default:
        System.out.println("Invalid Code");
        break;
    }

    sc.close();
  }
}

```

Output

```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac ColorCode.java 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java ColorCode
Enter code: R
Red
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java ColorCode
Enter code: M
Invalid Code
```

### 11.

Code
```java
public class EvenRange {
  public static void main(String[] args) {
    for (int i = 23; i < 57; i++)
      if (i % 2 == 0)
        System.out.println(i);
  }
}
```
Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac EvenRange.java
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java EvenRange
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
```

### 12.
Code
```java
public class Prime {
  public static void main(String[] args) {
    int val = Integer.parseInt(args[0]);
    int count = 0;

    for (int i = 2; i < val; i++)
      if (val % i == 0)
        count++;
  
    if (count == 0) System.out.println("Prime");
    else System.out.println("Non Prime");
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac Prime.java 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java Prime 111
Non Prime
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java Prime 11
Prime
```

### 14. 
Code
```java
public class SumOfDigits {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);

    int sum = 0;
    while (num != 0) {
      int rem = num % 10;
      sum += rem;
      num = num / 10; 
    }

    System.out.println("Sum of digits is " + sum);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac SumOfDigits.java 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java SumOfDigits 1234
Sum of digits is 10
```

### 16.
Code
```java
public class ReverseNum {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int rev = 0;

    while (num != 0) {
      int rem = num % 10;
      rev = rev * 10 + rem;
      num = num / 10;
    }

    System.out.println("The rev num is: " + rev);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac ReverseNum.java 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java ReverseNum 1004
The rev num is: 4001
```

## Arrays

### 2.
Code
```java
public class MaxMinArr {
  public static void main(String[] args) {
    int[] arr = { 46, 86, 71, 23, 55 };

    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < smallest) smallest = arr[i];
      if (arr[i] > largest) largest = arr[i];
    }

    System.out.println("Largest val is : " + largest + " , Smallest val is: " + smallest);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac MaxMinArr.java 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java MaxMinArr
Largest val is : 86 , Smallest val is: 23
```

### 3.
Code
```java
public class FindVal {
  public static void main(String[] args) {
    int[] arr = { 1, 4, 34, 56, 7 };

    int val = Integer.parseInt(args[0]);

    for (int i = 0; i < arr.length; i++) {
      if (val == arr[i]) {
        System.out.println(i);
        return;
      };
      
    }

    System.out.println(-1);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java FindVal 90
-1
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java FindVal 56
3
```


### 7.
Code
```java
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElement {
  public static void main(String[] args) {
    System.out.print("Enter arr: ");
    int[] arr = new int[6];
    
    Scanner sc = new Scanner(System.in);
    
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    
    HashSet<Integer> hs = new HashSet<Integer>();
    
    for (int i = 0; i < arr.length; i++) {
      if (!hs.contains(arr[i])) {
        hs.add(arr[i]);
        System.out.print(arr[i] + " ");
      }
    }

    System.err.println();

    sc.close();
  }
}

```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ javac DuplicateElement.java
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java DuplicateElement
Enter arr: 12 34 12 45 67 89
12 34 45 67 89 
```


### 10.
Code
```java
import java.util.Scanner;

public class EvenBeforeOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size: ");
    int size = sc.nextInt();

    System.out.print("Enter arr: ");
    int[] arr = new int[size];
    
    
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    int[] newArr = new int[size];
    int m = 0, n = size - 1;
    for (int i = 0; i < size; i++) {
      if (arr[i] % 2 == 0) newArr[m++] = arr[i];
      else newArr[n--] = arr[i]; 
    }

    for (int i = 0; i < size; i++) {
      System.out.print(newArr[i] + " ");
    }
    
    System.err.println();

    sc.close();

  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java EvenBeforeOdd
Enter size: 7
Enter arr: 1 0 1 0 0 1 1
0 0 0 1 1 1 1 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java EvenBeforeOdd
Enter size: 3
Enter arr: 3 3 2
2 3 3 
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java EvenBeforeOdd
Enter size: 3
Enter arr: 2 2 2
2 2 2
```

### 14.
Code
```java
public class ThreeDBiggest {
  public static void main(String[] args) {
    if (args.length != 9) {
      System.out.println("Please enter 9 interest numbers");
      return;
    }

    int[][] arr = new int[3][3];

    int k = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = Integer.parseInt(args[k++]);
      }
    }

    System.out.println("The given array is: ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] > largest)
          largest = arr[i][j];
      }
    }

    System.out.println("The biggest number in the given array is " + largest);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java ThreeDBiggest 1 2 3
Please enter 9 interest numbers
User@bose /c/sayan/Wipro-TalentNext/JavaFundamentals
$ java ThreeDBiggest 1 23 45 55 121 222 56 77 89
The given array is: 
1 23 45
55 121 222
56 77 89
The biggest number in the given array is 222
```

# OOPS/Inheritance

## Classes and Objects

### 2.
Code
```java
public class Calculator {
  public static void main(String[] args) {
    System.out.println(powerInt(11, 3));
    System.out.println(powerDouble(12.33, 5));
  }

  static int powerInt(int num1, int num2) {
    return (int) Math.pow(num1, num2);
  }

  static double powerDouble(double num1, int num2) {
    return Math.pow(num1, num2);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac Calculator.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java Calculator
1331
284980.6567461393
```

## Encapsulation/Abstraction

### 1.
Code
```java
public class Library {
  public static void main(String[] args) {
    Author jkRowling = new Author("JK Rowling", "jkrowling@gmail.com", 'F');
    Book harryPotter = new Book("Harry Potter and Prisoner of Azkaban", jkRowling, 599.60, 20000);

    Author kristinHannah = new Author("Kristin Hannah", "kristinhannah@gmail.com", 'F');
    Book nightingale = new Book("nightingale", kristinHannah, 499.45, 10000);

    System.out.println(harryPotter.toString());
    System.out.println(nightingale.toString());
  }
}

class Author {
  String name;
  String email;
  char gender;

  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public char getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return "Author details: Name-  " + name + ", Email- " + email + ", Gender- " + gender;
  }
}

class Book {
  String name;
  Author author;
  double price;
  int qtyInStock;

  Book(String name, Author author, double price, int qtyInStock) {
    this.name = name;
    this.price = price;
    this.author = author;
    this.qtyInStock = qtyInStock;
  }

  public String getName() {
    return name;
  }

  public Author getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public int getQtyInStock() {
    return qtyInStock;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQtyInStock(int qtyInStock) {
    this.qtyInStock = qtyInStock;
  }

  @Override
  public String toString() {
    return "Book: Name- " + name + ", Price- " + price + ", Quantity- " + qtyInStock + " | " + author.toString();
  }
}
```

Ouput
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java Library
Book: Name- Harry Potter and Prisoner of Azkaban, Price- 599.6, Quantity- 20000 | Author details: Name-  JK Rowling, Email- jkrowling@gmail.com, Gender- F
Book: Name- nightingale, Price- 499.45, Quantity- 10000 | Author details: Name-  Kristin Hannah, Email- kristinhannah@gmail.com, Gender- F
```

## Inheritance

### 2.

Code
```java
// Person.java
public class Person {
  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Name: " + name;
  }
}

// Employee.java
public class Employee extends Person {
  double annualSalary;
  int startYear;
  int nationalInsuranceNumber;

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

  public void setStartYear(int startYear) {
    this.startYear = startYear;
  }

  public void setNationalInsuranceNumber(int nationalInsuranceNumber) {
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public double getAnnualSalary() {
    return annualSalary;
  }

  public int getStartYear() {
    return startYear;
  }

  public int getNationalInsuranceNumber() {
    return nationalInsuranceNumber;
  }

  @Override
  public String toString() {
    return "Employee: Name- " + getName() + ", Annual Salary" + getAnnualSalary() + ", Start Year: " + getStartYear() + ", National Security Number: " + getNationalInsuranceNumber();
  }
}

// TestEmployee.java
public class TestEmployee {
  public static void main(String[] args) {
    Employee aman = new Employee();
    aman.name = "Aman Rowal";
    aman.annualSalary = 500000.29;
    aman.startYear = 1998;
    aman.nationalInsuranceNumber = 99494475;

    System.out.println(aman);
  }
}

```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance/Employee
$ javac TestEmployee.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance/Employee
$ java TestEmployee
Employee: Name- Aman Rowal, Annual Salary500000.29, Start Year: 1998, National Security Number: 99494475
```

## Overriding/Polymorphism

### 2. 
Code
```java
public class ShapeMain {
  public static void main(String[] args) {
    Shape c = new Circle();
    Shape t = new Triangle();
    Shape s = new Square();

    c.draw();
    c.erase();

    t.draw();
    t.erase();

    s.draw();
    s.erase();
  }
}

class Shape {
  void draw() {
    System.err.println("Drawing Shape");
  }

  void erase() {
    System.out.println("Erasing Shape");
  }
}

class Circle extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing Circle");
  }

  @Override
  void erase() {
    System.out.println("Erasing Circle");
  }
}

class Triangle extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing Triangle");
  }

  @Override
  void erase() {
    System.out.println("Erasing Triangle");
  }
}

class Square extends Shape {
  @Override
  void draw() {
    System.out.println("Drawing Square");
  }

  @Override
  void erase() {
    System.out.println("Erasing Square");
  }
}
```

Output

```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac ShapeMain.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java ShapeMain
Drawing Circle
Erasing Circle
Drawing Triangle
Erasing Triangle
Drawing Square
Erasing Square
```

## String, StringBuffer

### 4.
Code
```java
import java.util.Scanner;

public class FirstHalf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = new String(sc.next());
    sc.close();

    if (s.length() % 2 != 0) {
      System.out.println("null");
      return;
    }

    for (int i = 0; i < s.length() / 2; i++) {
      System.out.print(s.charAt(i));
    }

    System.out.println();
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac FirstHalf.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java FirstHalf
Enter string: TomCat
Tom
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java FirstHalf
Enter string: Apron
null
```

### 6.
Code
```java
import java.util.Scanner;

public class ShortLongShort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first: ");
    String first = new String(sc.next());

    System.out.print("Enter second: ");
    String second = new String(sc.next());

    sc.close();

    if (first.length() == second.length()) {
      System.out.println("Can't have same length!");
    }

    else if (first.length() < second.length()) {
      System.out.println(first + second + first);
    }

    else {
      System.out.println(second + first + second);
    }
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac ShortLongShort.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java ShortLongShort
Enter first: hi
Enter second: hello
hihellohi
```

### 7.
Code
```java
import java.util.Scanner;

public class XCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = new String(sc.next());

    sc.close();

    if (s.charAt(0) == 'x' || s.charAt(0) == 'x') {
      String sNew = new String(s.substring(1, s.length() - 1));
      System.out.println(sNew);
    }

    else {
      System.out.println(s);
    }
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac XCharacter.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java XCharacter
Enter string: xHix
Hi
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java XCharacter
Enter string: America
America
```

### 8.
Code
```java
import java.util.Scanner;

public class StarCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = new String(sc.next());

    sc.close();

    int pos = s.indexOf("*");

    if (pos == -1) {
      System.err.println("No * present");
      return;
    }

    String sNew = new String();
    if (pos == 0) {
      sNew = s.substring(2);
    } else if (pos == s.length() - 1) {
      sNew = s.substring(0, pos - 1);
    } else {
      sNew = s.substring(0, pos - 1) + s.substring(pos + 2);
    }

    System.out.println(sNew);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac StarCharacter.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java StarCharacter
Enter string: ab*cd
ad
```

### 10.
Code
```java
import java.util.Scanner;

public class RepeatChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = new String(sc.next());
    
    System.out.print("Enter repeat: ");
    int repeat = sc.nextInt();

    sc.close();

    String sub = s.substring(s.length() - repeat);
    StringBuilder sNew = new StringBuilder(sub);

    for (int i = 1; i < repeat; i++) {
      sNew = sNew.append(sub);
    }

    System.out.println(sNew);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac RepeatChar.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java RepeatChar
Enter string: Wipro
Enter repeat: 3 
propropro
```

## StringJoiner class

### 2.

Code
```java
import java.util.StringJoiner;

public class StringJoin {
  public static void main(String[] args) {
    StringJoiner s1 = new StringJoiner("-");
    s1.add("Kolakta").add("Mumbai").add("Chennai");

    StringJoiner s2 = new StringJoiner("-");
    s2.add("Delhi").add("Paris").add("Melborne");

    StringJoiner merges1s2 = new StringJoiner("-");
    merges1s2.add("Delhi").add("Paris").add("Melborne").merge(s1);
    System.out.println("s1 merged to s2: " + merges1s2);

    StringJoiner merges2s1 = new StringJoiner("-");
    merges2s1.add("Kolakta").add("Mumbai").add("Chennai").merge(s2);
    System.out.println("s2 merged to s1: " + merges2s1);
  }
}

```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac StringJoin.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java StringJoin
s1 merged to s2: Delhi-Paris-Melborne-Kolakta-Mumbai-Chennai
s2 merged to s1: Kolakta-Mumbai-Chennai-Delhi-Paris-Melborne
```

## Optional Class

### 3.

Code
```java
import java.util.Optional;

class InvalidUserException extends RuntimeException {
  public InvalidUserException(String mssg) {
    super(mssg);
  }
}

class Employee {}

public class InvalidUser {
  public static void main(String[] args) {
    Employee emp = null;
    
    Optional.ofNullable(emp).orElseThrow(() -> new InvalidUserException("Invalid User"));
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ javac InvalidUser.java 
User@bose /c/sayan/Wipro-TalentNext/OopsInheritance
$ java InvalidUser
Exception in thread "main" InvalidUserException: Invalid User
        at InvalidUser.lambda$main$0(InvalidUser.java:15)
        at java.base/java.util.Optional.orElseThrow(Optional.java:403)
        at InvalidUser.main(InvalidUser.java:15)
```

# Abstraction/Package/Exception Handling

## Abstract Classes

### 1. 
Code
```java
import java.util.Random;

public class TestCompartment {
  public static void main(String[] args) {
    Compartment[] comp = new Compartment[10];
    Random rand = new Random();

    for (int i = 0; i < comp.length; i++) {
      int compRand = rand.nextInt(4) + 1;

      switch (compRand) {
        case 1:
          comp[i] = new FirstClass();
          break;

        case 2:
          comp[i] = new Ladies();
          break;

        case 3:
          comp[i] = new General();
          break;

        case 4:
          comp[i] = new Luggage();
          break;
      
        default:
          break;
      }
    }

    for (Compartment c : comp) {
      System.out.println(c.notice());
    }
  }
}

abstract class Compartment {
  public abstract String notice();
}

class FirstClass extends Compartment {
  @Override
  public String notice() {
    return "This is a First Class Compartment";
  }
}

class Ladies extends Compartment {
  @Override
  public String notice() {
    return "This is a Ladies Compartment";
  }
}

class General extends Compartment {
  @Override
  public String notice() {
    return "This is a General Compartment";
  }
}

class Luggage extends Compartment {
  @Override
  public String notice() {
    return "This is a Luggage Compartment";
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java TestCompartment
This is a Luggage Compartment
This is a First Class Compartment
This is a Ladies Compartment
This is a First Class Compartment
This is a Ladies Compartment
This is a Ladies Compartment
This is a Ladies Compartment
This is a Luggage Compartment
This is a Luggage Compartment
This is a General Compartment
```

## Packages

### 3.
FileStructure
```sh
.
└── com
    ├── TestMain.java
    └── automobile
        ├── Vehicle.java
        └── twowheeler
            ├── Hero.java
            └── Honda.java
```

Code
```java
// TestMain.java
package com;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestMain {
  public static void main(String[] args) {
    Hero hero = new Hero();
    System.out.println(hero.getModelName());
    System.out.println(hero.getRegistrationNumber());
    System.out.println(hero.getOwnerName());
    System.out.println(hero.getSpeed());  
    hero.radio();

    Honda honda = new Honda();
    System.out.println(honda.getModelName());
    System.out.println(honda.getRegistrationNumber());
    System.out.println(honda.getOwnerName());
    System.out.println(honda.getSpeed());
    honda.cdplayer();
  }
}

// Vehicle.java
package com.automobile;

public abstract class Vehicle {
  public abstract String getModelName();
  public abstract String getRegistrationNumber();
  public abstract String getOwnerName();
}

// Hero.java
package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
  public int getSpeed() {
    return 56;
  }

  public void radio() {
    System.out.println("Radio running");
  }

  @Override
  public String getModelName() {
    return "MA789B";
  }

  @Override
  public String getOwnerName() {
    return "Aman Singh";
  }

  @Override
  public String getRegistrationNumber() {
    return "584681814846";
  }
}

// Honda.java
package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
  public int getSpeed() {
    return 65;
  }

  public void cdplayer() {
    System.out.println("CD player running");
  }

  @Override
  public String getModelName() {
    return "M1423A";
  }

  @Override
  public String getOwnerName() {
    return "Ankit Burman";
  }

  @Override
  public String getRegistrationNumber() {
    return "89784864894";
  }
}
```
Output
```sh
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException/Automobile
$ javac com/TestMain.java com/automobile/Vehicle.java com/automobile/twowheeler/Hero.java com/automobile/twowheeler/Honda.java 
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException/Automobile
$ java com/TestMain
MA789B
584681814846
Aman Singh
56
Radio running
M1423A
89784864894
Ankit Burman
65
CD player running
```

## Interfaces

### 1.
File Structure
```sh
.
├── live
│   └── Test.java
└── music
    ├── Playable.java
    ├── string
    │   └── Veena.java
    └── wind
        └── Saxophone.java
```

Code
```java
// Test.java
package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
  public static void main(String[] args) {
    Playable veena = new Veena();
    veena.play();

    Playable saxophone = new Saxophone();
    saxophone.play();
  }
}

// Playable.java
package music;

public interface Playable {
  void play();
}

// Veena.java
package music.string;

import music.Playable;

public class Veena implements Playable {
  @Override
  public void play() {
    System.out.println("Playing Veena");
  }
}

// Saxophone.java
package music.wind;

import music.Playable;

public class Saxophone implements Playable {
  @Override
  public void play() {
    System.out.println("Playing Saxophone");
  }
}
```

Output
```js
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException/Instruments
$ javac live/Test.java music/Playable.java music/string/Veena.java music/wind/Saxophone.java 
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException/Instruments
$ java live/Test
Playing Veena
Playing Saxophone
```


## Interface-new features

### 2.

Code
```java
public class Lambda {
  public static void main(String[] args) {
    Test t1 = (a, b, c) -> a + b + c;
    Test t2 = (a, b, c) -> a * b * c;

    System.out.println(t1.myFunction(2, -1, 4));
    System.out.println(t2.myFunction(7, -3, 2));
  }
}

interface Test {
  abstract int myFunction(int a, int b, int c);
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ javac Lambda.java 
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java Lambda
5
-42
```

## Exception Handling

### 1. 

Code
```java
import java.util.Scanner;

public class ArrayException {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter the number of elements in the array");
      int size = Integer.parseInt(sc.nextLine()); // sc.nextInt() gives InputMismatchException, to get NumberFormatException, parse manually

      int[] arr = new int[size];

      System.out.println("Enter the elements in the array");
      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(sc.nextLine());
      }

      System.out.println("Enter the index of the array element you want to access");
      int idx = Integer.parseInt(sc.nextLine());

      System.out.println("The array element at index " + idx + " = " + arr[idx]);
      System.out.println("The array element successfully accessed");

    }
    
    catch (ArrayIndexOutOfBoundsException aioobe) {
      System.out.println(aioobe);
    }
    
    catch (NumberFormatException nfe) {
      System.out.println(nfe);
    }

    finally {
      sc.close();
    }
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ javac ArrayException.java 
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java ArrayException
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
1
The array element at index 1 = 80
The array element successfully accessed
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java ArrayException
Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
9
java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 2
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java ArrayException
Enter the number of elements in the array
2
Enter the elements in the array
30
j
java.lang.NumberFormatException: For input string: "j"
```

### 3.
Code
```java
import java.util.Scanner;

class NegativeValueException extends Exception {}
class ValueOutOfRangeException extends Exception {}

public class AvgMarks {
  public static void main(String[] args) throws NumberFormatException, NegativeValueException, ValueOutOfRangeException {
    Scanner sc = new Scanner(System.in);

      System.out.println("Enter name: ");
      String name = sc.nextLine();

      System.out.println("Ebter marks in maths: ");
      int mathMarks = Integer.parseInt(sc.next());

      System.out.println("Ebter marks in science: ");
      int scienceMarks = Integer.parseInt(sc.next());

      System.out.println("Ebter marks in english: ");
      int englishMarks = Integer.parseInt(sc.next());

      if (mathMarks < 0 || scienceMarks < 0 || englishMarks < 0) throw new NegativeValueException();
      if (mathMarks > 100 || scienceMarks > 100 || englishMarks > 100) throw new ValueOutOfRangeException();

      System.out.println("The average is: " + ((mathMarks + scienceMarks + englishMarks) / 3));
  }
}
```
Output
```sh
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ javac AvgMarks.java 
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java AvgMarks
Enter name: 
Aman Chaubey
Ebter marks in maths: 
j
Exception in thread "main" java.lang.NumberFormatException: For input string: "j"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:588)
        at java.base/java.lang.Integer.parseInt(Integer.java:685)
        at AvgMarks.main(AvgMarks.java:14)
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java AvgMarks
Enter name: 
Ankit Tiwari
Ebter marks in maths:
255
Ebter marks in science:
33
Ebter marks in english:
44
Exception in thread "main" ValueOutOfRangeException
        at AvgMarks.main(AvgMarks.java:23)
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java AvgMarks
Enter name: 
Ankit Adhikari 
Ebter marks in maths:
55
Ebter marks in science:
68
Ebter marks in english:
36
The average is: 53
```

### 4.
Code
```java
import java.util.Scanner;

class InvalidCountryException extends Exception {
  InvalidCountryException() {
    super();
  }

  InvalidCountryException(String mssg) {
    super(mssg);
  }
}

public class UserRegistration {
  static void registerUser(String username, String userCountry) throws InvalidCountryException {
    if (!userCountry.toLowerCase().equals("india")) {
      throw new InvalidCountryException("User Outside India cannot be registered");
    } else {
      System.out.println("User registration done successfully");
    }
  }

  public static void main(String[] args) throws InvalidCountryException {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name: ");
    String username = sc.next();

    System.out.println("Enter country");
    String userCountry = sc.next();

    registerUser(username, userCountry);

    sc.close();
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ javac UserRegistration.java 
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java UserRegistration
Enter name: 
Mickey
Enter country
US
Exception in thread "main" InvalidCountryException: User Outside India cannot be registered
        at UserRegistration.registerUser(UserRegistration.java:16)
        at UserRegistration.main(UserRegistration.java:31)
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java UserRegistration
Enter name: 
Mini
Enter country
India
User registration done successfully
```

### 5.
Code
```java
class AgeLessThanEighteenOrGreaterThanSixtyException extends Exception {
  public AgeLessThanEighteenOrGreaterThanSixtyException(String mssg) {
    super(mssg);
  }
}

public class Age {
  public static void main(String[] args) throws AgeLessThanEighteenOrGreaterThanSixtyException {
    int age = Integer.parseInt(args[0]);
    if (age < 18 || age > 60) {
      throw new AgeLessThanEighteenOrGreaterThanSixtyException("Age less than 18 or greater than 60");
    }

    System.out.println("You are of age");
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ javac Age.java 
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java Age 10
Exception in thread "main" AgeLessThanEighteenOrGreaterThanSixtyException: Age less than 18 or greater than 60
        at Age.main(Age.java:11)
User@bose /c/sayan/Wipro-TalentNext/AbstractionPackageException
$ java Age 19
You are of age
``` 

# Wrapper Classes

## Wrapper Classes

### 2.
Code
```java
public class BinOctHex {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);

    System.out.println("Given Number: " + num);
    System.out.println("Binary Equivalent: " + Integer.toBinaryString(num));
    System.out.println("Octal Equivalent: " + Integer.toOctalString(num));
    System.out.println("Hexadecimal Equivalent: " + Integer.toHexString(num));
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/WrapperClass
$ javac BinOctHex.java 
User@bose /c/sayan/Wipro-TalentNext/WrapperClass
$ java BinOctHex 20
Given Number: 20
Binary Equivalent: 10100
Octal Equivalent: 24
Hexadecimal Equivalent: 14
```

### 3.
Code
```java
import java.util.Scanner;

public class DecBin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num (1-255): ");
    int num = Integer.parseInt(sc.next());
    sc.close();

    if (num < 1 || num > 255) {
      System.out.println("Number must be between 1 and 255");
      return;
    }

    String rawBinary = Integer.toBinaryString(num);
    String bin = String.format("%8s", rawBinary).replace(' ', '0');
    System.out.println("Binary is: " + bin);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/WrapperClass
$ javac DecBin.java 
User@bose /c/sayan/Wipro-TalentNext/WrapperClass
$ java DecBin
Enter a num (1-255): 
16
Binary is: 00010000
User@bose /c/sayan/Wipro-TalentNext/WrapperClass
$ java DecBin
Enter a num (1-255): 
100
Binary is: 01100100
```

### 4.

Code
```java
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
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/WrapperClass
$ java EmployeeMain
Original Employee:
Name: Tony Stark, Id: 484683464
Clone Employee:
Name: Steve Rogers, Id: 6548844
```

# I/O Streams

## I/O Operations

### 1.
Input File
```sh
Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,
```

Code
```java
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileCharacterCount {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the file name");
    String fileName = sc.nextLine();

    System.out.println("Enter the character to be counted");
    char charToFind = sc.nextLine().toLowerCase().charAt(0);

    FileReader fr = new FileReader(fileName);
    int count = 0;
    int c = fr.read();

    while (c != -1) {
      if (Character.toLowerCase((char) c) == charToFind) {
        count++;
      }
      c = fr.read();
    }

    System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + charToFind + "'.");

    sc.close();
    fr.close();
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/IoStream/FileOne
$ javac FileCharacterCount.java 
User@bose /c/sayan/Wipro-TalentNext/IoStream/FileOne
$ java FileCharacterCount
Enter the file name
Input.txt
Enter the character to be counted
r
File 'Input.txt' has 50 instances of letter 'r'.
```

### 3.
inputFile.txt
```sh
Manoj works at Wipro
Katari works at Wipro
Sureka works at Wipro
Harish works at Wipro
Anitha works at Wipro
Janani works at Wipro
```

outFile.txt
```sh
Anitha : 1
Harish : 1
Janani : 1
Katari : 1
Manoj : 1
Sureka : 1
Wipro : 6
at : 6
works : 6
```

Code
```java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the input file name");
    String inputFile = sc.nextLine();

    System.out.println("Enter the output file name");
    String outputFile = sc.nextLine();

    Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();

    try (FileReader fr = new FileReader(inputFile); FileWriter fw = new FileWriter(outputFile)) {
      Scanner fileScanner = new Scanner(fr);
      while (fileScanner.hasNextLine()) {
        String[] words = fileScanner.nextLine().split("\\s+");
        for (String word : words) {
          wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
      }
      
      fileScanner.close();

      for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
        fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
      }

      System.out.println("Word count has been written to " + outputFile);

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/IoStream/FIleTwo
$ javac FileWordCount.java 
User@bose /c/sayan/Wipro-TalentNext/IoStream/FIleTwo
$ java FileWordCount
Enter the input file name
inputFile.txt
Enter the output file name
outputFile.txt
Word count has been written to outputFile.txt
```

## Object Seriralization

### 1.
Code
```java
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
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/IoStream
$ javac EmployeeMain.java 
User@bose /c/sayan/Wipro-TalentNext/IoStream
$ java EmployeeMain
Employee: name='Steve Rogers', dateOfBirth=Wed Jul 16 00:58:08 IST 2025, department='Computer Science', designation='Develop', salary=75000.0
```

# Collection

## List

### 1.

Code
```java
import java.util.ArrayList;
import java.util.Arrays;

public class Months {
  public static void main(String[] args) {
    ArrayList<String> months = new ArrayList<String>();
    months.addAll(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    System.out.println(months);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections
$ javac Months.java 
User@bose /c/sayan/Wipro-TalentNext/Collections
$ java Months
[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec]
```

### 2.
Code
```java
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
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections
$ javac EmployeeMain.java
User@bose /c/sayan/Wipro-TalentNext/Collections
$ java EmployeeMain
1 | Aman Gupta | amangupta5651@gmail.com | M | Rs.18181.18
3 | Aisha Ghosh | aishaghosh84448@gmail.com | F | Rs.15896.15
3 | Aisha Ghosh | aishaghosh84448@gmail.com | F | Rs.15896.15
3 | Aisha Ghosh | aishaghosh84448@gmail.com | F | Rs.15896.15
1 | Aman Gupta | amangupta5651@gmail.com | M | Rs.18181.18
Sal is: 18181.18
```

### 3.
Code
```java
import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {
  static ArrayList<String> stringArrayList = new ArrayList<String>();

  static void printAll() {
    Iterator<String> it = stringArrayList.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  public static void main(String[] args) {
    stringArrayList.add("Tony Stark");
    stringArrayList.add("Steve Rogers");
    stringArrayList.add("Wanda Maximoff");
    stringArrayList.add("Clint Barton");
    stringArrayList.add("Bruce Banner");
    stringArrayList.add("Natasha Romanoff");

    printAll();
  }
}
```

Output
```java
User@bose /c/sayan/Wipro-TalentNext/Collections
$ javac StringArrayList.java 
User@bose /c/sayan/Wipro-TalentNext/Collections
$ java StringArrayList
Tony Stark
Steve Rogers
Wanda Maximoff
Clint Barton
Bruce Banner
Natasha Romanoff
```

### 4.
Code
```java
import java.util.ArrayList;

public class NumbersArrayList {
  public static void main(String[] args) {
    ArrayList<Number> al = new ArrayList<>();
    
    al.add(488);
    al.add(81.80f);
    al.add(68.45);

    System.out.println(al);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections
$ javac NumbersArrayList.java 
User@bose /c/sayan/Wipro-TalentNext/Collections
$ java NumbersArrayList
[488, 81.8, 68.45]
```

### 5.
Code
```java
import java.util.Arrays;
import java.util.LinkedList;

public class MonthsLinkedList {
  public static void main(String[] args) {
    LinkedList<String> months = new LinkedList<String>();
    months.addAll(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    System.out.println(months);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections
$ javac MonthsLinkedList.java 
User@bose /c/sayan/Wipro-TalentNext/Collections
$ java MonthsLinkedList
[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec]
```

### 6.
Code
```java
import java.util.Arrays;
import java.util.Vector;

public class MonthsVector {
  public static void main(String[] args) {
    Vector<String> months = new Vector<String>();
    months.addAll(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    System.out.println(months);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections
$ javac MonthsVector.java 
User@bose /c/sayan/Wipro-TalentNext/Collections
$ java MonthsVector
[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec]
```

### 7.
Code
```java
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
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections
$ javac EmployeeVector.java 
User@bose /c/sayan/Wipro-TalentNext/Collections
$ java EmployeeVector
1 Tony Stark 968445.05
2 Bruce Banner 896335.62
3 Stephen Strange 896336.96
```

## Set

### 1.
Code
```java
import java.util.HashSet;

class CountrySet {
  HashSet<String> h1  = new HashSet<>();
 
  HashSet<String> saveCountryNames(String countryName) {
    h1.add(countryName);
    return h1;
  }

  boolean getCountry(String countryName) {
    for (String country : h1) {
      if (country == countryName) {
        return true;
      }
    }

    return false;
  }
}

public class CountryMain {
  public static void main(String[] args) {
    CountrySet cs = new CountrySet();

    cs.saveCountryNames("India");
    cs.saveCountryNames("America");
    cs.saveCountryNames("Italy");
    cs.saveCountryNames("Australia");
    cs.saveCountryNames("Switzerland");

    System.out.println(cs.getCountry("China") ? "Found" : "Not found");
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Set
$ javac CountryMain
error: Class names, 'CountryMain', are only accepted if annotation processing is explicitly requested
1 error
User@bose /c/sayan/Wipro-TalentNext/Set
$ javac CountryMain.java
User@bose /c/sayan/Wipro-TalentNext/Set
$ java CountryMain
Not found
```

### 2.
Code
```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
  public static void main(String[] args) {
    HashSet<String> employeeNames = new HashSet<>();

    employeeNames.addAll(Arrays.asList("Tony Stark", "Bruce Banner", "Wanda Maximoff", "Clint Barton", "Agatha Harkess"));

    Iterator<String> it = employeeNames.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Set
$ javac EmployeeHashSet.java 
User@bose /c/sayan/Wipro-TalentNext/Set
$ java EmployeeHashSet
Bruce Banner
Tony Stark
Agatha Harkess
Clint Barton
Wanda Maximoff
```

### 3.
Code
```java
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StringTreeSet {
  public static void main(String[] args) {
    TreeSet<String> stringObj = new TreeSet<>();
    
    stringObj.add("India");
    stringObj.add("America");
    stringObj.add("Japan");

    System.out.println("Reversed");
    stringObj.reversed();
    Iterator<String> it1 = stringObj.descendingIterator();
    while (it1.hasNext()) {
      System.out.println(it1.next());
    }
    
    System.out.println();

    System.out.println("All ele (Iterator): ");
    Iterator<String> it2 = stringObj.iterator();
    while (it2.hasNext()) {
      System.out.println(it2.next());
    }
    
    System.out.println();

    System.out.println("Enter country to search: ");
    Scanner sc = new Scanner(System.in);
    String country = sc.next();
    sc.close();
    
    for (String c : stringObj) {
      if (c.equals(country)) {
        System.out.println("Exists");
        return;
      }
    }
    System.out.println("Doesn't exist");
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Set
$ javac StringTreeSet.java 
User@bose /c/sayan/Wipro-TalentNext/Set
$ java StringTreeSet
Reversed
Japan
India
America

All ele (Iterator): 
America
India
Japan

Enter country to search:
Japan
Exists
User@bose /c/sayan/Wipro-TalentNext/Set
$ java StringTreeSet
Reversed
Japan
India
America

All ele (Iterator):
America
India
Japan

Enter country to search:
UK
Doesn't exist
```

### 4.
Code
```java
import java.util.TreeSet;

class CountryTree {
  TreeSet<String> h1  = new TreeSet<>();
 
  TreeSet<String> saveCountryNames(String countryName) {
    h1.add(countryName);
    return h1;
  }

  boolean getCountry(String countryName) {
    for (String country : h1) {
      if (country == countryName) {
        return true;
      }
    }

    return false;
  }
}

public class CountryTreeMain {
  public static void main(String[] args) {
    CountrySet cs = new CountrySet();

    cs.saveCountryNames("India");
    cs.saveCountryNames("America");
    cs.saveCountryNames("Italy");
    cs.saveCountryNames("Australia");
    cs.saveCountryNames("Switzerland");

    System.out.println(cs.getCountry("Switzerland") ? "Found" : "Not found");
  }
}

```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Set
$ javac CountryTreeMain.java 
User@bose /c/sayan/Wipro-TalentNext/Set
$ java CountryTreeMain
Found
User@bose /c/sayan/Wipro-TalentNext/Set
```

## Map

### 1.
Code
```java
import java.util.ArrayList;
import java.util.HashMap;

class CountryHashMap {
  HashMap<String, String> m1 = new HashMap<>();
  HashMap<String, String> m2 = new HashMap<>();

  HashMap<String, String> saveCountryCapital(String countryName, String capital) {
    m1.put(countryName, capital);
    return m1;
  }

  String getCapital(String countryName) {
    return m1.get(countryName);
  }

  String getCountry(String capitalName) {
    for (String country : m1.keySet()) {
      if (m1.get(country).equals(capitalName)) {
        return country;
      }
    }

    return null;
  }

  void reverseMap() {
    HashMap<String, String> m2 = new HashMap<>();
    for (String country : m1.keySet()) {
      m2.put(m1.get(country), country);
    }

    System.out.println(m2);
  }

  ArrayList<String> getAllCountries() {
    ArrayList<String> coutries = new ArrayList<>();

    for (String country : m1.keySet()) {
      coutries.add(country);
    }

    return coutries;
  }
}

public class CountryHashMapMain {
  public static void main(String[] args) {
    CountryHashMap ch = new CountryHashMap();

    ch.saveCountryCapital("India", "Delhi");
    ch.saveCountryCapital("US", "Washington DC");
    ch.saveCountryCapital("UK", "London");
    ch.saveCountryCapital("Bangladesh", "Dhaka");


    System.out.println("All countries");
    System.out.println(ch.getAllCountries());

    System.out.println("Capital for US");
    System.out.println(ch.getCapital("UK"));

    System.out.println("Country whose capital is Delhi is");
    System.err.println(ch.getCountry("Delhi"));

    System.out.println("Reverse");
    ch.reverseMap();
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Map
$ java CountryHashMapMain
All countries
[Bangladesh, UK, US, India]
Capital for US
London
Country whose capital is Delhi is
India
Reverse
{Washington DC=US, Delhi=India, London=UK, Dhaka=Bangladesh}
```

### 2.
Code
```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringHAshMap {
  static HashMap<String, String> hMap = new HashMap<>();

  static boolean getKey(String name) {
    for (String it : hMap.keySet()) {
      if (it.equals(name))
        return true;
    }
    return false;
  }

  static boolean getValue(String name) {
    for (String it : hMap.values()) {
      if (it.equals(name))
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    hMap.put("Harry Potter", "JK Rowling");
    hMap.put("Nightingale", "Kristin Hannah");
    hMap.put("The White Tiger", "Aravind Adiga");
    hMap.put("Feluda", "Satyajit Ray");

    System.out.println("Check if key exists: Harry Potter");
    System.out.println(hMap.containsKey("Harry Potter")? "Found" : "Not Found");

    System.out.println("Check if value exists: Kristin Hannah");
    System.out.println(hMap.containsValue("Kristin Hannah") ? "Found" : "Not Found");

    System.out.println("All values");
    Iterator<String> it = hMap.keySet().iterator();

    while (it.hasNext()) {
      String key = it.next();
      System.out.println(key + " -> " + hMap.get(key));
    }
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Map
$ javac StringHAshMap.java 
User@bose /c/sayan/Wipro-TalentNext/Map
$ java StringHAshMap
Check if key exists: Harry Potter
Found
Check if value exists: Kristin Hannah
Found
All values
The White Tiger -> Aravind Adiga
Feluda -> Satyajit Ray
Harry Potter -> JK Rowling
Nightingale -> Kristin Hannah
```

### 3.
Code
```java
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesCapital {
  public static void main(String[] args) {
    Properties states = new Properties();

    states.put("West Bengal", "Kolkata");
    states.put("Rajasthan", "Jaipur");
    states.put("Maharashtra", "Mumbai");
    states.put("Karnataka", "Bangalore");

    Set<Object> statesNames = states.keySet();
    Iterator<Object> it = statesNames.iterator();

    while (it.hasNext()) {
      String state = (String) it.next();
      String capital = states.getProperty(state);

      System.out.println(state + " | " + capital);
    }
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Map
$ javac PropertiesCapital.java 
User@bose /c/sayan/Wipro-TalentNext/Map
$ java PropertiesCapital
Karnataka | Bangalore
West Bengal | Kolkata
Maharashtra | Mumbai
Rajasthan | Jaipur
```

### 4.
Code
```java
import java.util.HashMap;

public class PhoneNo {
  public static void main(String[] args) {
    HashMap<String, Integer> contactList = new HashMap<>();

    contactList.put("Aman Ghosh", 96315);
    contactList.put("Ankit Bose", 96788);
    contactList.put("Amrita Sen", 97236);
    contactList.put("Susmita Ray", 91055);

    System.out.println("Key exists?: Amrita Sen");
    System.out.println(contactList.containsKey("Amrita Sen") ? "Exists" : "Doesn't exist");

    System.out.println("Val exists?: 977855");
    System.out.println(contactList.containsValue(977855) ? "Exists" : "Doesn't exist");
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Map
$ javac PhoneNo.java
User@bose /c/sayan/Wipro-TalentNext/Map
$ java PhoneNo
Key exists?: Amrita Sen
Exists
Val exists?: 977855
Doesn't exist
```

### 5.
Code
```java
import java.util.ArrayList;
import java.util.TreeMap;

class CountryTreeMap {
  TreeMap<String, String> m1 = new TreeMap<>();
  TreeMap<String, String> m2 = new TreeMap<>();

  TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
    m1.put(countryName, capital);
    return m1;
  }

  String getCapital(String countryName) {
    return m1.get(countryName);
  }

  String getCountry(String capitalName) {
    for (String country : m1.keySet()) {
      if (m1.get(country).equals(capitalName)) {
        return country;
      }
    }
    return null;
  }

  void reverseMap() {
    m2.clear(); // optional: clear previous contents
    for (String country : m1.keySet()) {
      m2.put(m1.get(country), country);
    }
    System.out.println(m2);
  }

  ArrayList<String> getAllCountries() {
    ArrayList<String> countries = new ArrayList<>();
    for (String country : m1.keySet()) {
      countries.add(country);
    }
    return countries;
  }
}

public class CountryTreeMapMain {
  public static void main(String[] args) {
    CountryTreeMap ch = new CountryTreeMap();

    ch.saveCountryCapital("India", "Delhi");
    ch.saveCountryCapital("US", "Washington DC");
    ch.saveCountryCapital("UK", "London");
    ch.saveCountryCapital("Bangladesh", "Dhaka");

    System.out.println("All countries");
    System.out.println(ch.getAllCountries());

    System.out.println("Capital for UK");
    System.out.println(ch.getCapital("UK"));

    System.out.println("Country whose capital is Delhi is");
    System.out.println(ch.getCountry("Delhi"));

    System.out.println("Reverse");
    ch.reverseMap();
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Map
$ javac CountryTreeMapMain.java
User@bose /c/sayan/Wipro-TalentNext/Map
$ java CountryTreeMapMain
All countries
[Bangladesh, India, UK, US]
Capital for UK
London
Country whose capital is Delhi is
India
Reverse
{Delhi=India, Dhaka=Bangladesh, London=UK, Washington DC=US}
```

### 6.
Code
```java
import java.util.ArrayList;
import java.util.Hashtable;

class CountryHashTable {
  Hashtable<String, String> m1 = new Hashtable<>();
  Hashtable<String, String> m2 = new Hashtable<>();

  Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
    m1.put(countryName, capital);
    return m1;
  }

  String getCapital(String countryName) {
    return m1.get(countryName);
  }

  String getCountry(String capitalName) {
    for (String country : m1.keySet()) {
      if (m1.get(country).equals(capitalName)) {
        return country;
      }
    }
    return null;
  }

  void reverseMap() {
    m2.clear();
    for (String country : m1.keySet()) {
      m2.put(m1.get(country), country);
    }
    System.out.println(m2);
  }

  ArrayList<String> getAllCountries() {
    ArrayList<String> countries = new ArrayList<>();
    for (String country : m1.keySet()) {
      countries.add(country);
    }
    return countries;
  }
}

public class CountryHashTableMain {
  public static void main(String[] args) {
    CountryHashTable ch = new CountryHashTable();

    ch.saveCountryCapital("India", "Delhi");
    ch.saveCountryCapital("US", "Washington DC");
    ch.saveCountryCapital("UK", "London");
    ch.saveCountryCapital("Bangladesh", "Dhaka");

    System.out.println("All countries");
    System.out.println(ch.getAllCountries());

    System.out.println("Capital for UK");
    System.out.println(ch.getCapital("UK"));

    System.out.println("Country whose capital is Delhi is");
    System.out.println(ch.getCountry("Delhi"));

    System.out.println("Reverse");
    ch.reverseMap();
  }
}
```


Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Map
$ javac CountryHashTableMain.java
User@bose /c/sayan/Wipro-TalentNext/Map
$ java CountryHashTableMain
All countries
[Bangladesh, UK, India, US]
Capital for UK
London
Country whose capital is Delhi is
India
Reverse
{Washington DC=US, Dhaka=Bangladesh, Delhi=India, London=UK}
```

## Lambda Expressions

### 2.

Code
```java
import java.util.ArrayList;
import java.util.Arrays;

public class WordList {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.addAll(Arrays.asList("Tony Stark", "Steve Rogers", "Thor Odinson", "Steven Strange", "Wanda Maximoff",
        "Agatha Harkess", "Peter Parker", "Norman Osborne", "Harry Osborne", "May Parker"));

    al.forEach(a -> System.out.println(a));
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections/LambdaExpr
$ javac WordList.java 
User@bose /c/sayan/Wipro-TalentNext/Collections/LambdaExpr
$ java WordList
Tony Stark
Steve Rogers
Thor Odinson
Steven Strange
Wanda Maximoff
Agatha Harkess
Peter Parker
Norman Osborne
Harry Osborne
May Parker
```

### 4.
Code
```java
import java.util.Scanner;

interface WordCount {
  int count(String str);
}

public class MyClassWithLambda {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string");
    String s = sc.nextLine();
    sc.close();

    WordCount wc = (str -> str.split(" ").length);
    System.out.println("No of words in string " + wc.count(s));
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections/LambdaExpr
$ javac MyClassWithLambda.java 
User@bose /c/sayan/Wipro-TalentNext/Collections/LambdaExpr
$ java MyClassWithLambda
Enter string
Balanced as everything should be
No of words in string 5
```

## Method Reference

### 3.
Code
```java
interface PrimeChecker {
  MyPrime check(int n);
}

class MyPrime {
  MyPrime(int n) {
    if (isPrime(n)) {
      System.out.println("Prime");
    } else {
      System.out.println("Not Prime");
    }
  }

  private boolean isPrime(int num) {
    if (num <= 1)
      return false;
    if (num == 2)
      return true;
    if (num % 2 == 0)
      return false;
    for (int i = 3; i <= Math.sqrt(num); i += 2)
      if (num % i == 0)
        return false;
    return true;
  }
}

public class PrimeMain {
  public static void main(String[] args) {
    PrimeChecker pc = MyPrime::new;
    pc.check(17); 
    pc.check(18);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections/MethodReference
$ javac PrimeMain.java 
User@bose /c/sayan/Wipro-TalentNext/Collections/MethodReference
$ java PrimeMain
Prime
Not Prime
```

## Stream API

### 3
Code
```java
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
```

Output
```sh
$ javac StudentMain.java 
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ java StudentMain
1 Tony Stark 99.68
2 Bruce Banner 99.66
3 Wanda Maximoff 42.05
4 Steve Rogers 49.06
5 Reed Richards 100.0
No passed: 
3
```

## Functional Interface

### 3.
Code
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Pallindrome {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>(
        Arrays.asList("madam", "hello", "racecar", "apple", "level", "world", "noon", "java", "civic", "kayak"));

    Predicate<String> isPalindrome = w -> w.equalsIgnoreCase(new StringBuilder(w).reverse().toString());

    words.stream()
        .filter(isPalindrome)
        .forEach(w -> System.out.println(w));
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ javac Pallindrome.java 
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ java Pallindrome
madam
racecar
level
noon
civic
kayak
```

### 7.
Code
```java
import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenCheck {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      al.add(i);
    }

    Consumer<Integer> printOdd = n -> {
      System.out.println(n + " is " + (n % 2 == 0 ? "Even" : "Odd"));
    };

    al.forEach(printOdd);
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ javac OddEvenCheck.java 
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ java OddEvenCheck
1 is Odd
2 is Even
3 is Odd
4 is Even
5 is Odd
6 is Even
7 is Odd
8 is Even
9 is Odd
10 is Even
```

### 8.
Code
```java
import java.util.ArrayList;
import java.util.function.Supplier;

public class PrimeSupplier {
  public static void main(String[] args) {
    Supplier<ArrayList<Integer>> primeSupplier = () -> {
      ArrayList<Integer> primes = new ArrayList<>();
      int num = 2;
      while (primes.size() < 10) {
        if (isPrime(num))
          primes.add(num);
        num++;
      }
      return primes;
    };
    System.out.println(primeSupplier.get());
  }

  private static boolean isPrime(int number) {
    if (number <= 1)
      return false;
    for (int i = 2; i * i <= number; i++) {
      if (number % i == 0)
        return false;
    }
    return true;
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ javac PrimeSupplier.java 
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ java PrimeSupplier
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
```

## Date Time API

### 4.

Code
```java
import java.time.LocalDate;
import java.time.Year;

public class LeapYear {
  public static void main(String[] args) {
    int year = LocalDate.now().getYear();

    if (Year.isLeap(year)) {
      System.out.println(year + " is Leap Year");
    } else {
      System.out.println(year + " is Not Leap Year");
    }
  }
}
```

Output
```sh
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ javac LeapYear.java
User@bose /c/sayan/Wipro-TalentNext/Collections/Normal
$ java LeapYear
2025 is Not Leap Year
```