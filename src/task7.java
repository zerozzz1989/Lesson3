public class task7 {
    public static void main(String[] args) {
        String people = "Den; John; Will; Kate; Adam; Robin"; //строка с данными

        String[] peopleArray = people.split("; ");      //масив, разделение после знака, Метод split()принимает шаблон и делит его на упорядоченный список подстрок путем поиска шаблона, помещает эти подстроки в массив и возвращает массив.
        for (String human : peopleArray) {                    //цикл повторяет масив
            System.out.println(human);                        //вывод
        }
    /*
    Вывод:
    Den, John, Will, Kate, Adam, Robin
     */
    }
}
