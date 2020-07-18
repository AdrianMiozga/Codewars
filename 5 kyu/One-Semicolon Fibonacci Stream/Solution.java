public class Fibonacci {
  public static java.util.stream.IntStream stream(int a, int b) {
    return java.util.stream.Stream.iterate(new int[] {a, b}, p -> new int[] {p[1], p[0] + p[1]})
      .mapToInt(integer -> integer[0]);
  }
}