import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Read or write a file? Type 'r' for read and 'w' for write.");
		String operation = in.nextLine();
		
		if(operation.equalsIgnoreCase("w")) {
			System.out.println("We're going to write a file!");
		}
		
		in.close();

	}

}
