package projecteuler.Problem0015;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the
 * right and down, there are exactly 6 routes to the bottom right corner. How many
 * such routes are there through a 20×20 grid?
 */
public class Problem0015 {
    
    public static void main(String[] args) 
    {
        final int NUM = 20;
        long[][] data = new long[NUM+1][NUM+1];
        //populate last column and last row with 1s
        for (int i = 0; i <= NUM; i++)
        {
            data[NUM][i] = 1;
            data[i][NUM] = 1;
        }
        //iterate through each row except the last row
        for (int j = 0; j < NUM; j++)
        {
            //iterate through each element in the row except the last element
            for (int k = 0; k < NUM; k++)
            {
                //add the possibilities from the right and below to get the total
                //possibilities for that element
                data[(NUM-1)-j][(NUM-1)-k] = data[(NUM-1)-j][NUM-k] + data[NUM-j][(NUM-1)-k];
            }
        }
        System.out.println(data[0][0]);
    }
}
