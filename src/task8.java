//Given credit card's number 1234 5678 9012 3456. Print card's number in the next view **** **** **** 3456

public class task8 {
    public static void main(String[] args) {
        String str = "1234 5678 9012 3456"; //строка с данными
       // String strRepl = str.slice(5,12).replace(/\d/g, 'x');
       // String strNew = str.slice(0, 5) + strRepl + str.slice(12);
       // String.log(strNew);

       // String replStr1 = str.substring(0, str.indexOf("_")); // Heddo wordd

        String replStr1 = str.replaceAll("[0-9]", "*"); // Heddo wordd

        //  String replStr2 = str.replace("Hello", "Bye"); // Bye world
       // String[] peopleArray = money.split(" ");      //масив, разделение после знака, Метод split()принимает шаблон и делит его на упорядоченный список подстрок путем поиска шаблона, помещает эти подстроки в массив и возвращает массив.

       // for (String human : peopleArray) {                    //цикл повторяет масив
            System.out.println(replStr1);                        //вывод
        }


    }



//   String str = "Hello world";
  //  String replStr1 = str.replace('l', 'd'); // Heddo wordd
    // String replStr2 = str.replace("Hello", "Bye"); // Bye world