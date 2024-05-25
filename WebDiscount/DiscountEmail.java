import java.io.File;
import java.io.FileNotFoundException;
import java.IOException;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class DiscountEmail {
	public static void main(String[] args) {
		File file = new File("webEmails.txt");
		Scanner scanner = new Scanner(file);

		String userEmail = JOptionPane.showInputDialog(null, "Welcome to BodyElementCo!/nEnter your email for your 10% discount:");
		} // End try-catch

	} // End main

	private static void tryStoringData(String userEmail) {

		try {
			FileWriter writer = new FileWriter("webEmails.txt");
			writer.write(userEmail + "\n");
			writer.close();
			System.out.println("Email stored successfully!");
		} catch (IOException e) {
			System.out.println("An error occured while trying to write the file...");
            e.printStackTrace();
		} // End try-catch

	} // End method

} // End class