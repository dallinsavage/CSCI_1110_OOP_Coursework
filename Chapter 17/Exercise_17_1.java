/* Dallin Savage
 * 10/5/20
 * writes and reads 100 random ints
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_17_1 {

	public static void main(String[] args) throws IOException {
		File file = new File("Exercise17_1.txt");
		FileOutputStream output = new FileOutputStream(file);
				for (int i = 0; i < 100; i++) {
					output.write((int)(Math.random() * 10));
				}
		output.close();
		FileInputStream input = new FileInputStream(file);
		int value;
		while ((value = input.read()) != -1) {
			System.out.print(value + " ");
		}
		input.close();
	}
}
