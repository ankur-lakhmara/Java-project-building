package org.dec28.warmup;

public class Student{
    public static void main(String[] args){
        Student s1 = new Student(5,"ANkur",56);
        System.out.println(s1.getId());
    }
    private int id;
    private String name;
    private int roll;

    public Student(int id, String name, int roll){
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }
}


