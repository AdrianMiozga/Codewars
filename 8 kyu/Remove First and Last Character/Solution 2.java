public class RemoveChars {
  public static String remove(String str) {
    StringBuilder string = new StringBuilder(str);
    
    string.replace(0, 1, "");
    string.replace(str.length() - 2, str.length() - 1, "");
    
    return string.toString();
  }
}