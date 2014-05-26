package projecteuler.problem0010;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */
public class Problem0010 {
    public static void main(String[] args) 
    {
        long sum = 2;
        for (int i = 2; i <=2000000; i++)
        {
            if (isPrime(i))
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
    private static boolean isPrime(int n)
    {
        if (n % 2 == 0)
        {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
}
