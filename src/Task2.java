public class Task2 {
    public static void main(String[] args) {
        String a = "h1";
        String b = "/";
        String words = "Java Tutorials";
        System.out.println("<"+a+">"+words+"<"+b+a+">");

        String c = "p";
        String d = "/";
        String word = "Welcome to Java World";
        System.out.println("<"+c+">"+word+"<"+d+c+">");




    }
}

/*
The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
Given a tag and a word string, create the HTML string with tags around the word, e.g. "<i>Hello</i>".
For example:
tag=h1, words=Java Tutorials -> <h1>Java Tutorials</h1>
Task: word = Welcome to Java World, tag=p

Інтернет створено за допомогою рядків HTML, як-от «<i>Hello</i>», який малює Hello курсивом. У цьому прикладі тег «i» створює <i> та </i>, які оточують слово «Hello».
Маючи тег і рядок слова, створіть рядок HTML із тегами навколо слова, наприклад. "<i>Привіт</i>".
For example:
tag=h1, words=Java Tutorials -> <h1>Java Tutorials</h1>

Task: word = Welcome to Java World, tag=p

 */