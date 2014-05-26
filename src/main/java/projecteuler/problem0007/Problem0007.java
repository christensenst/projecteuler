package projecteuler.problem0007;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 */
public class Problem0007 {
    
    public static void main(String[] args) {
        final int COUNT_GOAL = 10001;
        int current = 2;
        int count = 1;
        boolean found = false;
        while (!found) {
            boolean isPrime = isPrime(current);
            if (isPrime) {
                count++;
            }
            if (count == COUNT_GOAL) {
                break;
            }
            current++;
        }
        System.out.println(current);
    }

    static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
