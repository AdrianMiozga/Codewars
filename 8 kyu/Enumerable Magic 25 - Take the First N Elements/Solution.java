import java.util.Arrays;

public class ZywOo {
  public static int[] take(int[] arr, int n) {
    return Arrays.stream(arr).limit(n).toArray();
  }
}