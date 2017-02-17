import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = reader.readLine().split("[ ,.?!]");

        Set<String> palidromes = new TreeSet<>();

        for (String s : str) {
            if (s.equals("")) {
                continue;
            }

            boolean isPal = false;
            if (s.length() == 1) {
                isPal = true;
            } else {
                if (s.length() % 2 == 0) {
                    StringBuilder onehalf = new StringBuilder(s.substring(0, s.length() / 2));
                    StringBuilder twohalf = new StringBuilder(s.substring(s.length() / 2)).reverse();
                    if (onehalf.toString().equals(twohalf.toString())) {
                        isPal = true;

                    }
                } else {
                    StringBuilder onehalf = new StringBuilder(s.substring(0, s.length() / 2));
                    StringBuilder twohalf = new StringBuilder(s.substring(s.length() / 2 + 1)).reverse();

                    if (onehalf.toString().equals(twohalf.toString())) {
                        isPal = true;
                    }
                }
            }
            if (isPal) {
                palidromes.add(s);
            }
        }

        System.out.println("[" + String.join(", ", palidromes) + "]");


    }
}
