class Vehicle{
    Vehicle(){
        System.out.println("This is a Vehicle:");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("This is a car:");
    }
}

class Bus extends Vehicle{
    Bus(){
        System.out.println("This is a Bus:");
    }
}

class Hierarchical{
    public static void main(String[] args){
        new Car();
        new Bus();
    }
}