import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        String ssn, mNumber, menuChoice;

        // Using getRegExString method from SafeInput.java to get SSN
        ssn = SafeInput.getRegExString(in, "Enter your SSN (format: ###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");

        // Using getRegExString method from SafeInput.java to get student M number
        mNumber = SafeInput.getRegExString(in, "Enter your Student M number (format: M#####)", "^(M|m)\\d{5}$");

        // Results
        System.out.println("\nYour SSN is: " + ssn);
        System.out.println("Your Student M number is: " + mNumber);

        // Using getRegExString method from SafeInput.java for menu options
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (0, S, V, Q)", "^[OoSsVvQq]$");

        // Uppercase for easier processing in switch statement
        menuChoice = menuChoice.toUpperCase();

        // Switch statement for menu choice
        switch (menuChoice) {
            case "0":
                System.out.println("You selected Open.");
                break;
            case "S":
                System.out.println("You selected Save.");
                break;
            case "V":
                System.out.println("You selected View.");
                break;
            case "Q":
                System.out.println("You selected Quit.");
                break;
        }
    }
}