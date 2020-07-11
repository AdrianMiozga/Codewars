import java.util.*;

public class AbbreviateTwoWords {
  public static String abbrevName(String name) {
    String[] result = Arrays.stream(name.split(" ")).map(word -> word.substring(0, 1)).map(String::toUpperCase).toArray(String[]::new);
    return result[0] + "." + result[1];
  }
}