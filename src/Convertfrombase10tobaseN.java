import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Convertfrombase10tobaseN {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = reader.readLine().split(" ");

        BigInteger baseN1 = BigInteger.valueOf(Long.valueOf(nums[0]));
        BigInteger base10 = BigInteger.valueOf(Long.valueOf(nums[1]));

        StringBuilder baseN = new StringBuilder();

        while(base10.compareTo(new BigInteger("0"))>0){
            BigInteger divide = base10.divideAndRemainder(new BigInteger(baseN1 + ""))[0];
            BigInteger reminder = base10.divideAndRemainder(new BigInteger(baseN1 + ""))[1];

            baseN.insert(0, reminder);
            base10 = divide;
        }
        System.out.println(baseN);

    }

}
