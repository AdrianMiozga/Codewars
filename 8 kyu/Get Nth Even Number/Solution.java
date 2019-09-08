public class Num {
  public static int nthEven(int n) {
    int counter = 0;
  
    for (int i = 1; i < n; i++) {
      counter += 2;
    }
    return counter;
  }
}