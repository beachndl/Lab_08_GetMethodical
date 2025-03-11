import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        String fullName;

        // Using getUserName method from SafeInput.java
        fullName = SafeInput.getUserName(in);

        // Results
        System.out.println("Your full name is: " + fullName);
    }
}
