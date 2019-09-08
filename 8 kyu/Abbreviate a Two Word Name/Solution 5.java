public class AbbreviateTwoWords {
  public static String abbrevName(String name) {
    StringBuilder initials = new StringBuilder();
    
    for (String word : name.split(" ")) {
      initials.append(word.substring(0, 1));
    }
    return initials.insert(1, ".").toString().toUpperCase();
  }
}