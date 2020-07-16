public class CodeWars {
  public static int strCount(String str, char letter) {
    return (int) str.chars().filter(i -> i == letter).count();
  }
}