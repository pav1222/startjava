package com.startjava.Lesson_1.final_;

public class Calculator {
    public static void main(String[] args) {
        // Введите операцию. + - * / ^ %
        char operation = '/';
        int a = 21;
        int b = 5;
        int result = 0;
        if (operation == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Нельзя делить на ноль");
                return;
            }
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '+') {
            result = a + b;
        } else if (operation == '^') {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        }  
        if (operation == '%') {
            if (b != 0) {
                result = a % b;
            } else {
                System.out.println("Нельзя делить на ноль");
                return;
            }
        }
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }
}