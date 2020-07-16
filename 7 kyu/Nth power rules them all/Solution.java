import java.util.Arrays;

public class Kata {
  public static int modifiedSum(int[] array, int power) {
    return Arrays.stream(array).map(i -> (int) Math.pow(i, power)).sum() - Arrays.stream(array).sum();
  }
}