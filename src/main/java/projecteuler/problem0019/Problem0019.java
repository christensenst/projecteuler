package projecteuler.problem0019;

/**
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 */
public class Problem0019 {
    
    public static void main(String[] args)
    {
        //1 is Monday ... 7 is Sunday
        int currentFirstDay = 1; //Jan 1, 1900
        int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        //get to Jan 1, 1901
        for (int i = 0; i < 12; i++)
        {
            int daysToAdd = months[i] % 7;
            currentFirstDay += daysToAdd;
            if (currentFirstDay > 7)
            {
                currentFirstDay -= 7;
            }
        }
        //iterate through each year
        int totalSundaysOnFirst = 0;
        for (int y = 1901; y <= 2000; y++)
        {
            //determine if it's a leap year
            if (isLeapYear(y))
            {
                months[1] = 29;
            } else
            {
                months[1] = 28;
            }
            //iterate through each month
            for (int i = 0; i < 12; i++)
            {
                int daysToAdd = months[i] % 7;
                currentFirstDay += daysToAdd;
                if (currentFirstDay > 7)
                {
                    currentFirstDay -= 7;
                }
                if (currentFirstDay == 7)
                {
                    totalSundaysOnFirst++;
                }
            }
        }
        System.out.println(totalSundaysOnFirst);
    }

    private static boolean isLeapYear(int year)
    {
        if (year % 4 == 0)
        {
            if (year % 100 == 0 && year % 400 != 0)
            {
                return false;
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }
}
