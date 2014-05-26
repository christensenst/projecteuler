package projecteuler.problem0003;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143?
 */
public class Problem0003 {
    
    public static void main(String[] args) {
        long n = 600851475143L;
        boolean found = false;
        while (!found) {
            long p = smallestFactor(n);
            if (p < n) {
                n /= p;
            } else {
                System.out.println(Long.toString(n));
                found = true;
            }
        }
    }

    private static long smallestFactor(long n) {
        double d = n;
        for (long i = 2, end = (long) Math.sqrt(d); i <= end; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n; // Prime
    }
}
