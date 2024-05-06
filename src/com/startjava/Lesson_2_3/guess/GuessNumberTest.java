package com.startjava.Lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yesNo = "да";
        while (yesNo.equals("да")) {
            System.out.println("Введите имя первого участника: ");
            String name1 = scan.next();
            Player player1 = new Player(name1);

            System.out.println("Введите имя второго участника: ");
            String name2 = scan.next();
            Player player2 = new Player(name2);

            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Желаете продолжить игру? Введите да/нет");
                yesNo = scan.next();
            } while (!yesNo.equals("да") && !yesNo.equals("нет"));
        }
    }
}