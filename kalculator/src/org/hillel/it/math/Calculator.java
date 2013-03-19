package org.hillel.it.math;

import java.util.Scanner;

//Калкулятор для двух чисел
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


	// метод сложения
	public double add() {
		//System.out.println("Функция сложения ");
		//print("Функция сложения ");

		//System.out.println("Сумма равна :" + (getNumber1() + getNumber2()));
		return number1 + number2;

	}

	// метод вычитания
	public void subtract() {
		System.out.println("Функция вычитания ");
		// inputNumbers();
		System.out.println("Разность равна :" + (getNumber1() - getNumber2()));
	}

	// метод умножения
	public void multiply() {
		System.out.println("Функция умножения ");
		// inputNumbers();

		System.out.println("Множество равнo :" + (getNumber1() * getNumber2()));
	}

	// метод деления
	public void divide() {

		System.out.println("Функция деления ");
		// inputNumbers();
		if (getNumber2() !=  0)
			System.out.println("Частное равнo :"
					+ (getNumber1() / getNumber2()));
		else {
			System.out.println("На ноль делить нельзя!!! Попробуйте еще раз:");
			//inputNumbers();
		}
	

	// метод выбора функции

	}


}
