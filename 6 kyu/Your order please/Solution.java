import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;

public class Order {
  public static String order(String words) {
    return Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .collect(Collectors.joining(" "));
  }
}