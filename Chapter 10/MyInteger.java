
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
	}
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
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
			}
		}
		return prime;
	}
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
	}
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
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
	}
	public static boolean isOdd(MyInteger newValue) {
		if (value % 2 != 0) {
			return true;
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
	}
	public boolean equals(MyInteger x) {
		if (x == MyInteger) {
			return true;
		}
	}
	public static int parseInt(char[]) {
		int i = 0;
		int x = MyInteger.length;
		while (i <= MyInteger.length) {
			
		}
	}
	public static int parseInt(String) {
		int i = Integer.parseInt(MyInteger);
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
