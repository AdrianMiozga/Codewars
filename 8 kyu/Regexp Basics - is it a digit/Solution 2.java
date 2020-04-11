import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
  
  public static boolean isDigit(String input) {
    return Pattern.compile("\\d").matcher(input).matches();
  }
}