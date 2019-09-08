public class Solution {
  public static String repeatStr(final int repeat, final String string) {
    String answer = "";
    
    for (int i = 0; i < repeat; i++) {
      answer += string;
    }
    return answer;
  }
}