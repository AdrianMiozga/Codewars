import java.util.stream.Collectors;
import java.util.Arrays;

public class Spacify {
  public static String spacify(String str) {
    return Arrays.stream(str.split("")).collect(Collectors.joining(" "));
  }
}