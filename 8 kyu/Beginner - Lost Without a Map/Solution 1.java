import java.util.stream.IntStream;

public class Maps {
  public static int[] map(int[] arr) {
    return IntStream.of(arr).map(x -> x * 2).toArray();
  }
}