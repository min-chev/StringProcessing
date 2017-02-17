import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentsResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<String> out = new TreeSet<>();


        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));
            }
            String[] input = scanner.nextLine().split(" - ");

            String name = input[0];

            String[] scores = input[1].split(", ");


            Double score1 = Double.parseDouble(scores[0]);
            Double score2 = Double.parseDouble(scores[1]);
            Double score3 = Double.parseDouble(scores[2]);
            Double avg = (score1 + score2 + score3) / 3;



           out.add(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", name, score1, score2, score3, avg).replace('.', ','));

        }

        for (String s : out) {
            System.out.println(s);
        }


    }
}
