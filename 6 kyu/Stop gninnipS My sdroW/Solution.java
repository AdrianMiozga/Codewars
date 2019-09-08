public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    String reversed = "";
    String reversedWord = "";
    
    for (String word : words) {
      if (word.length() >= 5) {
        for (int j = word.length() - 1; j >= 0; j--) {
          reversedWord += word.charAt(j);
        }
        reversed += reversedWord;
        reversedWord = "";
      } else {
        reversed += word;
      }
      reversed += " ";
    }
    return reversed.trim();
  }
}