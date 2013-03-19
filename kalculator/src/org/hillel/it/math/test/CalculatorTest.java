package org.hillel.it.math.test;

import org.hillel.it.math.Calculator;

public class CalculatorTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//kal.start();
		calc.setNumber1(10);
		calc.setNumber2(20);
		double res = calc.add();
		if(res !=30) {
			//Error
		}
		// TODO Auto-generated method stub

	}

}
