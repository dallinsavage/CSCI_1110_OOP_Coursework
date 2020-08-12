/*Dallin Savage
 * 8/12/20
 */

public class MyInteger {
	
	private static int value = 0;
	
	MyInteger(int newValue) {
		value = newValue;
	}
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isPrime() {
		boolean prime = true;
		int i = 2;
		while (i <= value / 2) {
			if (value % i != 0) {
				i++;
			}
			else {
				prime = false;
				break;
			}
		}
		return prime;
	}
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrime(int value) {
		boolean prime = true;
		int i = 2;
		while (i <= value / 2) {
			if (value % i != 0) {
				i++;
			}
			else {
				prime = false;
			}
		}
		return prime;
	}
	public static boolean isEven(MyInteger newValue) {
		if (value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(MyInteger newValue) {
		if (value % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isPrime(MyInteger newValue) {
		boolean prime = true;
		int i = 2;
		while (i <= value / 2) {
			if (value % i != 0) {
				i++;
			}
			else {
				prime = false;
			}
		}
		return prime;
	}
	public boolean equals(int x) {
		if (x == value) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean equals(MyInteger MyInteger, MyInteger newValue) {
		if (newValue == MyInteger) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int parseInt(char[] array) {
		String str = String.valueOf(array);
		int num = Integer.parseInt(str);
		return num;
	}
	public static int parseInt(String s) {
		int i = Integer.parseInt(s);
		return i;
	}
}

class testMyInteger {
	public static void main(String[] args) {
		MyInteger int1 = new MyInteger(7);
		char[] num = new char[4];
		num[0] = '-';
		num[1] = '1';
		num[2] = '2';
		num[3] = '3';
		String s = "-223";
		System.out.println(int1.getValue());
		System.out.println(int1.isEven());
		System.out.println(int1.isOdd());
		System.out.println(int1.isPrime());
		System.out.println(int1.equals(5));
		System.out.println(MyInteger.isEven(5));
		System.out.println(MyInteger.isOdd(5));
		System.out.println(MyInteger.isPrime(5));
		System.out.println(MyInteger.parseInt(s));
		System.out.println(MyInteger.parseInt(num));
		System.out.println(MyInteger.isEven(int1));
		System.out.println(MyInteger.isOdd(int1));
		System.out.println(MyInteger.isPrime(int1));
	}
}
