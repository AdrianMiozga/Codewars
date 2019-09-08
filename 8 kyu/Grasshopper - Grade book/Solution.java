public class GrassHopper {
  public static char getGrade(int s1, int s2, int s3) {
    int score = (s1 + s2 + s3) / 3;
    
    if (score >= 90) {
      return 'A';
    }
    
    if (score >= 80) {
      return 'B';
    }
    
    if (score >= 70) {
      return 'C';
    }
    
    if (score >= 60) {
      return 'D';
    }
    
    return 'F';
  }
}