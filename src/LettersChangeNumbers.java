import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LettersChangeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = reader.readLine().split("\\s+");

        StringBuilder alphabet = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++)
            alphabet.append(i);


        double totalSum = 0;
        for (String word : strings) {
            String firstLetter = word.substring(0, 1);
            String lastLetter = word.substring(word.length() - 1);

            double number = Double.valueOf(word.substring(1, word.length() - 1));

            int positionFirstLetter = alphabet.indexOf(firstLetter.toUpperCase()) + 1;
            int positionLastLetter = alphabet.indexOf(lastLetter.toUpperCase()) + 1;

            double currentResult = 0;

            if (firstLetter.equals(firstLetter.toUpperCase()))
                currentResult = number / positionFirstLetter;
            else if (firstLetter.equals(firstLetter.toLowerCase()))
                currentResult = number * positionFirstLetter;

            if (lastLetter.equals(lastLetter.toUpperCase()))
                currentResult -= positionLastLetter;
            else if (lastLetter.equals(lastLetter.toLowerCase()))
                currentResult += positionLastLetter;

            totalSum += currentResult;
        }

        System.out.printf("%.2f", totalSum);

    }
}
