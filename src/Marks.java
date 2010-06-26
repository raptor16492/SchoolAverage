public class Marks {

	public static int numberOfMarks;
	public static int subjectAverage;
	public static int[] inputMark;
	public static int[] fileMark;
	public static int markTotal;
	
	public static void getNumberOfMarks() {
		System.out.println("How many marks are there?");
		numberOfMarks = SchoolAverage.s.nextInt();
		inputMark = new int[numberOfMarks];
	}
	
	public static void getMarks() {
		System.out.println("Enter your marks: ");
		for (int getMarks_counter = 0; getMarks_counter < numberOfMarks; getMarks_counter++) {
			 inputMark[getMarks_counter] = SchoolAverage.s.nextInt();
		}
	}
	
	public static void addMarks() {
		for (int addMarks_counter = 0; addMarks_counter < numberOfMarks; addMarks_counter++) {
			markTotal += inputMark[addMarks_counter];
		}
	}
	
	public static void calculateSubjectAverage() {
		subjectAverage = markTotal / numberOfMarks;
	}		
}

