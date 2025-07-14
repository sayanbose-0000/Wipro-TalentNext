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