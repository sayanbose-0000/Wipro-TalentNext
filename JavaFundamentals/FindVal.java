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
