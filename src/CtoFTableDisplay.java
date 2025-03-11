public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Variable declaration
        int celsius;
        double fahrenheit;

        // Conversion Table
        System.out.println("-----------------------");
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("-----------------------");

        // Loop from -100 to 100 in 1-degree increments
        for (celsius = -100; celsius <= 100; celsius++) {
            fahrenheit = CtoF(celsius);

            // Results
            System.out.printf("%5d\t\t%8.2f\n", celsius, fahrenheit);
        }
    }

    // Static method that takes Celsius value and returns equivalent Fahrenheit
    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}