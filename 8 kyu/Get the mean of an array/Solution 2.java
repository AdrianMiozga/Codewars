public class School {
 	public static int getAverage(int[] marks) {
		int result = 0;
    
    for (int mark : marks) {
      result += mark;
    }
    
    return result /= marks.length;
	}
}