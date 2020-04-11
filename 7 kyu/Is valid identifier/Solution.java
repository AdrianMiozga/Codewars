public class IdentifierChecker {
  public static boolean isValid(String idn) {
    return idn.matches("(?i)[a-z_$][\\w$]*");
  }
}