import java.lang.Math;

public class Kata {
  public static int[] squareOrSquareRoot(int[] array) {
    int[] result = new int[array.length];
    
    for (int i = 0; i < array.length; i++) {
      if ((int) Math.sqrt(array[i]) * (int) Math.sqrt(array[i]) == array[i]) {
        result[i] = (int) Math.sqrt(array[i]);
        continue;
      }
      result[i] = array[i] * array[i];
    }
    return result;
  }
}