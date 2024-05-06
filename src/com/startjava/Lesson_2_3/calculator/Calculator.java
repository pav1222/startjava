package com.startjava.Lesson_2_3.calculator;

public class Calculator {
    private int inputArg1;
    private int inputArg2;
    private char operation;

    public void setInputArg1(int inputArg1) {
        this.inputArg1 = inputArg1;
    }

    public void setInputArg2(int inputArg2) {
        this.inputArg2 = inputArg2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        int result = 0;
        switch (operation) {
            case '+':
                result = inputArg1 + inputArg2;
                break;
            case '-':
                result = inputArg1 - inputArg2;
                break;
            case '*':
                result = inputArg1 * inputArg2;
                break;
            case '/':
                result = inputArg1 / inputArg2;
                break;
            case '^':
                result = pow();
                break;
            case '%':
                result = inputArg1 % inputArg2;
                break;
            default:
                System.out.println("Введенная мат.операция не поддерживается");
                return;
        }
        System.out.println(inputArg1 + " " + operation + " " + inputArg2 + " = " + result);
    }
    
    private int pow() {
        int result = 1;
        for (int i = 0; i < inputArg2; i++) {
            result *= inputArg1;
        }
        return result;
    }
}