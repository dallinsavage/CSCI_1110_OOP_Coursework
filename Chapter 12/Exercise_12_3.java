import java.util.Scanner;

public class Exercise_12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[100];
		for (int i = 0; i < array.length - 1; i ++) {
			double num = (Math.random() * 10);
			array[i] = (int)num;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index");
		int index = input.nextInt();
		if (index > array.length - 1) {
			System.out.println("Out of Bounds");
		}
		else {
			System.out.println(array[index]);
		}
	}

}
