public class VariableNamesTheme{
    public static void main(String[] args) {
 

        //1 задание
        byte motherBoard = 120;
        int numberOfCores = 4;
        double procFrecuency = 3.2;
        System.out.println("Модель материнской платы " +motherBoard);
        System.out.println("Количество ядер " + numberOfCores);
        System.out.println("частота процессора "+ procFrecuency);


        //2 задание
        int pricePenAndBook = 300;
        int sumDiscount = 33;
        int pricePenAndBookWithDiscount = 267;
        System.out.println("цена ручки и книги " +pricePenAndBook);
        System.out.println("сумма скидки на ручку и книгу "+sumDiscount);
        System.out.println("стоимость ручки и книги,со скидкой "+pricePenAndBookWithDiscount);



        //3 задание
        System.out.println("     J"+"   "+"a"+"  "+"v"+"     "+"v"+"  "+" a" );
        System.out.println("     J"+"  "+"a"+" "+"a"+" "+" v"+"  "+" v"+"  "+" a"+" "+"a");
        System.out.println("  J "+""+" J"+" "+"aaaaa"+" "+" V"+" "+"V "+"  "+"aaaaa");
        System.out.println("   JJ"+""+" a    " + " a" + "  V" + "   a"  +   "     a");


        //4 задание
        byte by = Byte.MAX_VALUE;
        System.out.println(by);
        by++;
        System.out.println(by);
        by--;
        System.out.println(by);
        short s = Short.MAX_VALUE;
        System.out.println(s);
        s++;
        System.out.println(s);
        s--;
        System.out.println(s);
        int i = Integer.MAX_VALUE;
        System.out.println(i);
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);
        long l = Long.MAX_VALUE;
        System.out.println(l);
        l++;
        System.out.println(l);
        l--;
        System.out.println(l);



        //5 задание
        // с помощью 3 переменной
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println(a);
        System.out.println(b);

        // с помощью арифметических операций;
        int a1 = 2;
        int b1 = 5;
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println(a1);
        System.out.println(b1);

        // c помощью побитовых операций;
        int a2 = 2;
        int b2 = 5;
        a2 = a2 ^ b2;
        b2 = a2 ^ b2;
        a2 = a2 ^ b2;
        System.out.println(a2);
        System.out.println(b2);

    
        //6 задание
        char ch1 = '$';
        System.out.println(ch1);
        System.out.println((int)ch1);
        char ch2 = '*';
        System.out.println(ch2);
        System.out.println((int)ch2);
        char ch3 = '@';
        System.out.println(ch3);
        System.out.println((int)ch3);
        char ch4 = '|';
        System.out.println(ch4);
        System.out.println((int)ch4);
        char ch5 = '~';
        System.out.println(ch5);
        System.out.println((int)ch5);


        //7 задание
        char c1 = '/';
        char c2 = '\\';
        char c3 = '_';
        char c4 = '(';
        char c5 = ')';
        System.out.print("    "+c1);
        System.out.println(c2);
        System.out.print("   "+c1);
        System.out.println("  "+c2);
        System.out.print("  "+c1);
        System.out.print(c3);
        System.out.print(c4);
        System.out.print(c5);
        System.out.println(" "+c2);
        System.out.print(" "+c1+"      ");
        System.out.println(c2);
        System.out.print(""+c1);
        System.out.print(c3);
        System.out.print(c3);
        System.out.print(c3);
        System.out.print(c3);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c3);
        System.out.print(c2);

        //8 задание
        int n = 123;
        int one = (n/1)%10;
        int tens = (n/10)%10;
        int hundred = (n/100)%10;
        int sum1 = one + tens + hundred;
        int dec1 = one * tens * hundred;

        // Число N содержит:
        System.out.println("сотен "+hundred );
        System.out.println("десятков "+tens );
        System.out.println("единиц "+one );
        System.out.println("Сумма его цифр "+sum1 );
        System.out.println("произведение "+dec1 );


        //9 задание
        int totalSec = 86399;
        int hours = totalSec / 3600;
        int minutes = (totalSec % 3600) / 60;
        int seconds = totalSec % 60;

        System.out.print(hours+":");
        System.out.print(minutes+":");
        System.out.print(seconds);
    } 

}





