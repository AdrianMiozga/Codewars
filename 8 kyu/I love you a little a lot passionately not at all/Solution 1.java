public class Sid {
  public static String howMuchILoveYou(int nb_petals) {
    String[] result = {"not at all", "I love you", "a little", "a lot", "passionately", "madly"};
    return result[nb_petals % 6];
  }
}