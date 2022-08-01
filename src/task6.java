public class task6 {
    public static void main(String[] args) {

        String[] words = {"hop", "hello"};
        char q;
        for (int i = 0; i < words.length; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                q = words[i].charAt(0);
                if (q == j) {
                    System.out.println(j + ": " + words[i] + " - " + (i + 1));
                }
            }
        }
    }
}
