package org.feb11;

import java.util.Arrays;

public class Longest_Common_Prefix_of_Strings_Optimized {
    static void main(String[] args) {
        String arr[] =  {"geeksforgeeks", "geeks", "geek", "geezer"};

        //instead of solving with normal comparion iterations lets try to solve with sorting
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i<first.length() && i<last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
        System.out.println(first.substring(0,i));
        return;
    }
}
