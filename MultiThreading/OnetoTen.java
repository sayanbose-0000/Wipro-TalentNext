class Counting implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      if (i == 6) {
        try {
          System.out.println("Delaying for 5000ms");
          Thread.sleep(5000);
        } catch (InterruptedException ie) {
          System.out.println(ie.getMessage());
        }
      }
      
      System.out.println(i);
    }
  }
}

public class OnetoTen {

  public static void main(String[] args) {
    Counting c = new Counting();
    Thread t = new Thread(c);

    t.start();
  }
}
