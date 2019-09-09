public class TotalPoints {
  public static int points(String[] games) {
    int sum = 0;
    
    for (String game : games) {
      String[] points = game.split(":");
      
      if (Integer.parseInt(points[0]) > Integer.parseInt(points[1])) {
        sum += 3;
      }
      
      if (points[0].equals(points[1])) {
        sum++;
      }
    }
    return sum;
  }
}