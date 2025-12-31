package org.dec29.student_managerv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Student Manager");
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager  = new StudentManager();

        //adding student controller
        System.out.println("Enter Student id");
        int id = sc.nextInt();
        System.out.println("Enter student name");
        String name = sc.next();
        System.out.println("Enter student class name");
        String className = sc.next();
        try{
            boolean success = studentManager.addStudent(id,name,className);
            if(success){
                System.out.println("Student added successfully");
            }else{
                System.out.println("Student with same id already exist");
            }
        }catch(Exception e){
            System.out.println("Internal server error");
        }

        System.out.println("all students");
        for(Student s : studentManager.getAllStudents()){
            System.out.print(s);
        }

        //delete student controller
        System.out.println("Enter the student id you would like to delete");
        int dId = sc.nextInt();
        try{
            boolean success = studentManager.deleteStudent(dId);
            if(success){
                System.out.println("Student deleted successfully");
            }else{
                System.out.println("Student with this id not found");
            }
        }catch(Exception e){
            System.out.println("internal server error"+e.getMessage());
        }

        //find student by id controlller
        System.out.println("enter student id you would like to search");
        int searchId = sc.nextInt();
        try{
            Student success = studentManager.getStudentById(searchId);
            if (success != null) {
                System.out.println("Student found successfully"+success);
            }else{
                System.out.println("Student with this id not found");
            }
        }catch(Exception e ){
            System.out.println("internal server error"+e.getMessage());
        }

        //find student by name
        System.out.println("enter student name you would like to search");
        String searchedName = sc.nextLine();
        try{
            Student success = studentManager.getStudentByName(searchedName);
            if(success != null){
                System.out.println("Student with name "+searchedName+" found successfully"+success);
            }
            else{
                System.out.println("Student with this name not found");
            }
        }catch(Exception e){
            System.out.println("internal server error"+e.getMessage());
        }
        sc.close();

    }
}
