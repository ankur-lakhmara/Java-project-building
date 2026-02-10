package org.jan21.recursion;

public class recursion1 {
    static void main(String[] args) {
    printN(20);
    }
    public static void printN(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printN(n-1);
    }
}
