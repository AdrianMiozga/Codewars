import java.lang.Math;

public class Kata {
  public static int[] squareOrSquareRoot(int[] array) {
    int[] result = new int[array.length];
    
    for (int i = 0; i < array.length; i++) {
      int square = (int) Math.sqrt(array[i]);
      
      result[i] = (square * square == array[i]) ? square : array[i] * array[i];
    }
    return result;
  }
}