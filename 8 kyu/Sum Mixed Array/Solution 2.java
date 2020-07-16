import java.util.List;

public class MixedSum {
	public int sum(List<?> mixed) {	
    int result = 0;
    for (Object item : mixed) {
      result += Integer.parseInt(item.toString());
    }
    return result;
	}
}