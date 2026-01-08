package org.jan05;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc  = new  Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;
        }catch(ArithmeticException e){
            System.out.println("Error Arithmetic");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
//        finally{
//            System.out.println("Bye");
//        }
        finally{
            System.out.println("Bye");
        }
    }
}
