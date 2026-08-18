/*ABSTRACT CLASS:
An Abstract class can have both abstract and concrete methods.
An abstract class can be referenced to an object but it can't be instantiated to an object.*/
abstract class Car {
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music...");
    }
    
}

class Brezza extends Car{
    public void drive(){
        System.out.println("Driving Brezza.....");
    }
}

public class Abstract {
    public static void main(String[] args){
        Car obj = new Brezza();
        obj.playMusic();
        obj.drive();
    } 
    
}
