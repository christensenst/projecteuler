package projecteuler.problem0022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Using names.txt, a 46K text file containing over five-thousand first names, begin by
 * sorting it into alphabetical order. Then working out the alphabetical value for each
 * name, multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth
 * 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a
 * score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 */
public class Problem0022 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //read data from file
        String inputFile = "C:\\Temp\\names.txt";
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String input = reader.readLine();
        
        //store data as a sorted array
        String[] data = input.split(",");
        Arrays.sort(data);
        
        // calculate totals for data
        long totalSum = 0;
        for (int i = 1; i <= data.length; i++) {
            String str = data[i-1].replace("\"", "").replace(" ", "");
            char[] letters = str.toCharArray();
            int sum = 0;
            for (char c:letters) {
                int num = (int)c;
                sum += num - 64;
            }
            int wordTotal = i * sum;
            totalSum += wordTotal;
        }
        System.out.println(totalSum);
    }
}
