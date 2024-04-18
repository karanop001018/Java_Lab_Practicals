//Q. Create a class Vehicle, which has single variable NoOfWheels.
//        Develop two subclasses, TwoWheeler and FourWheeler. Develop
//        subclasses of these 2 subclasses. Create instances of these classes
//        and print appropriate details. (use super keyword).

package Lab_Practicals;
class Vehicle {
    private int noOfWheels;

    public Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }
}

class TwoWheeler extends Vehicle {
    private String type;

    public TwoWheeler(int noOfWheels, String type) {
        super(noOfWheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class FourWheeler extends Vehicle {
    private String fuelType;

    public FourWheeler(int noOfWheels, String fuelType) {
        super(noOfWheels);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}

public class practical_26 {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler(2, "Motorcycle");
        FourWheeler car = new FourWheeler(4, "Petrol");

        System.out.println("Two-Wheeler Details:");
        System.out.println("Type: " + bike.getType());
        System.out.println("No. of Wheels: " + bike.getNoOfWheels());

        System.out.println("\nFour-Wheeler Details:");
        System.out.println("Fuel Type: " + car.getFuelType());
        System.out.println("No. of Wheels: " + car.getNoOfWheels());
    }
}
