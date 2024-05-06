package com.startjava.Lesson_1.base.IfElseStatementTheme;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        String sex = "man";
        if (sex == "man") {
            System.out.println("женщина");
        } else {
            System.out.println("мужчина");
        }
        int age = 20;
        if (age > 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("несовершеннолетний");
        }
        double height = 1.7;
        if (height < 1.8) {
            System.out.println("высокий");
        } else {
            System.out.println("низкий");
        }
        char firstLetterName = "Pavel".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("first letter M");
        } else if (firstLetterName == 'I') {
            System.out.println("first letter I");
        } else {
            System.out.println("Another first letter");
        }

        System.out.println("\n2. Поиск большего числа");
        int oneNum = 2;
        int twoNum = 5;
        if (oneNum > twoNum) {
            System.out.println(oneNum + " больше " + twoNum);
        } else if (twoNum > oneNum) {
            System.out.println(twoNum + " больше " + oneNum);
        } else {
            System.out.println(twoNum + " равно " + oneNum);
        }

        System.out.println("\n3. Проверка числа");
        int num = -1;
        if (num == 0) {
            System.out.print("number = 0 ");
        } else {
            if (num > 0) {
                System.out.print(num + " положительное, ");
            } else {
                System.out.print(num + " отрицательное, ");
            }
            if (num % 2 == 0) {
                System.out.print("четное ");
            } else {
                System.out.print("нечетное ");
            }
        }
        
        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n\n");
        int a = 123;
        int b = 223;
        int aOnes = a % 10;
        int aTens = (a / 10) % 10;
        int aHundreds = (a / 100) % 10;

        int bOnes = b % 10;
        int bTens = (b / 10) % 10;
        int bHundreds = (b / 100) % 10;

        System.out.println("Исходные числа: " + a + " и " + b);
        if (aOnes != bOnes && aTens != bTens && aHundreds != bHundreds) {
            System.out.println("Нет совпадающих цифр, все разряды разные");
        } else {
            if (aHundreds == bHundreds) {
                System.out.println("Цифры совпадают в разряде 1 , совпавшие цифры: " +
                        aHundreds + " и " + bHundreds);
            }
            if (aTens == bTens) {
                System.out.println("Цифры совпадают в разряде 2 , совпавшие цифры: " +
                        aTens + " и " + bTens);
            }
            if (aOnes == bOnes) {
                System.out.println("Цифры совпадают в разряде 3 , совпавшие цифры: " +
                        aOnes + " и " + bOnes);
            }
        }
        
        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " - маленькая буква");
        } else if (symbol >= 'W' && symbol <= 'Z') {
            System.out.println(symbol + " - большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " - цифра");
        } else {
            System.out.println(symbol + " - не буква и не цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int depositSum = 301000;
        double rate = 0.05;

        if (depositSum >= 100000 && depositSum <= 300000) {
            rate = 0.07;
        } else if (depositSum > 300000) {
            rate = 0.1;
        } 
        double sumOfRate = depositSum * rate;
        double sumWithRate = depositSum + sumOfRate;
        System.out.println("Сумма вклада: " + depositSum);
        System.out.println("Сумма начисленного процента: " + sumOfRate);
        System.out.println("Итоговая сумма: " + sumWithRate);
        
        System.out.println("\n\n7. Определение оценки по предмету");
        int historyGrade = 2;
        int historyPercentage = 59;
        if (historyPercentage > 60 && historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage > 73 && historyPercentage < 91) {
            historyGrade = 4;
        } else if (historyPercentage > 91) {
            historyGrade = 5;
        }
        int csPercentage = 92;
        int csGrade = 2;
        if (csPercentage > 60 && csPercentage <= 73) {
            csGrade = 3;
        } else if (csPercentage > 73 && csPercentage <= 91) {
            csGrade = 4;
        } else if (csPercentage > 91) {
            csGrade = 5;
        }
        double gpa = ((double) historyGrade + csGrade) / 2;
        double avgPercentage = ((double) historyPercentage + csPercentage) / 2;
        System.out.println("Оценка по истории: " + historyGrade);
        System.out.println("Оценка по программированию: " + csGrade);
        System.out.println("Cредний процент по предметам: " + avgPercentage);
        System.out.println("Средний балл оценок по предмету: " + gpa);

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlySale = 13000;
        int rentOfRoomInMonth = 5000;
        int costOfProduction = 9000;
        int yearOfProfit = (monthlySale - rentOfRoomInMonth - costOfProduction) * 12;

        if (yearOfProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + yearOfProfit);
        } else {
            System.out.println("Прибыль за год: " + yearOfProfit);
        }
    }
}