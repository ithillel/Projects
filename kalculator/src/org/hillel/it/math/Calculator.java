package org.hillel.it.math;

import java.util.Scanner;

//���������� ��� ���� �����
public class Calculator {
	private double number1;
	private double number2;

	public double getNumber1() {
		return number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public void setNumber1(double number1) {

		this.number1 = number1;
	}


	// ����� ��������
	public double add() {
		//System.out.println("������� �������� ");
		//print("������� �������� ");

		//System.out.println("����� ����� :" + (getNumber1() + getNumber2()));
		return number1 + number2;

	}

	// ����� ���������
	public void subtract() {
		System.out.println("������� ��������� ");
		// inputNumbers();
		System.out.println("�������� ����� :" + (getNumber1() - getNumber2()));
	}

	// ����� ���������
	public void multiply() {
		System.out.println("������� ��������� ");
		// inputNumbers();

		System.out.println("��������� ����o :" + (getNumber1() * getNumber2()));
	}

	// ����� �������
	public void divide() {

		System.out.println("������� ������� ");
		// inputNumbers();
		if (getNumber2() !=  0)
			System.out.println("������� ����o :"
					+ (getNumber1() / getNumber2()));
		else {
			System.out.println("�� ���� ������ ������!!! ���������� ��� ���:");
			//inputNumbers();
		}
	

	// ����� ������ �������

	}


}
