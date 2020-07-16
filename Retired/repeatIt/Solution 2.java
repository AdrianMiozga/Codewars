import java.util.stream.Stream;
import java.util.stream.Collectors;

public class RepeatIt {
    public static String repeatString(final Object toRepeat, final int n) {
        return toRepeat instanceof String ? Stream.generate(() -> toRepeat)
          .limit(n)
          .map(Object::toString)
          .collect(Collectors.joining()) : "Not a string";
    }
}