import java.io.IOException;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        int totalsum = 0;

        int minlen = Math.min(strings[0].length(), strings[1].length());

        for (int i = 0; i < minlen; i++) {
                totalsum += strings[0].charAt(i) * strings[1].charAt(i);
        }

        if(strings[0].length()!=strings[1].length()){
            if(strings[0].length()>strings[1].length()){
                for (int i = minlen; i < strings[0].length() ; i++) {
                    totalsum+=strings[0].charAt(i);
                }
            }else{
                for (int i = minlen; i < strings[1].length() ; i++) {
                    totalsum+=strings[1].charAt(i);
                }
            }
        }

        System.out.println(totalsum);

    }
}
