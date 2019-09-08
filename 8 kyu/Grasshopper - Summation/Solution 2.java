public class GrassHopper {
  public static int summation(int n) {
    int sum = 1;
    
    for (int i = 2; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}