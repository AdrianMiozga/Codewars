public class Kata {
  public static String rps(String p1, String p2) {
    if (p1.equals(p2)) {
      return "Draw!";
    }
    
    String result = p1 + p2;
    int winner = result.equals("rockscissors") || result.equals("scissorspaper") || result.equals("paperrock") ? 1 : 2;
    return String.format("Player %d won!", winner);
  }
}