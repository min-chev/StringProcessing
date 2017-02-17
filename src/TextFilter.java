import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] forbidden = reader.readLine().split(", ");

        String text = reader.readLine();

        for (String s : forbidden) {
            if(text.contains(s)) {
                text = text.replaceAll(s,  new String(new char[s.length()]).replace('\0', '*'));
            }
        }

        System.out.println(text);

    }
}
