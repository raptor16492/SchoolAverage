
public class subject {

	public static String subjectName;
		
	static void getSubjectName() {
		System.out.println("Enter the name of the subject: ");
		subjectName = main.s.next();
		file.createFile(subjectName);
	}
}
