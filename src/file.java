//hi

import java.io.*;

public class file {
	
	public static FileWriter file;
	public static Reader file3;

	public static void createFile(String fileName) {
		try {
			FileWriter fstream = new FileWriter(fileName + ".txt", true);
			FileReader fstream_ = new FileReader(fileName + ".txt");
//			BufferedWriter out = new BufferedWriter(fstream);
//			BufferedReader in = new BufferedReader(fstream_);
			test(fstream, fstream_);
		} catch (Throwable t) {
			System.out.println("Error!");
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
	}

//if (in.readLine() == null){
//				out.write("Hello");
//			} else {
//				out.newLine();
//				out.write("Hello");
//			}
//			out.close();

	private static void test(FileWriter file1, Reader file2) {
		file = file1;
		file3 = file2;
	}
	
	public static void writeFile(String input) {
		try {
			BufferedWriter out = new BufferedWriter(file);
			BufferedReader in = new BufferedReader(file3);
//			out.write(input);
//			out.close();
			if (in.readLine() == null){
				out.write(input);
			} else {
				out.newLine();
				out.write(input);
			}
			out.close();
		} catch (Throwable tt) {
			System.out.println("Error!");
			System.out.println(tt.getMessage());
			tt.printStackTrace();
		}		
	}
}