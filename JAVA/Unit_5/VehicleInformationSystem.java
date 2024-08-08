import java.util.Scanner;
import truck.Truck;
import car.Car;
import motorcycle.Motorcycle;
public class VehicleInformationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Information System!");

        System.out.println("Choose a vehicle type to create: 1. Car 2. Motorcycle 3. Truck");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.println("Creating a Car...");
                System.out.print("Enter make: ");
                String carMake = scanner.nextLine();
                System.out.print("Enter model: ");
                String carModel = scanner.nextLine();
                System.out.print("Enter year of manufacture: ");
                int carYear = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                Car car = new Car(carMake, carModel, carYear);

                System.out.print("Enter number of doors: ");
                car.setNumberOfDoors(scanner.nextInt());
                scanner.nextLine(); // Consume newline

                System.out.print("Enter fuel type (petrol, diesel, electric): ");
                car.setFuelType(scanner.nextLine());

                System.out.println("Car Details:");
                System.out.println("Make: " + car.getMake());
                System.out.println("Model: " + car.getModel());
                System.out.println("Year of Manufacture: " + car.getYearOfManufacture());
                System.out.println("Number of Doors: " + car.getNumberOfDoors());
                System.out.println("Fuel Type: " + car.getFuelType());
                break;

            case 2:
                System.out.println("Creating a Motorcycle...");
                System.out.print("Enter make: ");
                String motoMake = scanner.nextLine();
                System.out.print("Enter model: ");
                String motoModel = scanner.nextLine();
                System.out.print("Enter year of manufacture: ");
                int motoYear = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                Motorcycle motorcycle = new Motorcycle(motoMake, motoModel, motoYear);

                System.out.print("Enter number of wheels: ");
                motorcycle.setNumberOfWheels(scanner.nextInt());
                scanner.nextLine(); // Consume newline

                System.out.print("Enter motorcycle type (sport, cruiser, off-road): ");
                motorcycle.setMotorcycleType(scanner.nextLine());

                System.out.println("Motorcycle Details:");
                System.out.println("Make: " + motorcycle.getMake());
                System.out.println("Model: " + motorcycle.getModel());
                System.out.println("Year of Manufacture: " + motorcycle.getYearOfManufacture());
                System.out.println("Number of Wheels: " + motorcycle.getNumberOfWheels());
                System.out.println("Type: " + motorcycle.getMotorcycleType());
                break;

            case 3:
                System.out.println("Creating a Truck...");
                System.out.print("Enter make: ");
                String truckMake = scanner.nextLine();
                System.out.print("Enter model: ");
                String truckModel = scanner.nextLine();
                System.out.print("Enter year of manufacture: ");
                int truckYear = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                Truck truck = new Truck(truckMake, truckModel, truckYear);

                System.out.print("Enter cargo capacity (in tons): ");
                truck.setCargoCapacity(scanner.nextDouble());
                scanner.nextLine(); // Consume newline

                System.out.print("Enter transmission type (manual, automatic): ");
                truck.setTransmissionType(scanner.nextLine());

                System.out.println("Truck Details:");
                System.out.println("Make: " + truck.getMake());
                System.out.println("Model: " + truck.getModel());
                System.out.println("Year of Manufacture: " + truck.getYearOfManufacture());
                System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
                System.out.println("Transmission Type: " + truck.getTransmissionType());
                break;

            default:
                System.out.println("Invalid choice. Please restart the program.");
                break;
        }

        scanner.close();
    }
}
