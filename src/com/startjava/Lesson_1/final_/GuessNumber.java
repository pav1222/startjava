package com.startjava.Lesson_1.final_;

public class GuessNumber {
    public static void main(String[] args) {
        int secretNumber = 55;
        int guessNumber = 56;

        if (guessNumber < 0 || guessNumber >= 100) {
            System.out.println("Вы вышли из полуинтервала от 0 до 100");
            return;
        } else {
            while (guessNumber != secretNumber) {
                if (guessNumber > secretNumber) {
                    guessNumber--;
                    System.out.println("Число " + guessNumber + " больше того, что загадал компьютер ");
                } else {
                    guessNumber++;
                    System.out.println("Число " + guessNumber + " меньше того, что загадал компьютер ");
                }
            }
            System.out.println("Вы угадали число");
        }
    }
}