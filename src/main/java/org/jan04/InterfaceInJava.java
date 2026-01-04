package org.jan04;

interface testInterface{
    final int a = 10;
//    void display();
}

class testClass implements testInterface{

    //implementing the capabilities of interface ...
    public void display(){
        System.out.println("ANkur");
    }
}

public class InterfaceInJava {
    public static void main(String[] args){
        testClass t1 = new testClass();
        t1.display();
        System.out.println(t1.a);
    }
}
