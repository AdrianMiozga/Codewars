public class Kata {
  public static int[] countPositivesSumNegatives(int[] input) {
    if (input == null || input.length == 0) {
      return new int[0];
    }
    
    int negativeNumbers = 0;
    int positiveNumbers = 0;
    
    for (int number : input) {
      if (number < 0) {
        negativeNumbers += number;
      }
      
      if (number > 0) {
        positiveNumbers++;
      }
    }
    return new int[] {positiveNumbers, negativeNumbers};
  }
}