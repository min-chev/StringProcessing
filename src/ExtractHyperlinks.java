import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractHyperlinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (true) {
            if (line.equals("END")) {
                break;
            }
            sb.append(line);
            line = scanner.nextLine();
        }

        Pattern patternA = Pattern.compile("<a(.)*?>");

        Matcher matcher1 = patternA.matcher(sb);

        while (matcher1.find()) {
            sb2.append(matcher1.group());
        }

        Pattern patternHref = Pattern.compile("href\\s*=\\s*('|\"|.+?)(.*?)(\\1|>)");

        Matcher matcher2 = patternHref.matcher(sb2);

        while (matcher2.find()) {
            System.out.println(matcher2.group(2));
        }


    }
}
