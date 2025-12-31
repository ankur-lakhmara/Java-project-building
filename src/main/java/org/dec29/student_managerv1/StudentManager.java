package org.dec29.student_managerv1;

import java.util.ArrayList;

public class StudentManager {
//    Student[] students = new Student[10];
    ArrayList<Student> students = new ArrayList<Student>();

    int count = 0;

    public Student getStudentByID(int id){
        for(int i = 0;i<students.size();i++){
            if(students.get(i).getId() == id){
                System.out.println(students.get(i).getName());
                return students.get(i);
            }
        }
        System.out.println("Student not found");
        return null;
    }

    public Student getStudentByName(String name){
        for(int i =0;i<students.size();i++){
            if(students.get(i).getName().equals(name)){
                return students.get(i);
            }
        }
        return null;
    }


    public Student getAllStudents(){
        for(int i = 0;i<students.size();i++){
           return students.get(i);
        }
        return null;
    };

    public boolean addStudent(int id,String name, int className){
        for(Student s: students){
            if(s.getId() == id){
                return false;
            }
        }
        Student student  = new Student(id,name,className);
        students.add(student);
//        System.out.println("Student "+id+" added");
//        System.out.println(count);
        return true;
    }
}
