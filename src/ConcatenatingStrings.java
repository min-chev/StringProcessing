import java.util.Scanner;

public class ConcatenatingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String out = "";

        for (int i = 0; i < n; i++) {
            out+=scanner.nextLine() + " ";
        }

        System.out.println(out);

    }
}
