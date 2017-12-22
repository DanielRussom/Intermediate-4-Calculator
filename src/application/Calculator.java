package application;

public class Calculator {
	static String currentValue = "0";
	static String secondValue = "";
	static boolean isTest = false;
	static int charLimit = 10;
	static char operator = ' ';

	/**
	 * Handles receiving input
	 * @param value - Char pressed
	 */
	public static void recieveInput(char value) {
		// Checks if the value is a number
		if (Character.isDigit(value)) {
			// If midway through a calculation, stores the current value
			if(isTest) {
				isTest = false;
				secondValue = currentValue;
				currentValue = "0";
			}
			// Replaces the current value if it is 0
			if (currentValue.equals("0")) {
				currentValue = Character.toString(value);
				// Appends the new value to the end if within limit
			} else if (currentValue.length() < charLimit) {
				currentValue = currentValue + value;
			}
		}
		switch (value) {
		case '.':
			if (!currentValue.contains(".")) {
				currentValue = currentValue + value;
			}
			break;
		case '+':
			if (operator == '+' && secondValue.length()>0) {
				double result = Double.parseDouble(currentValue) + Double.parseDouble(secondValue);
				secondValue = "";
				currentValue = Double.toString(result);
				isTest = true;
			} else {
				System.out.println(operator + " " + secondValue + " " + currentValue);
				operator = '+';
				secondValue = currentValue;
				currentValue = "0";
			}
			break;
		case '-':
			if(operator == '-' && secondValue.length()>0) {
				System.out.println("B");
			} else {
				operator = '-';
				secondValue = currentValue;
				currentValue = "0";
			}
		case 'C':
			currentValue = "0";
			secondValue = "";
		}
		System.out.println(currentValue);
	}

	public static String getCurrentValue() {
		return currentValue;
	}
}
