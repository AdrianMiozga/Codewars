public class NoBoring {
  public static int noBoringZeros(int n) {
    String result = "" + n;
    
    while (result.endsWith("0") && result.length() > 1) {
      result = result.substring(0, result.length() - 1);
    }
    return Integer.parseInt(result);
  }
}