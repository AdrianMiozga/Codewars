public class AbbreviateTwoWords {
  public static String abbrevName(String name) {
    String[] result = name.split(" ");
    return (result[0].charAt(0) + "." + result[1].charAt(0)).toUpperCase();
  }
}