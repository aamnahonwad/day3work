class Vehicle{
    Vehicle(){
        System.out.println("this is a vehicle");
    }
}

class FourWheeler extends Vehicle{
    FourWheeler(){
        System.out.println("4 wheel vehicle");
    }
}

class Car extends FourWheeler{
    Car(){
        System.out.println("this is a 4 wheeler vehicle which is car");
    }
}

public class Multiinherit{
    public static void main(String[] args){
        Car c=new Car();
    }
}