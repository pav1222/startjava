package com.startjava.Lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        int minNum = -10;
        int maxNum = 21;
        System.out.print("В отрезке [" + minNum + ", " + maxNum + "] ");
        do {
            if (minNum % 2 == 0) {
                sumEven += minNum;
            } else {
                sumOdd += minNum;
            }
            minNum++;
        } while (minNum <= maxNum);
        System.out.println("сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = b;

        if (a < b) {
            max = b;
            min = a;
        }
        if (c < min) {
            min = c;
        } else if (c > max) {
            max = c;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int originNum = 1234;
        int sum = 0;
        while (originNum > 0) {
            int dight = originNum % 10;
            originNum /= 10;
            sum += dight;
            System.out.print(dight);
        }
        System.out.println();
        System.out.println(sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        for (int i = 1; i < 24; i += 10) {
            System.out.printf("%2d", i);
            for (int j = i + 2; j < i + 10; j += 2) {
                System.out.printf("%3d", j < 24 ? j : 0);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        originNum = 3242592;
        int originNumCopy = originNum;
        int numTwos = 0;
        while (originNum > 0) {
            if (originNum % 10 == 2) {
                numTwos++;
            }
            originNum /= 10;
        }
        if (numTwos % 2 == 0) {
            System.out.println("В " + originNumCopy + " четное количество двоек - " + numTwos);
        } else {
            System.out.println("В " + originNumCopy + " нечетное количество двоек - " + numTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int size = 5;
        int wight = 1;
        while (size >= 1) {
            while (wight <= size) {
                System.out.print("#");
                wight++;
            }
            System.out.println();
            wight = 1;
            size--;
        }
        System.out.println();

        int height = 3;
        int totalNumberOfLine = 2 * height - 1;
        int lineCounter = 1;
        int increment = 1;
        int lineWight = 1;
        do {
            int counterCurrentLine = 0;

            do {
                System.out.print("$");
            } while (++counterCurrentLine < lineWight);
            System.out.println();

            if (lineCounter == height) increment = -1;
            lineWight += increment;
        } while (++lineCounter <= totalNumberOfLine);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%1$4s  %2$10s  %3$10s  %n", "DECIMAL", "CHARACTER", "DECRIPTION");
        for (int i = 15; i < 124; i += 2) {
            System.out.printf("%1$4d  %2$9c          %3$-10s  %n", i, (char) i, Character.getName(i));
            if (i == 47) {
                i = 96;
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        originNum = 1234321;
        int reverseNum = 0;
        originNumCopy = originNum;
        while (originNum > 0) {
            int digit = originNum % 10;
            reverseNum = (reverseNum * 10) + digit;
            originNum /= 10;
        }

        if (originNumCopy == reverseNum) {
            System.out.println("Число " + originNumCopy + " является палиндромом.");
        } else {
            System.out.println("Число " + originNumCopy + " не является палиндромом.");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNum = 123402;
        int rightHalf = luckyNum % 1000;
        int leftHalf = luckyNum / 1000;
        int rightHalfCopy = rightHalf;
        int leftHalfCopy = leftHalf;
        int sumRight = 0;
        int sumLeft = 0;
        while (leftHalf > 0) {
            sumRight += rightHalf % 10;
            rightHalf /= 10;
            sumLeft += leftHalf % 10;
            leftHalf /= 10;
        }
        if (sumRight == sumLeft) {
            System.out.println("Число " + luckyNum + " является счастливым");
        } else {
            System.out.println("Число " + luckyNum + " не является счастливым");
        }
        System.out.println("Сумма цифр " + rightHalfCopy + " = " + sumRight +
                " , а сумма " + leftHalfCopy + " = " + sumLeft);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.printf(" 1 |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.printf("\n --|-----------------------\n");
        for (int i = 1; i < 10; i++) {
            for (i = 2; i < 10; ++i) {
                System.out.printf("%2d |", i);
                for (int j = 2; j < 10; ++j) {
                    System.out.printf("%2d ", i * j);
                }
                System.out.println();
            }
        }
    }
}