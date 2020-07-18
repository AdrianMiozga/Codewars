import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);

        String[] word = s[0].split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length - 1; i++) {
            result.append(word[i]).append("***");
        }

        return result.append(word[word.length - 1]).toString();
    }
}