/*INNER CLASS:
An inner class is a class inside another class
These classes provide a better sense of encapsulation
We cannot instantiate an interface*/ 
class A{
    int age;
    public void show(){
        System.out.println("Showing....");
    }

    class B{
        public void config(){
            System.out.println("Config.....");
        }
    }
}
public class Inner {
    public static void main(String[] args){
        A obj = new A();
        obj.show();
        A.B obj2 = obj.new B();
        obj2.config();
    }
    
}
