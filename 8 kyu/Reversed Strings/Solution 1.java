public class Kata {
  public static String solution(String str) {
    String newString = "";
    
    for (int i = str.length() - 1; i >= 0; i--) {
      newString += str.charAt(i);
    }
    return newString;
  }
}