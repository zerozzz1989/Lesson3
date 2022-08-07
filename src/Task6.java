//OK

public class Task6 {
    public static void main(String[] args) {

        String a = "john_smith@example.com";
        String[] parts = a.split("@");              //розділяємо після @
        String part1 = parts[0];                            //перша частина
        String part2 = parts[1];                            //друга частина
        System.out.println("login = \""+ part1+ "\"");
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