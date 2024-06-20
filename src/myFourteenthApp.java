// myFourteenthApp.java

// Abstract Class: Vehicle
abstract class Vehicle {
    String registrationNumber;
    String vinNumber;
    String color;
    double price;
    double fuelConsumption;
    double fuelLevel;
    double mileage;

    public Vehicle(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    abstract void drive(double distance);

    void refuel(double fuelAmount) {
        this.fuelLevel += fuelAmount;
    }
}

// FuelType Interface
interface FuelType {
    String getFuelType();
}

// Implementations of the FuelType interface for different types of engines
class Diesel implements FuelType {
    public String getFuelType() {
        return "Diesel";
    }
}

class Gasoline implements FuelType {
    public String getFuelType() {
        return "Gasoline";
    }
}

class Electric implements FuelType {
    public String getFuelType() {
        return "Electric";
    }
}

// Vehicle Subclasses

// PassengerCar
class PassengerCar extends Vehicle implements FuelType {
    int numberOfDoors;
    FuelType fuelType;

    public PassengerCar(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, int numberOfDoors, FuelType fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType.getFuelType();
    }

    @Override
    void drive(double distance) {
        double requiredFuel = distance * fuelConsumption / 100;
        if (fuelLevel >= requiredFuel) {
            mileage += distance;
            fuelLevel -= requiredFuel;
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }
}

// Truck
class Truck extends Vehicle implements FuelType {
    double loadCapacity;
    FuelType fuelType;

    public Truck(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, double loadCapacity, FuelType fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType.getFuelType();
    }

    @Override
    void drive(double distance) {
        double requiredFuel = distance * fuelConsumption / 100;
        if (fuelLevel >= requiredFuel) {
            mileage += distance;
            fuelLevel -= requiredFuel;
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }
}

// Motorcycle
class Motorcycle extends Vehicle implements FuelType {
    boolean hasSidecar;
    FuelType fuelType;

    public Motorcycle(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, boolean hasSidecar, FuelType fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType.getFuelType();
    }

    @Override
    void drive(double distance) {
        double requiredFuel = distance * fuelConsumption / 100;
        if (fuelLevel >= requiredFuel) {
            mileage += distance;
            fuelLevel -= requiredFuel;
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }
}

// ConstructionEquipment
class ConstructionEquipment extends Vehicle implements FuelType {
    double hoursWorked;
    FuelType fuelType;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double fuelLevel, double mileage, double hoursWorked, FuelType fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType.getFuelType();
    }

    @Override
    void drive(double hours) {
        double requiredFuel = hours * fuelConsumption;
        if (fuelLevel >= requiredFuel) {
            hoursWorked += hours;
            fuelLevel -= requiredFuel;
        } else {
            System.out.println("Not enough fuel to work for the hours.");
        }
    }
}

// Testing: myFourteenthApp
public class myFourteenthApp {
    public static void main(String[] args) {
        FuelType diesel = new Diesel();
        FuelType gasoline = new Gasoline();
        FuelType electric = new Electric();

        PassengerCar car1 = new PassengerCar("ABC123", "1HGCM82633A004352", "Red", 30000, 8, 50, 10000, 4, gasoline);
        Truck truck1 = new Truck("XYZ789", "1HTMKADN43H561510", "Blue", 60000, 15, 100, 50000, 2000, diesel);
        Motorcycle bike1 = new Motorcycle("BIKE123", "2HGCM82633A004352", "Black", 15000, 5, 20, 8000, true, gasoline);
        ConstructionEquipment equipment1 = new ConstructionEquipment("EQP456", "3HTMKADN43H561510", "Yellow", 80000, 10, 200, 10000, 500, diesel);

        // Test driving
        car1.drive(100);
        truck1.drive(200);
        bike1.drive(50);
        equipment1.drive(8);

        // Test refueling
        car1.refuel(20);
        truck1.refuel(50);
        bike1.refuel(10);
        equipment1.refuel(100);

        // Print status
        System.out.println("Car mileage: " + car1.mileage + " km, Fuel Level: " + car1.fuelLevel + " liters, Fuel Type: " + car1.getFuelType());
        System.out.println("Truck mileage: " + truck1.mileage + " km, Fuel Level: " + truck1.fuelLevel + " liters, Fuel Type: " + truck1.getFuelType());
        System.out.println("Bike mileage: " + bike1.mileage + " km, Fuel Level: " + bike1.fuelLevel + " liters, Fuel Type: " + bike1.getFuelType());
        System.out.println("Equipment hours worked: " + equipment1.hoursWorked + " hours, Fuel Level: " + equipment1.fuelLevel + " liters, Fuel Type: " + equipment1.getFuelType());
    }
}
