/* Dallin Savage
 * 10/6/20
 * encrypt a file
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_17_14 {

	public static void main(String[] args) throws IOException {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a file to be encrypted");
		DataInputStream input = new DataInputStream(new FileInputStream(userInput.next()));
		System.out.println("Enter name for encrypted file");
		File file = new File(userInput.next());
		DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
		try {
			while (true) {
				byte newOutput = input.readByte();
				output.write(newOutput + 5);
			}
		}
			catch (EOFException ex) {
				System.out.println("Finished");
				input.close();
				output.close();
			}
	}

}
