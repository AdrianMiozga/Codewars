public class FakeBinary {
  public static String fakeBin(String numberString) { 
    for (int i = 1; i <= 4; i++) {
      numberString = numberString.replace((char) (i + '0'), '0');
    }
    
    for (int i = 5; i <= 9; i++) {
      numberString = numberString.replace((char) (i + '0'), '1');
    }
    return numberString;
  }
}