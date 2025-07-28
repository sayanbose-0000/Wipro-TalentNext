class ScoobyShaggy {
  public static void main(String[] args) {
    Thread scooby = new Thread(
      () -> {
        System.out.println(
          "Thread " + Thread.currentThread().getName() + " running"
        );
      },
      "Scobby"
    );

    Thread shaggy = new Thread(
      () -> {
        System.out.println(
          "Thread " + Thread.currentThread().getName() + " running"
        );
      },
      "Shaggy"
    );

    scooby.start();
    shaggy.start();
  }
}
