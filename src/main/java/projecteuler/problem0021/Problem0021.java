package projecteuler.problem0021;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which
 * divide evenly into n).  If d(a) = b and d(b) = a, where a ≠ b, then a and b are an
 * amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and
 * 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142;
 * so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 */
public class Problem0021 {
    
    public static void main(String[] args) {
        
        final int TOP_LIMIT = 10000;
        int[] divisorTotals = new int[TOP_LIMIT + 1];
        int totalSum = 0;
        
        //store divisor totals in array
        for (int i = 1; i <= TOP_LIMIT; i++) {
            //1 is divisible by every number, don't need to check
            int sum = 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    int other = i / j;
                    if (j ==  other) {
                        other = 0;
                    }
                    sum += other;
                    sum += j;
                }
            }
            divisorTotals[i] = sum;
        }
        
        //find all amicable numbers, keep a sum
        for (int k = 1; k <= TOP_LIMIT; k++) {
            if (divisorTotals[k] <= TOP_LIMIT) {
                int temp = divisorTotals[k];
                if (divisorTotals[temp] == k && k != temp) {
                    totalSum += k;
                }
            }
        }
        System.out.println("Sum is " + totalSum);
    }
}
