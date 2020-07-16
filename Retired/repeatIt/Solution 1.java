import java.util.stream.Stream;
import java.util.stream.Collectors;

public class RepeatIt {
    public static String repeatString(final Object toRepeat, final int n) {
        return toRepeat instanceof String ? Stream.generate(() -> (String) toRepeat)
          .limit(n)
          .collect(Collectors.joining()) : "Not a string";
    }
}