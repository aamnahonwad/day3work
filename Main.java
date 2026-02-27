interface Student{
    void study();
    void attendClass();
}

class Section implements Student{
    @Override
    public void study(){
        System.out.println("studying for exams");
    }

    @Override
    public void attendClass(){
        System.out.println("Attending the class");
    }
}

public class Main{
    public static void main(String[] args){
        Section sc=new Section();
        sc.study();
        sc.attendClass();
    }
}