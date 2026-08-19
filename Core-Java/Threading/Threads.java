/*THREADS
The moment you extend a normal class with Thread, then that class becomes a Thread
In every thread, you need to have a run() method
The range of each priority goes from 1(least) to 10(highest) 
Thread is a class inheriting from Runnable*/
class A extends Thread{
    public void run(){
        for (int i = 1; i < 10; i++){
            System.out.println("Hii");
            try{
            Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 1; i < 10; i++){
            System.out.println("Hello");
             try{
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
        
    }
}
