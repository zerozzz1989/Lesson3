//OK

public class Task6 {
    public static void main(String[] args) {

        String a = "john_smith@example.com";
        String[] parts = a.split("@");              //розділяємо після @
        String part1 = parts[0];                            //перша частина
        String part2 = parts[1];                            //друга частина

        String b = part1;
        String[] name = b.split("_");
        String part3 = name[0];
        String part4 = name[1];

        //System.out.println(part3.substring(0,1).toUpperCase()+part3.substring(1));   //ця абракадабра робе слово з великої

        System.out.println("login = \""+ part3.substring(0,1).toUpperCase()+part3.substring(1)+" "+ part4.substring(0,1).toUpperCase()+part4.substring(1)+ "\"");
        System.out.println("domain = \""+ part2+ "\"");

    }
}


/*
GGiven a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be substrings of full email address.
   The First Name and Last Name of the user should be in the following format: "Name Surname".
   Result should be:
   login = "John Smith"
   domain = "example.com"

Враховано електронну адресу користувача: john_smith@example.com. Створіть два рядки «login» і «domain», які будуть підрядками повної електронної адреси.
Ім'я та Прізвище користувача повинні бути в такому форматі: «Ім'я Прізвище».
  Result should be:
   login = "John Smith"
   domain = "example.com"
 */