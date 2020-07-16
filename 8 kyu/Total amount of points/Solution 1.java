import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
      return Arrays.stream(games)
        .mapToInt(x -> x.charAt(0) - x.charAt(2))
        .map(x -> x > 0 ? 3 : x < 0 ? 0 : 1).sum();
    }
}