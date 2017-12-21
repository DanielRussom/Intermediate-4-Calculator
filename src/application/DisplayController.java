package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DisplayController {
	@FXML
	Label lblDisplay;

	private void updateDisplay(String currentValue) {
		lblDisplay.setText(currentValue);
	}

	@FXML
	private void btn0Press() {
		Calculator.recieveInput('0');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn1Press() {
		Calculator.recieveInput('1');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn2Press() {
		Calculator.recieveInput('2');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn3Press() {
		Calculator.recieveInput('3');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn4Press() {
		Calculator.recieveInput('4');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn5Press() {
		Calculator.recieveInput('5');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn6Press() {
		Calculator.recieveInput('6');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn7Press() {
		Calculator.recieveInput('7');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn8Press() {
		Calculator.recieveInput('8');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btn9Press() {
		Calculator.recieveInput('9');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btnDotPress() {
		Calculator.recieveInput('.');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btnPlusPress() {
		Calculator.recieveInput('+');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btnSubtractPress() {
		Calculator.recieveInput('-');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btnMultiplyPress() {
		Calculator.recieveInput('*');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btnDividePress() {
		Calculator.recieveInput('/');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btnEqualsPress() {
		Calculator.recieveInput('=');
		updateDisplay(Calculator.getCurrentValue());
	}

	@FXML
	private void btnCEPress() {
		Calculator.recieveInput('C');
		updateDisplay(Calculator.getCurrentValue());
	}
}