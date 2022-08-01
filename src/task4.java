package com.journaldev.string;

import java.util.Scanner;

    public class task4 {

        public static void main(String[] args) {
            String str = "ABCDEFGHIJK";                                             //данные

            String strUpperCase = str.toLowerCase();                                // переобразование в нижний регистр

            System.out.println("Java String to Upper Case: " + strUpperCase);       // выводит данные в указанном регистре

            readUserInputAndPrintInUpperCase();                                     //
        }

        private static void readUserInputAndPrintInUpperCase() {                        //
            Scanner sc = new Scanner(System.in);                                        // считывает вводимые данные
            System.out.println("Please write input String and press Enter:");           // выводит записанный текст
            String str = sc.nextLine();                                                 // nextLine()автоматически перемещает сканер вниз после возврата к текущей строке.
            System.out.println("Input String in Upper Case = " + str.toLowerCase());    // выводит записанный текст + переабразует в маленький регистр
            sc.close();                                                                 // закрыл Scanner методом close()
        }

    }


