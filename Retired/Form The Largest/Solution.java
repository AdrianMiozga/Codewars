import java.util.*;

public class Solution {
    public static long maxNumber(long n) {
        return Long.parseLong(Long.toString(n).chars().boxed()
            .sorted(Comparator.reverseOrder()).collect(StringBuilder::new,
            StringBuilder::appendCodePoint, StringBuilder::append)
            .toString());
    }
}