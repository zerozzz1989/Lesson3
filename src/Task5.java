import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        // Обратите внимание на пробел в конце строки
        print("I love Java ".split(" ", 5));
        print("I love Java ".split(" ", 0));
        print("I love Java ".split(" ", 0));
        /*
         Вывод:
        [I, love, Java]
        [I, love, Java]
        [I, love, Java]
        Обратите внимание на отсутствие пустых строк в конце                       массивов
        */
    }

    static void print(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

/*
Given 2 strings, a and b. Create a string c of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

Дано 2 рядки, a і b. Створіть рядок c у формі короткий+довгий+короткий, з коротшим рядком зовні та довшим усередині.
 */