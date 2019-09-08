import java.util.*;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    List<Integer> result = new ArrayList<>();
    
    for (int number : numbers) {
      if ((number % divider) == 0) {
        result.add(number);
      }
    }
    
    int[] arrayResult = new int[result.size()];
    
    for (int i = 0; i < result.size(); i++) {
      arrayResult[i] = result.get(i);
    }
    return arrayResult;
  }
}