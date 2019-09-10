public class Sid {
  public static String howMuchILoveYou(int nb_petals) {
    if (nb_petals > 6) {
      nb_petals = nb_petals % 6;
      
      if (nb_petals == 0) {
        nb_petals = 6;
      }
    }
    
    String[] result = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
    return result[nb_petals - 1];
  }
}