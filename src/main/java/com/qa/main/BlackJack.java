package com.qa.main;

public class BlackJack {

	public static int play(int number1, int number2) {
		if (number1 > 21 && number2 > 21) {
			return 0;
		} else if (number2 > 21) {
			return number1;
		} else if (number1 > 21) {
			return number2;
		} else if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}

	}

}
