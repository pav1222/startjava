package com.startjava.Lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int guessNumber;
            System.out.println(player1.getName() + " введите число: ");
            guessNumber = scan.nextInt();
            int secretNumber = 1 + (int) (100 * Math.random());
            if (guessNumber < 0 || guessNumber >= 100) {
                System.out.println("Вы вышли из полуинтервала от 0 до 100");
                break;
            }
            if (guessNumber == secretNumber) {
                System.out.println(player1.getName() + " угадал число");
                break;
            }
            if (guessNumber > secretNumber) {
                System.out.println(player1.getName() + ", вы не угадали, число " + guessNumber +
                        " больше того, что загадал компьютер ");
            } else {
                System.out.println(player1.getName() + ", вы не угадали, число " + guessNumber +
                        " меньше того, что загадал компьютер ");
            }

            System.out.println(player2.getName() + " введите число: ");
            guessNumber = scan.nextInt();
            if (guessNumber < 0 || guessNumber >= 100) {
                System.out.println("Вы вышли из полуинтервала от 0 до 100");
                break;
            }
            if (guessNumber == secretNumber) {
                System.out.println(player2.getName() + " угадал число");
                break;
            }
            if (guessNumber > secretNumber) {
                System.out.println(player2.getName() + ", вы не угадали, число " + guessNumber +
                        " больше того, что загадал компьютер ");
            } else {
                System.out.println(player2.getName() + ", вы не угадали, число " + guessNumber +
                        " меньше того, что загадал компьютер ");
            }
        }
    }
}