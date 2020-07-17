import java.util.stream.Stream;
import java.util.stream.Collectors;

class Progression {
  public static String arithmeticSequenceElements(int first, int step, long total) {
    return Stream.iterate(first, i -> i + step)
      .limit(total)
      .map(Object::toString)
      .collect(Collectors.joining(", "));
  }
}