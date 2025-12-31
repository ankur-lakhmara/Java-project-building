package org.dec29.student_managerv1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        StudentManager s1 = new StudentManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to add student?");
        boolean flag = true;
        while(flag){
            System.out.println("Enter Student ID");
            int id = sc.nextInt();
            System.out.println("Enter student name");
            String name = sc.next();
            System.out.println("Enter student class");
            int  className = sc.nextInt();
            s1.addStudent(id, name, className);
            System.out.println("Do you want to add another student y / n?");
            char choice = sc.next().charAt(0);
            if(choice == 'n'){
                flag = false;
            }
        }
        System.out.println("Student added successfully");
        System.out.println("Enter the name of student you want to search");
        String searchedName = sc.next();

        System.out.println("Student by name"+s1.getStudentByName(searchedName));
        s1.getAllStudents();
    }
}
