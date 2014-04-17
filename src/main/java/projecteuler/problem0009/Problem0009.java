package projecteuler.problem0009;

/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem0009 {
    
    public static void main(String[] args) 
    {
        for (int i = 1; i<=998; i++)
        {
            for (int j = 1; j<=998; j++)
            {
                //int aSquared = Math.pow(i,2);
                //int b = Math.pow(j,2);
                double c = Math.sqrt(Math.pow(i,2) + Math.pow(j,2));
                if (i + j + c == 1000.0)
                {
                    System.out.println("a is " + i + ", b is " + j + ", c is " + c);
                    System.out.println("Product of abc is " + i*j*c);
                }
            }
        }
    }
    
}
