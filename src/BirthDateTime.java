import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        int year, month, day, maxDay, hour, min;
        boolean leapYear;

        // Using getRangedInt method from SafeInput.java to get birth year (1950-2015)
        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        // Using getRangedInt method from SafeInput.java to get birth month (1-12)
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        // Using a switch() structure to limit the maximum days of each month
        switch (month) {
            // Jan, Mar, May, Jul, Aug, Oct, Dec have 31 days
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDay = 31;
                break;
            // Feb
            // Checking for leap year using this program as reference since I was unsure how to do it:
            // https://www.geeksforgeeks.org/java-program-to-find-if-a-given-year-is-a-leap-year/
            case 2:
                leapYear = false;

                // If year is divisible by 4
                if (year % 4 == 0) {
                    leapYear = true;

                    // To identify whether it is a century year or not
                    if (year % 100 == 0) {
                        // Checking if year is divisible by 400
                        // therefore century leap year
                        if (year % 400 == 0)
                            leapYear = true;
                        else
                            leapYear = false;
                    }
                }
                // If year is not divisible by 4
                else {
                    leapYear = false;
                }

                maxDay = leapYear ? 29 : 28;
                break;
            // Default is 30 days
            default:
                maxDay = 30;
                break;
        }

        // Using getRangedInt method from SafeInput.java and maxDay to get birthday (1-maxDay)
        day = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDay);

        // Using getRangedInt method from SafeInput.java to get birth hour
        hour = SafeInput.getRangedInt(in, "Enter your birth hour (24-hour format)", 1, 24);

        // Using getRangedInt method from SafeInput.java to get birth minute (1-59)
        min = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        // Results
        System.out.println("\nYour birth date and time is:");
        System.out.printf("%04d-%02d-%02d %02d:%02d\n", year, month, day, hour, min);
    }
}