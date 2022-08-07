//OK
public class Task8 {
    public static void main(String[] args) {
        String str = "1234 5678 9012 3456"; //строка с данными

        String replStr = str.replaceAll("[0-9]", "*");

            System.out.println(replStr);                        //вывод
        }


    }



//index

/*
Given credit card's number 1234 5678 9012 3456. Print card's number in the next view **** **** **** 3456
 */