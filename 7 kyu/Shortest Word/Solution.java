import java.util.stream.Stream;
import java.util.Arrays;

public class Kata {
  public static int findShort(String s) {
    return Stream.of(s.split(" ")).mapToInt(String::length).min().orElse(0);
  }
}