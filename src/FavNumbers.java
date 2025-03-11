import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        int favInt;
        double favDouble;

        // Using getInt method from SafeInput.java to get favorite integer
        favInt = SafeInput.getInt(in, "Enter your favorite integer");

        // Using getDouble method from SafeInput.java to get favorite double
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        // Results
        System.out.println("\nYour favorite integer is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);
    }
}