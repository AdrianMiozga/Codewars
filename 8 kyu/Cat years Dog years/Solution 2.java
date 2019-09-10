public class Dinglemouse {
  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int catYears = 15;
    int dogYears = 15;
    
    for (int i = 1; i < humanYears; i++) {
      catYears += 4;
      dogYears += 5;
    }
    
    if (humanYears > 1) {
      catYears += 5;
      dogYears += 4;
    }
    
    return new int[] {humanYears, catYears, dogYears};
  }
}