public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    return bonus ? ("\u00A3" + salary * 10) : ("\u00A3" + salary);
  }
}