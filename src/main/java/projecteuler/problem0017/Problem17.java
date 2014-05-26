package projecteuler.problem0017;

import java.util.Map;
import java.util.HashMap;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then
 * there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used? 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use
 * of "and" when writing out numbers is in compliance with British usage.
 */
public class Problem17 {
    
    public static void main(String[] args) {
        final int value = 1000;
        Map<Integer, String> firstDigit = new HashMap(10);
        firstDigit.put(0,"");
        firstDigit.put(1,"one");
        firstDigit.put(2,"two");
        firstDigit.put(3,"three");
        firstDigit.put(4,"four");
        firstDigit.put(5,"five");
        firstDigit.put(6,"six");
        firstDigit.put(7,"seven");
        firstDigit.put(8,"eight");
        firstDigit.put(9,"nine");
        
        Map<Integer, String> secondDigitTens = new HashMap(10);
        secondDigitTens.put(10,"ten");
        secondDigitTens.put(11,"eleven");
        secondDigitTens.put(12,"twelve");
        secondDigitTens.put(13,"thirteen");
        secondDigitTens.put(14,"fourteen");
        secondDigitTens.put(15,"fifteen");
        secondDigitTens.put(16,"sixteen");
        secondDigitTens.put(17,"seventeen");
        secondDigitTens.put(18,"eighteen");
        secondDigitTens.put(19,"nineteen");
        
        Map<Integer, String> secondDigitNonTens = new HashMap(10);
        secondDigitNonTens.put(0,"");
        secondDigitNonTens.put(2,"twenty");
        secondDigitNonTens.put(3,"thirty");
        secondDigitNonTens.put(4,"forty");
        secondDigitNonTens.put(5,"fifty");
        secondDigitNonTens.put(6,"sixty");
        secondDigitNonTens.put(7,"seventy");
        secondDigitNonTens.put(8,"eighty");
        secondDigitNonTens.put(9,"ninety");
        
        Map<Integer, String> thirdDigit = new HashMap(10);
        thirdDigit.put(1,"onehundredand");
        thirdDigit.put(2,"twohundredand");
        thirdDigit.put(3,"threehundredand");
        thirdDigit.put(4,"fourhundredand");
        thirdDigit.put(5,"fivehundredand");
        thirdDigit.put(6,"sixhundredand");
        thirdDigit.put(7,"sevenhundredand");
        thirdDigit.put(8,"eighthundredand");
        thirdDigit.put(9,"ninehundredand");
        
        String oneThousand = "onethousand";
        
        long count = 0;
        
        for (int i = 1; i <= value; i++) {
            String stringValue = Integer.toString(i);
            if (stringValue.length() == 4) {
                count += oneThousand.length();
            }
            if (stringValue.length() == 3) {
                String leftDigit = stringValue.substring(0,1);
                int intValue = Integer.parseInt(leftDigit);
                if (stringValue.substring(1).equals("00")) {
                    count += thirdDigit.get(intValue).replace("and","").length();
                } else {
                count += thirdDigit.get(intValue).length();
                }
                stringValue = stringValue.substring(1);
            }
            if (stringValue.length() == 2) {
                if (stringValue.substring(0,1).equals("1")) {
                    int intValue = Integer.parseInt(stringValue);
                    count += secondDigitTens.get(intValue).length();
                    stringValue = "";
                } else {
                String leftDigit = stringValue.substring(0,1);
                int intValue = Integer.parseInt(leftDigit);
                count += secondDigitNonTens.get(intValue).length();
                stringValue = stringValue.substring(1);
                }
            }
            if (stringValue.length() == 1) {
                int intValue = Integer.parseInt(stringValue);
                count += firstDigit.get(intValue).length();
            }
        }
        System.out.println(count);
    }
}
