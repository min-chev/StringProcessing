import java.util.Scanner;

public class ParseURLs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String address = scanner.nextLine();

        String[] checker = address.split("://");
        if(checker.length!=2){
            System.out.println("Invalid URL");
            return;
        }

        String protocol = checker[0];

        int index1 = checker[1].indexOf("/");

        String server = checker[1].substring(0, index1);

        String resources = checker[1].substring(index1+1);

        System.out.println("Protocol = " + protocol);
        System.out.println("Server = " + server);
        System.out.println("Resources = " + resources);

        

    }
}
