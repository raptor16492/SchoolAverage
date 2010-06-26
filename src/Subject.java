public class Subject {

	public static String subjectName;
		
	public static void getSubjectName() {
		System.out.println("Enter the name of the subject: ");
		subjectName = SchoolAverage.s.next();
		LocalFile.createFile(subjectName);
	}
}
