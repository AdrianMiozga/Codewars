import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(arr).summaryStatistics();
        return arr.length > 1 ? intSummaryStatistics.getMax() - intSummaryStatistics.getMin() : 0;
    }
}