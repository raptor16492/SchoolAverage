import java.util.Scanner;

public class SchoolAverage {

	public static Scanner s = new Scanner(System.in);
	
	public static void main (String[] args){
		Subject.getSubjectName();
		Marks.getNumberOfMarks();
		Marks.getMarks();
		Marks.addMarks();
		Marks.calculateSubjectAverage();
		System.out.println("Your average in " + Subject.subjectName + " is " + Marks.subjectAverage);
	}	
}
