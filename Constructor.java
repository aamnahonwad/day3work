class Parent{
    Parent(){
        System.out.println("parent method");
    }
}

class Child extends Parent{
    Child(){
        super();
    }
}

public class Constructor{
    public static void main(String[] args){
        new Child();
    }
}