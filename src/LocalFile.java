import java.io.*;

public class LocalFile {
	
	public static FileWriter fileWrite;

	public static void createFile(String fileName) {
		try {
			FileWriter fileWrite_temp = new FileWriter(fileName + ".txt", true);
			allowPublicAccess(fileWrite_temp);
		} catch (Throwable t1) {
			System.out.println("Error!");
			System.out.println(t1.getMessage());
			t1.printStackTrace();
		}
	}

	private static void allowPublicAccess(FileWriter fileWrite_temp2) {
		fileWrite = fileWrite_temp2;
	}
	
	public static void writeFile(String input) {
		try {
			BufferedWriter out = new BufferedWriter(fileWrite);
			for (int arrayToFile_counter = 0; arrayToFile_counter < Marks.mark.length; arrayToFile_counter++) {
				out.newLine(); 
				out.write(Integer.toString(Marks.mark[arrayToFile_counter]));
			}
			out.close();
		} catch (Throwable t2) {
		}		
	}
}


