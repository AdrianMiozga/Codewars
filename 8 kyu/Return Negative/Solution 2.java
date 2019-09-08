public class Kata {
  public static int makeNegative(final int x) {
    if (x < 0) {
      return x;
    }
    
    if (x > 0) {
      return -x;
    }
    return 0;
  }
}