import java.util.stream.IntStream;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    return IntStream.of(numbers).filter(x -> x % divider == 0).toArray();
  }
}