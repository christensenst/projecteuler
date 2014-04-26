package projecteuler.problem0018;

/**
 * Find the maximum total from top to bottom of the triangle below:
 *
 *               75
 *              95 64
 *             17 47 82
 *            18 35 87 10
 *           20 04 82 47 65
 *          19 01 23 75 03 34
 *         88 02 77 73 07 63 67
 *        99 65 04 28 06 16 70 92
 *       41 41 26 56 83 40 80 70 33
 *      41 48 72 33 47 32 37 16 94 29
 *     53 71 44 65 25 43 91 52 97 51 14
 *    70 11 33 28 77 73 17 78 39 68 17 57
 *   91 71 52 38 17 14 91 43 58 50 27 29 48
 *  63 66 04 68 89 53 67 30 73 16 69 87 40 31
 * 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 */
public class Problem0018 {
    
    public static void main(String[] args) 
    {
        //build the data structure as an array
        int[][] data = {
            {75},
            {95, 64},
            {17, 47, 82},
            {18, 35, 87, 10},
            {20, 4, 82, 47, 65},
            {19, 1, 23, 75, 3, 34},
            {88, 2, 77, 73, 7, 63, 67},
            {99, 65, 4, 28, 6, 16, 70, 92},
            {41, 41, 26, 56, 83, 40, 80, 70, 33},
            {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
            {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
            {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
            {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
            {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
            {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}
        };
        final int size = 15;
        int highest = 0;
        //brute force
        for (int i = 0; i < Math.pow(2,size-1); i++)
        {
            //create an array of booleans to determine which rows should be incremented
            boolean[] bits = new boolean[size];
            for (int j = size - 1; j >= 0; j--)
            {
                bits[j] = (i & (1 << j)) != 0;
            }
            //track stats
            int count = 0;
            int total = 0;
            //iterate through the rows, incrementing to the right based on the bits array
            for (int k = 0; k < size; k++)
            {
                if (bits[(size - 1) - k])
                {
                    count++;
                }
                total += data[k][count];
            }
            if (total > highest)
            {
                highest = total;
            }
        }
        System.out.println("highest: " + highest);
    }
}
