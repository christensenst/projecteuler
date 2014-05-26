package projecteuler.problem0005;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from
 * 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 */
public class Problem0005 {
    
    public static void main(String[] args) {
        final int CEILING = 20;
        int n = CEILING;
        boolean found = false;
        boolean success = true;
        while (!found) {
            for (int i = 1; i <= CEILING; i++) {
                if (n % i != 0) {
                    success = false;
                    break;
                }
            }
            if (success) {
                found = true;
                break;
            }
            success = true;
            n += CEILING;
        }
        System.out.println(n);
    }
}
