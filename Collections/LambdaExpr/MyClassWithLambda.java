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