import java.util.Arrays;

public class WhichAreIn { 
	public static String[] inArray(String[] array1, String[] array2) {
    return Arrays.stream(array1).filter(i -> Arrays.stream(array2).anyMatch(s -> s.contains(i)))
      .distinct()
      .sorted()
      .toArray(String[]::new);
	}
}