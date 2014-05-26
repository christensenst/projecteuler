package projecteuler.problem0004;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the
 * product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem0004 {
    
    public static void main(String[] args) {
        // reverse string  new StringBuilder(hi).reverse().toString()
        int highest = 0;
        for (int i = 900; i < 1000; i++) {
            for (int j = 900; j < 1000; j++) {
                Integer product = i * j;
                String forwards = product.toString();
                String backwards = new StringBuilder(forwards).reverse().toString();
                if (forwards.equals(backwards) && Integer.parseInt(forwards) > highest) {
                    highest = product;
                }
            }
        }
        System.out.println(highest);
    }
}
