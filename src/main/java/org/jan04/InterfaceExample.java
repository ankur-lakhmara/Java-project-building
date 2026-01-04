/*package org.jan04;

abstract class Computer{
    public abstract void code();
}
class Laptop extends Computer{
   public void code(){
        System.out.println("Coding with Laptop");
    }
}
class Desktop extends Computer{
  public void code(){
        System.out.println("Coding with Desktop");
    }
}
class Developer{
    public void devApp(Computer computer){
        computer.code();
    }
}
public class InterfaceExample {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer  desk = new Desktop();
        Developer ankur = new Developer();
        ankur.devApp(lap);
//        ankur.devApp(desk);
    }
}
*/

//--------------------------above code is the without interface and with abstract keyword.. below is with interface and we dont need the abstract keyword with interface


package org.jan04;

interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding with Laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding with Desktop");
    }
}
class Developer{
    public void devApp(Computer computer){
        computer.code();
    }
}
public class InterfaceExample {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer  desk = new Desktop();
        Developer ankur = new Developer();
        ankur.devApp(lap);
//        ankur.devApp(desk);
    }
}
