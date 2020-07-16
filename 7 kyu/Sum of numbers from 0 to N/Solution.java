import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequenceSum {
    public static String showSequence(int value) {
        return value == 0 ? "0=0" :
          value <= 0 ? value + "<0" :
          Stream.iterate(0, x -> x + 1)
            .limit(value + 1)
            .map(Object::toString)
            .collect(Collectors.joining("+")) + " = " + IntStream.rangeClosed(1, value).sum();
    }
}