import java.util.stream.IntStream;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
        return IntStream.rangeClosed(1, array.length - 1)
          .filter(i -> array[i - 1] != array[i] - 1)
          .mapToObj(i -> Integer.valueOf(array[i])).findFirst().orElse(null);
    }
}