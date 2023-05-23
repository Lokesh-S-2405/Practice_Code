package PracticeCodes;

public class FactoryPattern {
    public static void main(String[] args) {
        Client client = new Client();
        Vehicle vehicle = client.getVehicle();
        vehicle.printVehicle();
    }
}
enum VehicleType {
    VT_TwoWheeler, VT_ThreeWheeler, VT_FourWheeler
}

// Library Class
abstract class Vehicle {

    abstract public void printVehicle();

    // Factory method to create objects of different types.
    // Change is required only in this function to create a new object type
    static Vehicle Create(VehicleType type){
        if (VehicleType.VT_TwoWheeler.compareTo(type) == 0){
            return new TwoWheeler();
        } else if (VehicleType.VT_ThreeWheeler.compareTo(type) == 0) {
            return new ThreeWheeler();
        } else if (VehicleType.VT_FourWheeler.compareTo(type) == 0) {
            return new FourWheeler();
        }
        return null;
    }
}

class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class ThreeWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am three wheeler");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

// Client class
class Client {

    // Client doesn't explicitly create objects
    // but passes type to factory method "Create()"
    Client() {
        VehicleType type = VehicleType.VT_ThreeWheeler;

        pVehicle = Vehicle.Create(type);

    }

    private final Vehicle pVehicle;

    Vehicle getVehicle() {
        return pVehicle;
    }
}

