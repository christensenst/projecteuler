package projecteuler.problem0023;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A perfect number is a number for which the sum of its proper divisors is exactly
 * equal to the number. For example, the sum of the proper divisors of 28 would be
 * 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * 
 * A number n is called deficient if the sum of its proper divisors is less than n
 * and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number
 * that can be written as the sum of two abundant numbers is 24. By mathematical
 * analysis, it can be shown that all integers greater than 28123 can be written as
 * the sum of two abundant numbers. However, this upper limit cannot be reduced any
 * further by analysis even though it is known that the greatest number that cannot be
 * expressed as the sum of two abundant numbers is less than this limit.
 * 
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */
public class Problem0023 {
    
    public static void main(String[] args) {
        //find all abundant numbers: 12 - 28124
        List<Integer> abundantNumbers = new ArrayList();
        Set<Integer> sumOfTwoAbundantNumbers = new HashSet();
        for (int i = 12; i < 28124; i++) {
            List<Integer> divisors = new ArrayList();
            divisors.add(1);
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    divisors.add(j);
                    if (Math.sqrt(i) != j) {
                        divisors.add(i/j);
                    }
                }
            }
            //find sum of divisors
            int divisorSum = 0;
            for (int x : divisors) {
                divisorSum += x;
            }
            //determine if number is an abundant number. If so, add to list.
            if (divisorSum > i) {
                abundantNumbers.add(i);
            }
        }
        
        //find all numbers which are the sum of abundant numbers
        for (int y = 0; y < abundantNumbers.size(); y++) {
            for (int z = y; z < abundantNumbers.size(); z++) {
                sumOfTwoAbundantNumbers.add(abundantNumbers.get(y) + abundantNumbers.get(z));
            }
        }
        
        //the sum of all the integers which are not the sum of two abundant numbers
        int sum = 0;
        for (int a = 1; a < 28124; a++) {
            if (!sumOfTwoAbundantNumbers.contains(a)) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
