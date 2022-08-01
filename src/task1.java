import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                        // считывает вводимые данные
        System.out.println("Please write input String and press Enter:");
        String str = sc.nextLine();                         // nextLine()автоматически перемещает сканер вниз после возврата к текущей строке.
        System.out.printf("%.2s%n", str.toLowerCase());    // выводит 2 символа + переабразует в маленький регистр
        sc.close();                                                                 // закрыл Scanner методом close()

    }



}


