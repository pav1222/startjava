package com.startjava.Lesson_1.base.VariablesTheme;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристики компьютера");
        byte motherBoard = 120;
        int numberOfCores = 4;
        double processorFrecuency = 3.2;
        boolean isProcessorNew = false;
        float memoryComputer = 8.5f;
        long bodyLengthComputer = 500L;
        short bootTimeComputer = 2;
        char currencyPurchaseComputer = '$';
        System.out.println("Модель материнской платы " + motherBoard);
        System.out.println("Количество ядер " + numberOfCores);
        System.out.println("Частота процессора " + processorFrecuency);
        System.out.println("Процессор новый ? " + isProcessorNew);
        System.out.println("Объем памяти компьютера " + memoryComputer);
        System.out.println("Длина корпуса компьютера " + bodyLengthComputer);
        System.out.println("Время загрузки компьютера " + bootTimeComputer);
        System.out.println("За какую валюту куплен компьютер " + currencyPurchaseComputer);
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int priceGoods = pricePen + priceBook;
        int sumDiscount = (int) ((pricePen + priceBook) * 0.11);
        int discountPrice = priceGoods - sumDiscount;
        System.out.println("цена ручки и книги: " + priceGoods);
        System.out.println("сумма скидки на ручку и книгу: " + sumDiscount);
        System.out.println("стоимость ручки и книги,со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("     J   a  v     v   a");
        System.out.println("     J  a a  v   v   a a");
        System.out.println("  J  J aaaaa  V V   aaaaa");
        System.out.println("   JJ a     a  V   a     a");
        
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte by = Byte.MAX_VALUE;
        System.out.println(by + "," + ++by + "," + --by);
        short s = Short.MAX_VALUE;
        System.out.println(s + "," + ++s + "," + --s);
        int i = Integer.MAX_VALUE;
        System.out.println(i + "," + ++i + "," + --i);
        long l = Long.MAX_VALUE;
        System.out.println(l + "," + ++l + "," + --l);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения пeременных " + a + " и " + b);
        
        System.out.println("\n С помощью третьей переменной: ");
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Новые значения переменных " + a + " и " + b);

        System.out.println("\n C помощью арифметических операций: ");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения переменных " + a + " и " + b);

        System.out.println("\n C помощью побитовых операций: ");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения переменных " + a + " и " + b);
        
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char at = '@';
        char pipe = '|';
        char tilde = '~';
        System.out.println("Cимвол: " + dollar + ", Соответствующий ему код: " + (int) dollar);
        System.out.println("Cимвол: " + asterisk + ", Соответствующий ему код: " + (int) asterisk);
        System.out.println("Cимвол: " + at + ", Соответствующий ему код: " + (int) at);
        System.out.println("Cимвол: " + pipe + ", Соответствующий ему код: " + (int) pipe);
        System.out.println("Cимвол: " + tilde + ", Соответствующий ему код: " + (int) tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " +
                rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash);
    
        System.out.println("\n\n8. Вывод количеcтва сотен, десятков и единиц числа");
        int n = 123;
        int ones = n % 10;
        int tens = (n / 10) % 10;
        int hundreds = (n / 100) % 10;
        int sum = ones + tens + hundreds;
        int product = ones * tens * hundreds;
        // Число N содержит:
        System.out.println("сотен " + hundreds);
        System.out.println("десятков " + tens);
        System.out.println("единиц " + ones);
        System.out.println("Сумма его цифр " + sum);
        System.out.println("произведение " + product);
        System.out.println();

        System.out.println("\n9. Вывод времени");
        int totalSec = 86399;
        int hh = totalSec / 3600;
        int mm = (totalSec % 3600) / 60;
        int ss = totalSec % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    } 
}





