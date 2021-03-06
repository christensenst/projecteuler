package projecteuler.problem0002;

/**
 * Problem: Each new term in the Fibonacci sequence is generated by adding the previous two 
 * terms. By starting with 1 and 2, the first 10 terms will be:
 *     1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four 
 * million, find the sum of the even-valued terms.
 */

public class Problem0002 {

    public static void main(String[] args) {
        double first = 1;
        double second = 2;
        double nextNumber = first + second;
        double sum = 2;
        while (nextNumber < 4000000) {
            nextNumber = first + second;
            if (nextNumber % 2 == 0) {
                sum += nextNumber;
            }
            first = second;
            second = nextNumber;
        }
        System.out.println(sum);
    }
}
