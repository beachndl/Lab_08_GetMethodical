import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        double totalCost = 0;
        double itemPrice;
        boolean moreItems = true;

        // Using a while loop for multiple items
        while (moreItems) {
            // Using getRangedDouble method from SafeInput.java to get price of the item ($0.50 - $10.00)
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);

            // Add the item to the total cost
            totalCost += itemPrice;

            // Ask if the user has more items
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to add?");
        }

        // Results
        System.out.printf("\nTotal cost: $%.2f\n", totalCost);
    }
}
