import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine().toLowerCase();

        String chars = reader.readLine().toLowerCase();

        int counter = 0;

       while(str.contains(chars)){
           counter++;

           int index = str.indexOf(chars)+1;

           str = str.substring(index);
       }
        
        System.out.println(counter);
    }
}
