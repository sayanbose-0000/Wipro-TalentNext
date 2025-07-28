interface Book {
  void printBook(String bookName);
}

public class Main {
  static void dance(String b) {
    System.out.println("Hi " + b);
  }

  public static void main(String[] args) {
    // Lambda Expr
    Book b1 = (bn) -> System.out.println(bn);
    b1.printBook("Nightingale");

    // Lambda Expr
    Book b2 = (bn) -> {
      bn += " (Copyright)";
      System.out.println(bn);
    };
    b2.printBook("Tom Sawyer");

    // Method Reference
    Book b3 = Main::dance;
    b3.printBook("Huckelburry Finn");
  }
}