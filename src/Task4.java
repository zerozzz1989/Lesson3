//OK
package com.journaldev.string;

    public class Task4 {

        public static void main(String[] args) {
            String str = "ABCDEFGHIJK";                                             //змінні

            String small = str.toLowerCase();                                // переводимо в нижній регістр

            String vowels =  small.replaceAll("[aeiouy]\\B", " ");                  //aeiouy наголосні анг.


            System.out.println("Java String to Upper Case: " + vowels);       // виводимо данні

        }



    }


/*
Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.

Дано рядок "ABCDEFGHIJK". Вам потрібно зробити цей рядок малим регістром і видалити всі голосні.

 */