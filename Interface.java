//Interfaces

interface A {
    void show();
    void config();  
}

class B implements A{
    public void show(){
        System.out.println("Showing....");
    }
    public void config(){
        System.out.println("Configuring...");
    }
}

public class Interface{
    public static void main(String[] args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
    }
}
