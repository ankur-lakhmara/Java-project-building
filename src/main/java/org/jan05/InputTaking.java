package org.jan05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputTaking {
    public static void main(String[]args){
        System.out.println("asad");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            String str = br.readLine();
            int n = Integer.parseInt(str);
            System.out.println(n);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
