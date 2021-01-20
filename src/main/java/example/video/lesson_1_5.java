package example.video;

import java.util.Scanner;

public class lesson_1_5 {

    public static void main(String[] args) {

        System.out.println("Привет"); System.out.print("Привет бля!!!\n\n"); // \n переход на новую строчку

        byte num = 127; System.out.println(num); // -128 - 127
        short num_1 = 15674; System.out.println (num_1); // -32768 - 32767
        int num_2 = 999999999; System.out.println(num_2); // -2147483648 - 2147483647
        float num_3 = 232.4554f; System.out.println(num_3);
        double num_4 = 234.23423424234234d; System.out.println(num_4);
        boolean isTrue_1 = true; System.out.println(isTrue_1);
        boolean isTrue_2 = false; System.out.println(isTrue_2);
        char sym = 'X'; System.out.println(sym); // Вывод одного символа

        Scanner str = new Scanner(System.in); // Ввод данных пользователем
        //Scanner some_name = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.nextLine();
        System.out.println( "Вы ввели: " + phrase1);

        System.out.println("\nВведите целое число: ");
        System.out.println("Ваше число - " + str.nextInt()); // Сообщение и вывод данных введёных пользователм

        String strp = "\nНу всё давай, пока!"; System.out.println(strp);


    }

}
