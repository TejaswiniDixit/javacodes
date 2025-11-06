import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureConverter t = new TemperatureConverter();

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        System.out.print("Enter unit (C/F): ");
        char unit = sc.next().toUpperCase().charAt(0);

        try {
            t.convert(temp, unit);
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}

class TemperatureConverter {
    void convert(double value, char unit) throws InvalidTemperatureException {
        if (unit == 'C') {
            if (value < -273.15) {
                throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
            }
            double f = (value * 9 / 5) + 32;
            System.out.println(value + "°C = " + f + "°F");
        } else if (unit == 'F') {
            if (value < -459.67) {
                throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
            }
            double c = (value - 32) * 5 / 9;
            System.out.println(value + "°F = " + c + "°C");
        } else {
            System.out.println("Invalid unit entered.");
        }
    }
}

class InvalidTemperatureException extends Exception {
    InvalidTemperatureException(String msg) {
        super(msg);
    }
}
