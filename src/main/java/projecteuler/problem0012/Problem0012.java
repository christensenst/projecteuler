package projecteuler.problem0012;

/**
 *
 */
public class Problem0012 {
    
    public static void main(String[] args) {
        int triangleNumber = 1;
        int count = 1;
        while (true) {
            count += 1;
            triangleNumber += count;
            //find factors
            int countFactors = 0;
            for (int i = 1; i <= triangleNumber/2; i++) {
                if (triangleNumber % i == 0) {
                    countFactors++;
                }
            }
            if (countFactors >= 500) {
                break;
            }
        }
        System.out.println(triangleNumber);
    }
}
