import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        if (str.length() > 20) {
            System.out.println(str.substring(0, 20));
            return;
        }

        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.append(new String(new char[20-str.length()]).replace("\0","*"));
        System.out.println(stringBuilder);
    }
}
