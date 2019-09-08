public class Kata {
  public static double find_average(int[] array) {
    double sum = 0;
    
    for (double number : array) {
      sum += number;
    }
    return sum / array.length;
  }
}