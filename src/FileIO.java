import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class FileIO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Read or write a file? Type 'r' for read and 'w' for write.");
		String operation = in.nextLine();
		
		if(operation.equalsIgnoreCase("w")) {
			System.out.println("We're going to write a file! What should it be called?");
			String filename = in.nextLine();
			try {
				FileWriter fw = new FileWriter(filename);
				System.out.println("What text should we put in the file?");
				String fileContents = in.nextLine();
				fw.write(fileContents);
				fw.close();
				System.out.println("file was successfully written!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(operation.equalsIgnoreCase("r")) {
			System.out.println("We're going to read a file! What is the file called?");
			String filename = in.nextLine();
			File f = new File(filename);
			
			try {
				Scanner fileParser = new Scanner(f);
				while(fileParser.hasNextLine()) {
					System.out.println(fileParser.nextLine());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		in.close();

	}

}
