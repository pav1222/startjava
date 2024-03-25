public class IfElseStatementTheme{
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
        int num1 = 2;
        int num2 = 5;
        if (num1 > num2) {
            System.out.println(num1 + " больше " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " больше " + num1);
        } else {
            System.out.println(num2 + " равно " + num1);
        }

        System.out.println("\n3. Проверка числа");
        int number = 3;
        if (number != 0) {
            if (number >= 1) {
            System.out.print(number + " положительное, ");
        } else {
            System.out.print(number + " отрицательное, ");
        }
        if (number % 2 == 0) {
            System.out.print("четное ");
        } else {
            System.out.print("нечетное ");
        }
        } else {
            System.out.print("number = 0 ");
        }
        System.out.println();

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int a = 123;
        int b = 223;
        int ones1 = a % 10 ;
        int tens1 = (a / 10) % 10;
        int hundreds1 = (a / 100) % 10;

        int ones2 = b % 10;
        int tens2 = (b / 10) % 10;
        int hundreds2 = (b / 100) % 10;
        System.out.println("Исходные числа: " + a + " и " + b);
        if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println("Нет совпадающих цифр, все разряды разные");
        } else {
        if (ones1 == ones2) {
            System.out.println("Цифры совпадают в разряде " + "3" + " , совпавшие цифры: " + ones1 + " и " + ones2);
        }
        if (tens1 == tens2) {
            System.out.println("Цифры совпадают в разряде " + "2" + " , совпавшие цифры: " + tens1 + " и " + tens2);
        }
        if (hundreds1 == hundreds2) {
            System.out.println("Цифры совпадают в разряде " + "1" + " , совпавшие цифры: "
        + hundreds1 + " и " + hundreds2);
        }}
         
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

        System.out.println("\n7. Определение оценки по предмету");
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

        System.out.println("\n8. Расчет годовой прибыли");
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