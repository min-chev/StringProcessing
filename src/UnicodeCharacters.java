import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inp = reader.readLine();

        String out = "";
        for (char c : inp.toCharArray()) {
            out += String.format("\\u%04x", (int) c);
        }

        System.out.println(out);

    }
}
