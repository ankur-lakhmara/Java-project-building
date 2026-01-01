package org.jan01.learningAbstract;

public class Main {
    public static void main(String[]args){
//        Car car = new WagonR(); // when we make the WagonR class abstract then it will show an error becasye we can't createthe object of an abstract class
        Car car = new updatedWagonR();
        car.playMusic();
        car.drive();
    }
}
//important point is :we can't create object of an abstract class...
// in order to access the created method of abstract class we need to create normal class and inherit that abstract class
abstract class Car {
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing music");
    }
}
abstract class WagonR extends Car {
    public void drive(){
        System.out.println("WagonR driving");
    }
}
class updatedWagonR extends WagonR {
    public void playMusic(){
        System.out.println("Helllllll");
    }
}

//Abstract classes provide a base with shared code (methods) and a contract for subclasses to implement specific functionality.
//Abstract methods enforce that subclasses must implement them, which allows for consistent method signatures across different subclasses.
