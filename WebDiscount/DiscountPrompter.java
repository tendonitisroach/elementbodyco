import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class DiscountPrompter {
	public static void main(String[] args) {
		String userEmail = JOptionPane.showInputDialog(null, "Hello, please enter your email: ");

		JOptionPane.showMessageDialog(null, "Your email: " + userEmail);

		tryStoringData(userEmail);
	} // End main

	private static void tryStoringData(String userEmail) {

		try {
			FileWriter writer = new FileWriter("webEmails.txt", true);
			writer.write(userEmail + "\n");
			writer.close();
			JOptionPane.showMessageDialog(null, "Email stored successfully!");
		} catch (IOException e) {

			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String stackTrace = sw.toString();

			JOptionPane.showMessageDialog(null, "An error occurred:\n" + stackTrace, "Error", JOptionPane.ERROR_MESSAGE);
			// System.out.println("An error occured while trying to write the file...");
            // e.printStackTrace();
		} // End try-catch

	} // End method

} // End class