import java.util.Arrays;
import java.lang.Math;

public class Kata {
  public static int squareSum(int[] n) { 
    return Arrays.stream(n)
      .map(x -> (int) Math.pow(x, 2))
      .reduce(Integer::sum).orElse(0);
  }
 }