//
public class Marks {

	public static int numberOfMarks;
	public static int subjectAverage;
	public static int[] mark;
	public static int markTotal;
	
	public static void getNumberOfMarks() {
		System.out.println("How many marks are there?");
		numberOfMarks = SchoolAverage.s.nextInt();
		mark = new int[numberOfMarks];
	}
	
	public static void getMarks() {
		System.out.println("Enter your marks: ");
		for (int getMarks_counter = 0; getMarks_counter < numberOfMarks; getMarks_counter++) {
			 mark[getMarks_counter] = SchoolAverage.s.nextInt();
			 LocalFile.writeFile(Integer.toString(mark[getMarks_counter]));
		}
	}
	
	public static void addMarks() {
		for (int addMarks_counter = 0; addMarks_counter < numberOfMarks; addMarks_counter++) {
			markTotal += mark[addMarks_counter];
		}
	}
	
	public static void calculateSubjectAverage() {
		subjectAverage = markTotal / numberOfMarks;
	}		
}

