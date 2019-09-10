public class Kata {
  public static int grow(int[] x) {
    int result = 1;
    
    for (int number : x) {
      result *= number;
    }
    return result;
  }
}