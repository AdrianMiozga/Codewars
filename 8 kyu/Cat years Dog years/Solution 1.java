public class Dinglemouse {
  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 4 * (humanYears - 1) + 15;
        int dogYears = 5 * (humanYears - 1) + 15;
        
        if (humanYears > 1) {
            catYears += 5;
            dogYears += 4;
        }
        return new int[] {humanYears, catYears, dogYears};
    }
}