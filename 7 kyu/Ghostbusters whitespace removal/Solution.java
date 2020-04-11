public class Ghostbusters {
  
  public static String ghostBusters(String building) {
    String newString = building.replaceAll(" ", "");
    if (newString.equals(building)) {
      return "You just wanted my autograph didn't you?";
    } else {
      return newString;
    }
  }
}