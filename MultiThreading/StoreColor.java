import java.util.Random;

public class StoreColor implements Runnable {
  String[] colors = { "white", "blue", "black", "green", "red", "yellow" };
  Random random = new Random();
  
  @Override
  public void run() {
    while(true) {
      int idx = random.nextInt(colors.length);    
      String color = colors[idx];
      System.out.println("Current color is: " + color);
      
      if (color == "red") {
        System.out.println("Red encountered. Execution stopped!");
        break;
      }
    }
  }

  public static void main(String[] args) {
    StoreColor sc = new StoreColor();
    Thread t = new Thread(sc);
    t.start();
  }
}
