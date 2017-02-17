import java.util.*;

public class SpecialWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        String[] text = scanner.nextLine().split(" ");

        Map<String, Integer> Map = new HashMap<>();
        for (String word : words) {
           Map.put(word, 0);
        }

        for (int i = 0; i < text.length; i++) {
            if (Map.containsKey(text[i])) {
                Map.put(text[i], Map.get(text[i]) + 1);
            }
        }

        for (String s : Map.keySet()) {
            System.out.println(s + " - " + Map.get(s));
        }


    }
}
