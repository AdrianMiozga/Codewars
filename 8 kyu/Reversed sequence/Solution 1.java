import java.util.stream.IntStream;

public class Sequence {
  public static int[] reverse(int n) {
    return IntStream.iterate(n, i -> i - 1).limit(n).toArray();
  }
}