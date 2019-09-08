import java.util.List;
import java.util.ArrayList;

public class Kata {
  public static int[] digitize(long n) {
    String str = Long.toString(n);
    int[] result = new int[str.length()];
    
    for (int i = str.length() - 1; i >= 0; i--) {
        result[str.length() - 1 - i] = str.charAt(i) - 48;
    }
    return result;
  }
}