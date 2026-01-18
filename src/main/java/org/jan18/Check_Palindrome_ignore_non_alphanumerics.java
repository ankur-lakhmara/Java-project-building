package org.jan18;

public class Check_Palindrome_ignore_non_alphanumerics {
    static void main(String[] args) {
//        String s ="Abc 012..## 10cbA";
        String s ="Too hot to hoot";
        StringBuilder removedAplhs = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(removedAplhs);
        String safe = removedAplhs.toString().toLowerCase();
        StringBuilder str = new StringBuilder();
        removedAplhs =
        str = new StringBuilder(removedAplhs).reverse();
        System.out.println(str);
        if (str.toString().toLowerCase().equals(safe)){
            System.out.println("panindrom");
        }else {
            System.out.println("not");
        }
    }
}
