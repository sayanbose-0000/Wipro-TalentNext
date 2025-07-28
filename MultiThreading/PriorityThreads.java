class MyThread implements Runnable {

  String name;
  String priority;

  MyThread(String name, String priority) {
    this.name = name;
    this.priority = priority;
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Thread: " + name + ", Priority: " + priority);
    }
  }
}

public class PriorityThreads {

  public static void main(String[] args) {
    MyThread low = new MyThread("Thread 1", "Low");
    MyThread norm = new MyThread("Thread 2", "Norm");
    MyThread high = new MyThread("Thread 3", "High");
    
    Thread lowThread = new Thread(low);
    Thread normThread = new Thread(norm);
    Thread highThread = new Thread(high);
    
    lowThread.setPriority(Thread.MIN_PRIORITY);
    normThread.setPriority(Thread.NORM_PRIORITY);
    highThread.setPriority(Thread.MAX_PRIORITY);
    
    lowThread.start();
    normThread.start();
    highThread.start();
  }
}
