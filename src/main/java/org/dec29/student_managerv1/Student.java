package org.dec29.student_managerv1;

public class Student {
    private int id;
    private String name;
    private int className;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public Student(int id, String name, int className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    @Override
    public String toString(){
        return "Student{id=" + id + ", name='" + name + "', class=" + className + "}";
    }
}
