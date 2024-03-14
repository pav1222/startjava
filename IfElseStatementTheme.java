public class IfElseStatementTheme{
	public static void main(String[] args) {

        // 1 задание
        String person = "man";
        if (person == "man") {
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

        // 2 задание
        int num1 = 2;
        int num2 = 5;
        if (num1 > num2) {
        System.out.println("num1 больше num2");
        } else if (num2 > num1) {
        System.out.println("num2 больше num1");
        } else {
        System.out.println("num2 равно num1");
        }

        // 3 задание
        int number = 3;
        if (number == 0) {
        System.out.print(number + " c равно 0, ");
        } else if (number > 0) {
        System.out.print(number + " положительное, ");
        } else if (number < 0) {
        System.out.print(number + " отрицательное, ");
        }
    
        if (number % 2 == 0) {
        System.out.print("четное ");
        } else {
        System.out.print("нечетное ");
        }

        // 4 задание
        int a = 727;
        int b = 138;
        int a1, a2, a3;
        int b1, b2, b3;
        String r1 = "№1";
        String r2 = "№2";
        String r3 = "№3";

        a1 = a / 100;
        a2 = ((a - (a1 * 100)) / 10);
        a3 = (a - (a1 * 100) - (a2 * 10));
        a3 = (a - (a1 * 100) - (a2 * 10));
        b1 = b / 100;
        b2 = ((b - (b1 * 100)) / 10);
        b3 = (b - (b1 * 100) - (b2 * 10));
        System.out.println("Исходные числа: " + a + " и " + b);

        if (a1 == b1) {
        System.out.println("Цифры совпадают в разряде " + r1 + ",совпавшие цифры:  " + a1 + " и " + b1);
        }
        if (a2 == b2) {
        System.out.println("Цифры совпадают в разряде " + r2 + ",совпавшие цифры: " + a2 + " и " + b2);
        }
        if (a3 == b3) {
        System.out.println("Цифры совпадают в разряде " + r3 + ",совпавшие цифры: " + a3 + " и " + b3);
        } else {
        System.out.println("Нет совпадающих цифр");
        }

        // 5 задание
        char ch = '\u0057';
        if (ch >= 97 & ch <= 122) {
        System.out.println("\u0057 - маленькая буква");
        } else if (ch >= 41 & ch <= 90) {
        System.out.println("\u0057 - большая буква");
        } else if (ch >= 30 & ch <= 39) {
        System.out.println("\u0057 - цифра");
        } else {
        System.out.println("\u0057 - не буква и не цифра");
        }

        // 6 задание
        int depositSum = 301000;
        double fivePercents = depositSum * 0.05;
        double sevenPercents = depositSum * 0.07;
        double tenPercents = depositSum * 0.1;
        String s1 = String.format("%.2f", fivePercents);
        String s2 = String.format("%.2f", sevenPercents);
        double depositWithFivePercents = depositSum + fivePercents;
        double depositWithSevenPercents = depositSum + sevenPercents;
        double depositWithTenPercents = depositSum + tenPercents;
        String s3 = String.format("%.2f", depositWithFivePercents);
        String s4 = String.format("%.2f", depositWithSevenPercents);
        System.out.println("Первоначальный вклад :" + depositSum);

        if (depositSum < 100000) {
        System.out.println("К вашему вкладу начислено 5 % годовых, итоговая сумма: " + s3);
        System.out.println("Cумма начисленного процента: " + s1);
        }
        if (depositSum >= 100000 & depositSum <= 300000) {
        System.out.println("К вашему вкладу начислено 7 % годовых, итоговая сумма: " + s4);
        System.out.println("Cумма начисленного процента: " + s2);
        } else {
        System.out.println("К вашему вкладу начислено 10 % годовых, итоговая сумма: " + depositWithTenPercents);
        System.out.println("Cумма начисленного процента: " + tenPercents);
        }

        // 7 задание
        int grade1 = 0;
        int grade2 = 0;

        double percentOfHistory = 0.59;
        if (percentOfHistory <= 0.60) {
        grade1 = 2;
        System.out.println("Оценка по истории: " + grade1);
        }
        if (percentOfHistory > 0.60) {
        grade1 = 3;
        System.out.println("Оценка по истории: " + grade1);
        }
        if (percentOfHistory > 0.73 & percentOfHistory < 0.91) {
        grade1 = 4;
        System.out.println("Оценка по истории: " + grade1);
        } else if (percentOfHistory > 0.91) {
        grade1 = 5;
        System.out.println("Оценка по истории: " + grade1);

        }

        double percentOfProgramming = 0.92;

        if (percentOfProgramming <= 0.60) {
        grade2 = 2;
        System.out.println("Оценка по программированию: " + grade2);
        }
        if (percentOfProgramming > 0.60 & percentOfProgramming < 0.73) {
        grade2 = 3;
        System.out.println("Оценка по программированию: " + grade2);
        }
        if (percentOfProgramming > 0.73 & percentOfProgramming < 0.91) {
        grade2 = 4;
        System.out.println("Оценка по программированию: " + grade2);
        } else {
        grade2 = 5;
        System.out.println("Оценка по программированию: " + grade2);
        }

        double averageGrade = (double)(grade1 + grade2) / 2;
        System.out.println("Средний балл оценок по предмету: " + averageGrade);

        double averagePercent = (percentOfHistory + percentOfProgramming) / 2;
        System.out.println("средний процент по предметам: " + averagePercent);

        // 8 задание
        int monthlySale = 13000;
        int rentOfRoomInMonth = 5000;
        int costOfProduction = 9000;
        int yearOfProfit = (monthlySale - rentOfRoomInMonth - costOfProduction) * 12;

        if (yearOfProfit > 0) {
        System.out.println("+" + yearOfProfit);
        } else {
        System.out.println(yearOfProfit);
        }
    }
}