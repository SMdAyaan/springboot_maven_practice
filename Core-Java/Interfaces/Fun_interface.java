/*FUNCTIONAL INTERFACES
A functional interface in Java is an interface with exactly one abstract method, designed to be implemented using lambda expressions or method references.

LAMBDA EXPRESSION
A lambda expression in Java is an anonymous function that provides a concise way to implement a functional interface, introduced in Java 8 to enable functional-style programming.
 */
@FunctionalInterface
interface A{ // Single Abstract Method
    void show();
}
public class Fun_interface {
    public static void main(String[] args){
        A obj = () -> System.out.println("Showing....");
        obj.show();
    }
    
}

