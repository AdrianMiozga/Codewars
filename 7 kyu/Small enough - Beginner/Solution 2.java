import java.util.stream.Stream;
import java.util.Arrays;

public class Kata {
  public static boolean smallEnough(int[] a, int limit) {
    return Arrays.stream(a).filter(number -> number <= limit).count() == a.length;
  }
}