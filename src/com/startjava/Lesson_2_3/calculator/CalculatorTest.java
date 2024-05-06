package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String yesNo = "да";
        while (yesNo.equals("да")) {
            System.out.println("Введите первое число: ");
            int inputArg1 = scanner.nextInt();
            calculator.setInputArg1(inputArg1);

            System.out.println("Введите второе число: ");
            int inputArg2 = scanner.nextInt();
            calculator.setInputArg2(inputArg2);

            System.out.println("Выберите мат.выражение (+, -, *, /, %, ^ ): ");
            char operation = scanner.next().charAt(0);
            calculator.setOperation(operation);
            calculator.calculate();

            do {
                System.out.println("Желаете продолжить вычисления? Введите да/нет");
                yesNo = scanner.next();
            } while (!yesNo.equals("да") && !yesNo.equals("нет"));
        }
    }
}