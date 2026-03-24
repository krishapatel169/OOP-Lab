class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;
    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;
    Car(String vehicleNumber, String brand, String fuelType, int seats, boolean ac) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = seats;
        this.ACavailable = ac;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}
class ElectricCar extends Car {
    protected double batteryCapacity;
    protected double chargingTime;
    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int seats, boolean ac, double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, seats, ac);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}
public class Practical25 {
    	public static void main(String[] args) {
	System.out.println("KRISHA : 250393107009");
        Vehicle v1 = new Vehicle("GJ01AB1234", "Tata", "Petrol");
        System.out.println("----- Vehicle Details -----");
        v1.displayDetails();
        System.out.println();
        Car c1 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        System.out.println("----- Car Details -----");
        c1.displayDetails();
        System.out.println();
        ElectricCar e1 = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75, 8);
        System.out.println("----- Electric Car Details -----");
        e1.displayDetails();
        System.out.println();
        Vehicle v2 = new Car("GJ04GH3456", "Honda", "Petrol", 5, true);
        System.out.println("----- Upcasting Example -----");
        v2.displayDetails();
        System.out.println();
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;  
            System.out.println("Downcasting successful!");
            System.out.println("Accessing Car-specific data:");
            System.out.println("Seats: " + c2.numberOfSeats);
        }
        System.out.println();
        if (e1 instanceof ElectricCar) {
            System.out.println("e1 is an instance of ElectricCar");
        }
    }
}