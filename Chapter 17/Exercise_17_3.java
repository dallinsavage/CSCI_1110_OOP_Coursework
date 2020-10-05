/* Dallin Savage
 * 10/5/20
 * Writes 100 ints, reads and adds them
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_17_3 {

	public static void main(String[] args) throws IOException {
		Write();
		Read();
		
	}

	public static void Write() throws IOException {
		File file = new File("Exercise17_3.dat");
		DataOutputStream output = new DataOutputStream(new FileOutputStream(file, true));
		for (int i = 0; i < 100; i++) {
			output.write((int)(Math.random() * 10));
		}
		output.close();
	}
	
	public static void Read() throws IOException {
		File file = new File("Exercise17_3.dat");
		DataInputStream input = new DataInputStream(new FileInputStream(file));
		int value;
		int num = 0;
		while ((value = input.read()) != -1) {
			num = num + value;
		}
		System.out.println(num);
		input.close();
	}
}
