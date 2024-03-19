public class VariablesTheme {
    public static void main(String[] args) {
 
        System.out.println("\n1. Вывод характеристики компьютера");
        byte motherBoard = 120;
        int numberOfCores = 4;
        double processorFrecuency = 3.2;
        boolean isProcessorNew = false;
        float memoryComputer = 8.5f;
        long bodyLengthComputer = 500l;
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
        int pricePenBook = pricePen + priceBook;
        int sumDiscount = (int) ((pricePen + priceBook)*0.11);
        int pricePenBookWithDiscount = pricePenBook - sumDiscount ;
        System.out.println("цена ручки и книги: " + pricePenBook);
        System.out.println("сумма скидки на ручку и книгу: " + sumDiscount);
        System.out.println("стоимость ручки и книги,со скидкой: " + pricePenBookWithDiscount);

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("     J   a  v     v   a" );
        System.out.println("     J  a a  v   v   a a");
        System.out.println("  J  J aaaaa  V V   aaaaa");
        System.out.println("   JJ a     a  V   a     a");
        
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte by = Byte.MAX_VALUE;
        System.out.println(by++);
        System.out.println(by--);
        short s = Short.MAX_VALUE;
        System.out.println(s++);
        System.out.println(s--);
        int i = Integer.MAX_VALUE;
        System.out.println(i++);
        System.out.println(i--);
        long l = Long.MAX_VALUE;
        System.out.println(l++);
        System.out.println(l--);
        
        System.out.println("\n5. Перестановка значений переменных");
        int a,b;
        a = 2;
        b = 5;
        System.out.println("Исходные значения пременных " + a + " и " + b);
        System.out.println();
        System.out.println("С помощью третьей переменной: ");
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Новые значения переменных " + a + " и " + b);

        System.out.println();
        System.out.println("C помощью арифметических операций: ");
        a = 2;
        b = 5;
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения переменных " + a + " и " + b);

        System.out.println();
        System.out.println("C помощью побитовых операций: ");
        a = 2;
        b = 5;
        a ^= b;
        b ^= b;
        a ^= b;
        System.out.println("Новые значения переменных " + a + " и " + b);
        
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println(dollar);
        System.out.println((int) dollar);
        char asterisk = '*';
        System.out.println(asterisk);
        System.out.println((int) asterisk);
        char at = '@';
        System.out.println(at);
        System.out.println((int) at);
        char pipe = '|';
        System.out.println(pipe);
        System.out.println((int) pipe);
        char tilde = '~';
        System.out.println(tilde);
        System.out.println((int) tilde);
        
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char c1 = '/';
        char c2 = '\\';
        char c3 = '_';
        char c4 = '(';
        char c5 = ')';
        System.out.print("    " + c1);
        System.out.println(c2);
        System.out.print("   " + c1);
        System.out.println("  " + c2);
        System.out.print("  " + c1);
        System.out.print(c3);
        System.out.print(c4);
        System.out.print(c5);
        System.out.println(" " + c2);
        System.out.print(" " + c1 +"      ");
        System.out.println(c2);
        System.out.print("" + c1);
        System.out.print(c3);
        System.out.print(c3);
        System.out.print(c3);
        System.out.print(c3);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c3);
        System.out.print(c2);
        System.out.println();
        System.out.println("8. Вывод количетва сотен,десятков и единиц числа");
        int n = 123;
        int one = (n/1)%10;
        int tens = (n/10)%10;
        int hundred = (n/100)%10;
        int sum1 = one + tens + hundred;
        int dec1 = one * tens * hundred;

        // Число N содержит:
        System.out.println("сотен " + hundred );
        System.out.println("десятков " + tens );
        System.out.println("единиц " + one );
        System.out.println("Сумма его цифр "+ sum1 );
        System.out.println("произведение " + dec1 );
        
        System.out.println("\n9. Вывод времени");
        int totalSec = 86399;
        int hours = totalSec / 3600;
        int minutes = (totalSec % 3600) / 60;
        int seconds = totalSec % 60;

        System.out.print(hours + ":");
        System.out.print(minutes + ":");
        System.out.print(seconds);
    } 
}





