package projecteuler.problem0014;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains
 * 10 terms. Although it has not been proved yet (Collatz Problem), it is thought
 * that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem0014 {
    
    public static void main(String[] args) {
        int highestCount = 0;
        int highestStarting = 5000000;
        for (int i = 500000; i < 1000000; i++) {
            long current = i;
            int count = 1;
            while (true) {
                //if current is even
                if (current % 2 == 0) {
                    current /= 2;
                    count++;
                }
                if (current == 1) {
                    break;
                }

                //if current is odd
                if (current % 2 != 0) {
                    current = current * 3 + 1;
                    count++;
                }
                if (current == 1) {
                    break;
                }
            }
            if (count > highestCount) {
                highestCount = count;
                highestStarting = i;
            }
        }
        System.out.println(highestStarting);
    }
}
