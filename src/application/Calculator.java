package application;

public class Calculator {
	static String currentValue = "0";
	static String secondValue = "";
	static int charLimit = 10;
	static char operator = ' ';

	public static void recieveInput(char value) {
		if (Character.isDigit(value)) {
			if (currentValue.equals("0")) {
				currentValue = Character.toString(value);
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
				secondValue = currentValue;
				currentValue = Double.toString(result);
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
