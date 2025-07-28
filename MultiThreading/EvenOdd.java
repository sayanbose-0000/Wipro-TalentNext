class EvenThread implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println("Even thread: " + i);
      }
    }
  }
}

class OddThread implements Runnable {

  @Override
  public void run() {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0) {
        System.out.println("Odd thread: " + i);
      }
    }
  }
}

public class EvenOdd {

  public static void main(String[] args) throws InterruptedException {
    EvenThread et = new EvenThread();
    OddThread ot = new OddThread();

    Thread tOdd = new Thread(ot);
    Thread tEven = new Thread(et);

    tEven.start();
    tEven.join();
    tOdd.start();
  }
}
