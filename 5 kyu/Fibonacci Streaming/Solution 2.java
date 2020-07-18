import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Utility {
  public static IntStream generateFibonacciSequence() {
    return Stream.iterate(new int[] {1, 1}, p -> new int[] {p[1], p[0] + p[1]})
      .mapToInt(integer -> integer[0]);
  }
}