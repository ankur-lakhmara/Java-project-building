package org.dec29.student_managerv2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<Student>();
    public boolean addStudent(int id, String name, String className){
        for(Student student :students){
            if(student.getId() == id){
                return false;
            }
        }
        students.add(new Student(id,name,className));
        return true;
    }
    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public boolean deleteStudent(int id){
        for(Student student:students){
            if(student.getId()==id){
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    //search student by id service
    public Student getStudentById(int id){
        for(Student student: students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    //search student by name
    public Student getStudentByName(String name){
        for(Student student: students){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
}
