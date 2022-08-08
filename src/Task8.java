/OK
public class Task8 {
    public static void main(String[] args) {
        String testString = "1234 5678 9012 3456";
        String text = testString;
        String newStr  = text.replaceAll("(.{14})", "**** **** ****");      //змінюємо все до 14 символу

        System.out.println(newStr);
    }
}

/*
Теж чітерство?)
 */

/*
Given credit card's number 1234 5678 9012 3456. Print card's number in the next view **** **** **** 3456
 */