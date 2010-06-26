import java.io.*;

public class LocalFile {
	
	public static FileWriter fileWrite;
	public static FileReader fileRead;

	public static void createFile(String fileName) {
		try {
			FileWriter fileWrite_temp = new FileWriter(fileName + ".txt", true);
			FileReader fileRead_temp = new FileReader(fileName + ".txt");
			allowPublicAccess(fileWrite_temp, fileRead_temp);
		} catch (Throwable t1) {
			System.out.println("Error!");
			System.out.println(t1.getMessage());
			t1.printStackTrace();
		}
	}

	private static void allowPublicAccess(FileWriter fileWrite_temp2, FileReader fileRead_temp2) {
		fileWrite = fileWrite_temp2;
		fileRead = fileRead_temp2;
	}
	
	public static void writeFile(String input) {
		try {
			BufferedWriter out = new BufferedWriter(fileWrite);
			BufferedReader in = new BufferedReader(fileRead);
			if (in.readLine() == null){
				out.write(input);
			} else {
				out.newLine();
				out.write(input);
			}
			out.close();
		} catch (Throwable t2) {
			System.out.println("Error!");
			System.out.println(t2.getMessage());
			t2.printStackTrace();
		}		
	}
}