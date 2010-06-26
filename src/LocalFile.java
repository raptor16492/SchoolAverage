import java.io.*;

public class LocalFile {
	
	public static FileWriter fileWrite;
	public static FileReader fileRead;
	public static int numberOfLines = 0;

	public static void createFile(String fileName) {
		try {
			FileWriter fileWrite_temp = new FileWriter(fileName + ".txt", true);
			FileReader fileRead_temp = new FileReader(fileName + ".txt");
			allowPublicAccess(fileWrite_temp, fileRead_temp);
		} catch (Exception e1) {
			System.out.println("Error!");
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
	}

	private static void allowPublicAccess(FileWriter fileWrite_temp2, FileReader fileRead_temp2) {
		fileWrite = fileWrite_temp2;
		fileRead = fileRead_temp2;
	}
	
	public static void arrayToFile() {
		try {
			BufferedWriter out = new BufferedWriter(fileWrite);
			for (int arrayIndex_write = 0; arrayIndex_write < Marks.inputMark.length; arrayIndex_write++) {
				out.newLine(); 
				out.write(Integer.toString(Marks.inputMark[arrayIndex_write]));
			}
			out.close();
		} catch (Exception e2) {
		}		
	}
	
	public static void fileToArray() {
		try {
			BufferedReader in = new BufferedReader(fileRead);
			countLines();
			Marks.fileMark = new int[numberOfLines];
			for (int arrayIndex_read = 0; arrayIndex_read < numberOfLines; arrayIndex_read++) {
				Marks.fileMark[arrayIndex_read] = Integer.parseInt(in.readLine());
			}
		} catch (Exception e3) {
			System.out.println("Error!");
			System.out.println(e3.getMessage());
			e3.printStackTrace();
		}
	}
	
	public static void countLines() {
		LineNumberReader line = new LineNumberReader(fileRead);
		try {
			while (line.readLine() != null) {
				numberOfLines++;
			}
		} catch (Exception e4) {
			System.out.println("Error!");
			System.out.println(e4.getMessage());
			e4.printStackTrace();
		}
	}
}


