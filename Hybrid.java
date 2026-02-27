class Animal{
    Animal(){
        System.out.println("animals eats");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("dog barks");
    }
}

class Puppy extends Dog{
    Puppy(){
        System.out.println("puppy weeps");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("Cat meows");
    }
}

public class Hybrid{
    public static void main(String[] args){
        new Puppy();
        new Cat();
    }
}