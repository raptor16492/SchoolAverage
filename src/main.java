import java.util.Scanner;

public class main {

	public static Scanner s = new Scanner(System.in);
	
	public static void main (String[] args){
		subject.getSubjectName();
		average.getNumberOfMarks();
		average.getMarks();
		average.addMarks();
		average.calculateSubjectAverage();
		System.out.println("Your average in " + subject.subjectName + " is " + average.subjectAverage);
	}	
}
