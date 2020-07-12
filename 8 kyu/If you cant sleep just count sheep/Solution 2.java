import java.util.stream.Collectors;
import java.util.stream.Stream;

class Kata {
  public static String countingSheep(int num) {
    return Stream.iterate(1, number -> number + 1)
      .limit(num)
      .map(Object::toString)
      .collect(Collectors.joining(" sheep...")) + " sheep...";
  }
}