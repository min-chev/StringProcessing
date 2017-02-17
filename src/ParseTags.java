import java.util.Scanner;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        while (text.contains("<upcase>")){
            int indexOfUpcase = text.indexOf("<upcase>");
            int indexOfUpcaseClose = text.indexOf("</upcase>");

            String textSubstringed = text.substring(indexOfUpcase + "<upcase>".length(), indexOfUpcaseClose);
            text = text.replace("<upcase>" + textSubstringed + "</upcase>", textSubstringed.toUpperCase());
        }

        System.out.println(text);


    }
}
