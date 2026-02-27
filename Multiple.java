interface Father{
    void money();
}

interface Mother{
    void love();
}

class Child implements Father,Mother{

    public void money(){
        System.out.println("Father gives money:");
    }

    public void love(){
        System.out.println("mother gives love:");
    }
}

public class Multiple{
    public static void main(String[] args){

        Child c=new Child();
        c.money();
        c.love();
    }
}