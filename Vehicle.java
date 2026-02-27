public class Vehicle {

    String type;

    Vehicle() {
        type = "General Vehicle";
    }

    Vehicle(String type) {
        this.type = type;
    }

    void startEngine() {
        System.out.println("Vehicle engine started");
    }

    public static void main(String[] args) {

        Vehicle v1 = new Car("Petrol Car");
        Vehicle v2 = new Bike("Sports Bike");

        v1.startEngine();
        v2.startEngine();
    }
}

class Car extends Vehicle {

    Car(String type) {
        super(type);
    }

    void startEngine() {
        System.out.println("Car engine started");
    }
}

class Bike extends Vehicle {

    Bike(String type) {
        super(type);
    }

    void startEngine() {
        System.out.println("Bike engine started");
    }
}