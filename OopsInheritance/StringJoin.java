import java.util.StringJoiner;

public class StringJoin {
  public static void main(String[] args) {
    StringJoiner s1 = new StringJoiner("-");
    s1.add("Kolakta").add("Mumbai").add("Chennai");

    StringJoiner s2 = new StringJoiner("-");
    s2.add("Delhi").add("Paris").add("Melborne");

    StringJoiner merges1s2 = new StringJoiner("-");
    merges1s2.add("Delhi").add("Paris").add("Melborne").merge(s1);
    System.out.println("s1 merged to s2: " + merges1s2);

    StringJoiner merges2s1 = new StringJoiner("-");
    merges2s1.add("Kolakta").add("Mumbai").add("Chennai").merge(s2);
    System.out.println("s2 merged to s1: " + merges2s1);
  }
}
