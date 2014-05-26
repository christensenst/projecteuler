package projecteuler.problem0016;

import java.math.BigInteger;

/**
 * What is the sum of the digits of the number 2 to the 1000th?
 */
public class Problem0016 {
    
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < 1000; i++) {
            result = result.multiply(new BigInteger("2"));
        }
        String Digits = String.valueOf(result);
        int sum = 0;
        for (int i = 0; i < Digits.length();i++) {
            int x = Integer.parseInt(Digits.substring(i,i+1));
            sum += x;
        }
        System.out.println(sum);
    }
}
