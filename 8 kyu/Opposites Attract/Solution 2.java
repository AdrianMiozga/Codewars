public class OppositesAttract {
  public static boolean isLove(final int flower1, final int flower2) {
    if (flower1 % 2 == 0 && flower2 % 2 == 0) {
      return false;
    }
    
    if (flower1 % 2 != 0 && flower2 % 2 != 0) {
      return false;
    }
    return true;
  }
}