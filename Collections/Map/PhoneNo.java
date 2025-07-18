import java.util.HashMap;

public class PhoneNo {
  public static void main(String[] args) {
    HashMap<String, Integer> contactList = new HashMap<>();

    contactList.put("Aman Ghosh", 96315);
    contactList.put("Ankit Bose", 96788);
    contactList.put("Amrita Sen", 97236);
    contactList.put("Susmita Ray", 91055);

    System.out.println("Key exists?: Amrita Sen");
    System.out.println(contactList.containsKey("Amrita Sen") ? "Exists" : "Doesn't exist");

    System.out.println("Val exists?: 977855");
    System.out.println(contactList.containsValue(977855) ? "Exists" : "Doesn't exist");
  }
}
