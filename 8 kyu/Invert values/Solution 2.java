public class Kata {
  public static int[] invert(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = -array[i];
    }
    return array;
  }
}