public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = 0;
    
    for (int points : classPoints) {
      sum += points;
    }
    
    int classAverage = sum / classPoints.length;
    
    return yourPoints > classAverage;
  }
}