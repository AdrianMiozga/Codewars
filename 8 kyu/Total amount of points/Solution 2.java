public class TotalPoints {
  public static int points(String[] games) {
    int sum = 0;
    
    for (String game : games) {
      char x = game.charAt(0);
      char y = game.charAt(2);
      
      if (x > y) {
        sum += 3;
      }
      
      if (x == y) {
        sum++;
      }
    }
    return sum;
  }
}