import java.util.stream.Stream;

public class DivisibleNb {
	public static boolean isDivisible(long n, long x, long y) {
    return Stream.of(n).anyMatch(z -> z % x == 0 && z % y == 0);
	}
}