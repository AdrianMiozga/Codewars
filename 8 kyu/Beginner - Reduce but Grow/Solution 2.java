import java.util.Arrays;

public class Kata{
  public static int grow(int[] x){
    return Arrays.stream(x).reduce((z, y) -> z * y).getAsInt();
  }
}