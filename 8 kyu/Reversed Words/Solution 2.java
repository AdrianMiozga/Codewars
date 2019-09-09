public class ReverseWords {
  public static String reverseWords(String str) {
    String[] words = str.split(" ");
    
    StringBuilder result = new StringBuilder();
    
    for (int i = words.length - 1; i >= 0; i--) {
      result.append(words[i] + " ");
    }
    return result.toString().trim();
  }
}