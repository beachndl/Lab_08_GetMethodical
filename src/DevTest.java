import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        // Scanner
        Scanner in = new Scanner(System.in);

        // Testing Part A: getNonZeroLenString
        String test1 = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + test1);

        // Testing Part B: getInt
        int test2 = SafeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + test2);

        // Testing Part C: getDouble
        double test3 = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered: " + test3);

        // Testing Part D: getRangedInt
        int test4 = SafeInput.getRangedInt(in, "Enter a number between 1 and 10", 1, 10);
        System.out.println("You entered: " + test4);

        // Testing Part E: getRangedDouble
        double test5 = SafeInput.getRangedDouble(in, "Enter a double between 1.0 and 8.0", 1.0, 8.0);
        System.out.println("You entered: " + test5);

        // Testing Part F: getYNConfirm
        boolean test6 = SafeInput.getYNConfirm(in, "Do you want to continue");
        System.out.println("You entered: " + test6);

        // Testing Part G: getRegExString
        String test7 = SafeInput.getRegExString(in, "Enter your 5-digit zip code (format: #####)", "\\d{5}");
        System.out.println("You entered: " + test7);
    }
}