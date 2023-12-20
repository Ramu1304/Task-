package task4;

import task4.MyException.HttpErrorCode;

public class MathOperations {
	
	public static int divide(int a, int b) {
		return a / b;
	}

	public static int divide(int a, int b, int c) throws MyException {
		try {
			return divide(divide(a, b), c);
		} catch (Exception e) {
			System.err.println("Error occurred while dividing the numbers - " + a + ", " + b + ", " + c);
			MyException myException = new MyException("Invalid numbers while doing division", HttpErrorCode.BAD_REQUEST,
					e);
			throw myException;
//			throw new ArithmeticException();
//			throw e;
		}

}

	public static char[] sum(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public static char[] sum(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
