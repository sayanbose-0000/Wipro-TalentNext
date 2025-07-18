import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the input file name");
    String inputFile = sc.nextLine();

    System.out.println("Enter the output file name");
    String outputFile = sc.nextLine();

    Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();

    try (FileReader fr = new FileReader(inputFile); FileWriter fw = new FileWriter(outputFile)) {
      Scanner fileScanner = new Scanner(fr);
      while (fileScanner.hasNextLine()) {
        String[] words = fileScanner.nextLine().split("\\s+");
        for (String word : words) {
          wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
      }
      
      fileScanner.close();

      for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
        fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
      }

      System.out.println("Word count has been written to " + outputFile);

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}