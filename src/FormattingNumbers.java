import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormattingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = reader.readLine().split("\\s+");

        int a = Integer.parseInt(nums[0]);
        double b = Double.parseDouble(nums[1]);
        double c = Double.parseDouble(nums[2]);

        StringBuilder sb = new StringBuilder();

        String binaryStringA = Integer.toString(a, 2);

        while (binaryStringA.length() < 10) {
            binaryStringA = "0" + binaryStringA;
        }
        if (binaryStringA.length() > 10) {
            binaryStringA = binaryStringA.substring(0, 10);
        }
        sb.append(String.format("|%-10X", a));
        sb.append(String.format("|%s", binaryStringA));
        sb.append(String.format("|%10.2f", b));
        sb.append(String.format("|%-10.3f|", c));

        System.out.println(sb);

    }
}
