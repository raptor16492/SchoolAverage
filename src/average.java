
public class average {

	public static int numberOfMarks;
	public static int subjectAverage;
	public static int[] mark;
	public static int markTotal;
//	public static String mark_string;
	
	static void getNumberOfMarks() {
		System.out.println("How many marks are there?");
		numberOfMarks = main.s.nextInt();
		mark = new int[numberOfMarks];
	}
	
	static void getMarks() {
		System.out.println("Enter your marks: ");
		for (int getMarks_counter = 0; getMarks_counter < numberOfMarks; getMarks_counter++) {
			 mark[getMarks_counter] = main.s.nextInt();
			 file.writeFile(Integer.toString(mark[getMarks_counter]));
		}
	}
	
	static void addMarks() {
		for (int addMarks_counter = 0; addMarks_counter < numberOfMarks; addMarks_counter++) {
			markTotal += mark[addMarks_counter];
		}
	}
	
	static void calculateSubjectAverage() {
		subjectAverage = markTotal / numberOfMarks;
	}		
}

