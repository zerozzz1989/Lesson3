import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// считывает вводимые данные
       // Scanner myArray = sc;
        System.out.println("Please write input String and press Enter:");
       // int first = sc[1]; // выбор первого элемена масива
            String str = sc.nextLine();                         // nextLine()автоматически перемещает сканер вниз после возврата к текущей строке.

                System.out.printf("%.2s%n", str);    // выводит 2 символа
            //    if (new Scanner(System.in))
        {
            System.out.printf("Дважды два равно пяти");
        }

        sc.close();                                                                 // закрыл Scanner методом close()

            }

        }


/*
Given a string. Write a code that will create a new string made of the first two characters of the initial string.
If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

Дано рядок. Напишіть код, який створить новий рядок із перших двох символів початкового рядка.
Якщо рядок коротший за довжину 2, поверніть усе, що є, тому "X" дає "X", а порожній рядок "" дає порожній рядок ""

For example:
"AE_1381" -> "AE"
"A" -> "A"
"" -> ""
 */

