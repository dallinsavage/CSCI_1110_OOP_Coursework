/* Dallin Savage
 * 8/24/20
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_12_15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Exercise12_15.txt");
		if (!file.exists()) {
		PrintWriter output = new PrintWriter(file);
		for (int i = 0; i < 100; i++) {
			int num = (int)(Math.random() * 10);
			output.print(num + " ");
		}
		output.close();
		}
		else {
		Scanner  read = new Scanner(file);
		int i = 0;
		int array[] = new int[100];
		while (read.hasNext()) {
		array[i] = Integer.parseInt(read.next());
		i++;
		}
		read.close();
		Arrays.sort(array);
		for ( int x = 0; x < array.length; x++) {
			System.out.println(array[x]);
		}
		}
	}

}
