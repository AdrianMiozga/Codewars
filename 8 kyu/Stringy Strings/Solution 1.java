public class Kata {
  public static String stringy(int size) {
    String result = "";
    
    for (int i = 1; i <= size; i++) {
      result += i % 2;
    }
    return result;
  }
}