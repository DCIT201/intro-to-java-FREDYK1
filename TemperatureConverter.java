import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the temperature in Celsius: ");
            double celsiusTemperature = scanner.nextDouble();
            double fahrenheitTemperature = (celsiusTemperature * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheitTemperature);
        } else if (choice == 2) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            double fahrenheitTemperature = scanner.nextDouble();
            double celsiusTemperature = (fahrenheitTemperature - 32) * 5/9;
            System.out.println("The temperature in Celsius is: " + celsiusTemperature);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}