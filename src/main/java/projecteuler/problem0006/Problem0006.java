package projecteuler.problem0006;

/**
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */
public class Problem0006 {
    
    public static void main(String[] args) {
        final int CEILING = 100;
        long sumOfSquares = 0;
        long sumOfNum = 0;
        for (int i = 1; i <= CEILING; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        for (int i = 1; i <= CEILING; i++) {
            sumOfNum += i;
        }
        long squareOfSum = (long) Math.pow(sumOfNum, 2);
        System.out.println(squareOfSum - sumOfSquares);
    }
}
