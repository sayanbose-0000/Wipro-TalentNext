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