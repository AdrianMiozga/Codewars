import java.util.stream.IntStream;

public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return IntStream.of(classPoints).average().orElse(0) < yourPoints;
  }
}