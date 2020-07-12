import java.util.Arrays;

public class Kata {
  public static int grow(int[] x) {
    return Arrays.stream(x).reduce((y, z) -> y * z).orElse(0);
  }
}