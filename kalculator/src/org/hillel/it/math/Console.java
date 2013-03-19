package org.hillel.it.math;

import java.util.Scanner;

public class Console implements Runnable {
	private static final int CHOICE_ADD = 1;
	private static final int CHOICE_SUBTRACT = 2;
	private static final int CHOICE_MULTIPLY = 3;
	private static final int CHOICE_DIVIDE = 4;
	private static final int CHOICE_EXIT = 5;
	
	private static final Calculator CALCULATOR = new Calculator();

	// ����� ���������� ���������� � ��������� ������
	private String keyboard(String message) {
		System.out.print(message + ": ");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}

	// ����� ��������� ���� �����
	public void inputNumbers() {
		CALCULATOR.setNumber1(Double.valueOf(keyboard("������� ������ �����")));
		CALCULATOR.setNumber2(Double.valueOf(keyboard("������� ������ �����")));
	}
	
	protected void print(String text) {
		System.out.println("Calculator:" + text);
	}
	
	@Override
	public void run() {
		int n = 0;
		while (n != 5) {
			System.out.println("----------------------------------");
			System.out.println("��������� �����������");

			n = Integer
					.valueOf(keyboard("������� ����� : +(��������)  2(���������)  3(���������)  4(�������) 5 (exit) "));

			if (n == 5) {
				break;
			}
			inputNumbers();
			
			double res = 0;
			switch (n) {
			case CHOICE_ADD:
				res = CALCULATOR.add();
				break;
			case CHOICE_SUBTRACT:
				CALCULATOR.subtract();
				break;
			case CHOICE_MULTIPLY:
				CALCULATOR.multiply();
				break;
			case CHOICE_DIVIDE:
				CALCULATOR.divide();
				break;
			default:
				System.out.println("Invalid argument");
			}
			print("Operation result: " + res);
		}
	}
	
	public static void main(String[] args) {
		Console console = new Console();
		console.run();
	}

}
