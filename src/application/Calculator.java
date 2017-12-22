package application;

public class Calculator {
	static String currentValue = "0";
	static String secondValue = "";
	static boolean isDuringEquation = false;
	static boolean isEndOfEquation = false;
	static int charLimit = 10;
	static char operator = ' ';

	/**
	 * Handles receiving input
	 * 
	 * @param value
	 *            - Char pressed
	 */
	public static void recieveInput(char value) {
		// Checks if the value is a number
		if (Character.isDigit(value)) {
			// If at the end of a calculation, clears stored values
			if (isEndOfEquation) {
				currentValue = "0";
				secondValue = "";
				operator = ' ';
				isEndOfEquation = false;
			}
			// If midway through a calculation, stores the current value
			if (isDuringEquation) {
				isDuringEquation = false;
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
		// Switch based on passed in char
		switch (value) {
		case '.':
			// Only appends a decimal point if it isn't already in the number
			if (!currentValue.contains(".")) {
				currentValue = currentValue + value;
			}
			break;
		case '+':
			isEndOfEquation = false;
			// Checks if an equation is already being performed
			if (secondValue.length() > 0) {
				// Performs the current calculation
				handleEquation();
				isDuringEquation = true;
			} else {
				// Moves the location of the values
				secondValue = currentValue;
				currentValue = "0";
			}
			// Sets the operator
			operator = '+';
			break;
		case '-':
			isEndOfEquation = false;
			if (secondValue.length() > 0) {
				// Performs the subtraction calculation
				handleEquation();
				// Clears the second value
				isDuringEquation = true;
			} else {
				// Moves the location of the values
				secondValue = currentValue;
				currentValue = "0";
			}
			// Sets the operator
			operator = '-';
			break;
		case '*':
			isEndOfEquation = false;
			// Checks if an equation is already being performed
			if (secondValue.length() > 0) {
				// Performs the current calculation
				handleEquation();
				isDuringEquation = true;
			} else {
				// Moves the location of the values
				secondValue = currentValue;
				currentValue = "0";
			}
			// Sets the operator
			operator = '*';
			break;
		case '/':
			isEndOfEquation = false;
			// Checks if an equation is already being performed
			if (secondValue.length() > 0) {
				// Performs the current calculation
				handleEquation();
				isDuringEquation = true;
			} else {
				// Moves the location of the values
				secondValue = currentValue;
				currentValue = "0";
			}
			// Sets the operator
			operator = '/';
			break;
		case '=':
			if (secondValue.length() < 1) {
				break;
			}
			isEndOfEquation = true;
			handleEquation();
			break;
		// Clears all stored values
		case 'C':
			currentValue = "0";
			secondValue = "";
			operator = ' ';
			isDuringEquation = false;
			isEndOfEquation = false;
		}
	}

	public static void handleEquation() {
		// Handles addition equations
		if (operator == '+') {
			double result = performAddition(Double.parseDouble(currentValue), Double.parseDouble(secondValue));
			// Clears the second value
			secondValue = "";
			currentValue = Double.toString(result);
			// Handles subtraction equations
		} else if (operator == '-') {
			double result = performSubtraction(Double.parseDouble(secondValue), Double.parseDouble(currentValue));
			// Clears the second value
			secondValue = "";
			currentValue = Double.toString(result);
			// Handles multiplication equations
		} else if (operator == '*') {
			double result = performMultiplication(Double.parseDouble(currentValue), Double.parseDouble(secondValue));
			// Clears the second value
			secondValue = "";
			currentValue = Double.toString(result);
			// Handles division equations
		} else if (operator == '/') {
			double result = performDivision(Double.parseDouble(secondValue), Double.parseDouble(currentValue));
			// Clears the second value
			secondValue = "";
			currentValue = Double.toString(result);
		}
	}

	/**
	 * Handles addition equations
	 * 
	 * @param firstNumber
	 *            - First number to be added
	 * @param secondNumber
	 *            - Second number to be added
	 * @return result - Result of addition
	 */
	public static double performAddition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	/**
	 * Handles subtraction equations
	 * 
	 * @param firstNumber
	 *            - First number to be subtracted
	 * @param secondNumber
	 *            - Second number to be subtracted
	 * @return result - Result of subtraction
	 */
	public static double performSubtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	/**
	 * Handles multiplication equations
	 * 
	 * @param firstNumber
	 *            - First number to be multiplied
	 * @param secondNumber
	 *            - Second number to be multiplied
	 * @return result - Result of multiplication
	 */
	public static double performMultiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	/**
	 * Handles division equations
	 * 
	 * @param firstNumber
	 *            - First number to be divided
	 * @param secondNumber
	 *            - Second number to be divided
	 * @return result - Result of division
	 */
	public static double performDivision(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}

	public static String getCurrentValue() {
		return currentValue;
	}
}
