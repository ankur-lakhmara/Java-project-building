package org.feb11;

public class Longest_Common_Prefix_of_Strings {
    static void main(String[] args) {
        String arr[] =  {"geeksforgeeks", "geeks", "geek", "geezer"};
        String first = arr[0];
        StringBuilder str = new StringBuilder();
        for (int i = 0;i<first.length();i++){
            char ch = first.charAt(i);
            for(int j = 1;j<arr.length;j++){
                if(i>= arr[j].length() || arr[j].charAt(i) != ch){
                    System.out.println(str.toString());
                    return;
                }
            }
            str.append(ch);
        }
        System.out.println(str.toString());
        return;
    }
}
