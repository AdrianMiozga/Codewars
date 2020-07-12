import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {
  public static String countingSheep(int num) {
    return IntStream.rangeClosed(1, num)
      .mapToObj(i -> i + " sheep...")
      .collect(Collectors.joining());
  }
}