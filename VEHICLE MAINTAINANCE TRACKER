import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();

        System.out.print("Enter last service date (in days ago): ");
        int days = sc.nextInt();

        System.out.print("Enter current mileage: ");
        int mileage = sc.nextInt();

        try {
            v.checkMaintenance(days, mileage);
            System.out.println("Vehicle is in good condition.");
        } catch (ServiceOverdueException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Vehicle {
    void checkMaintenance(int daysSinceService, int mileage) throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) {
            throw new InvalidMileageException("Invalid mileage reading entered.");
        }
        if (daysSinceService > 180) {
            throw new ServiceOverdueException("Service overdue! Please visit the service center.");
        }
        System.out.println("No issues found in maintenance check.");
    }
}

class ServiceOverdueException extends Exception {
    ServiceOverdueException(String msg) {
        super(msg);
    }
}

class InvalidMileageException extends Exception {
    InvalidMileageException(String msg) {
        super(msg);
    }
}
