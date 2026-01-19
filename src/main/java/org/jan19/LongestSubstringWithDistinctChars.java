package org.jan19;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithDistinctChars {
    public int LongestString(String s){
        int n = s.length();
        String[][] arr = new String[n][n];
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                arr[i][j-1] = s.substring(i,j);
            }
        }
    int max = 0;
        for (int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] != null){
                    HashSet<Character> set = new HashSet<>();
                    int temp  = 0;
                    for(int k = 0;k<arr[i][j].length();k++){
                        if(set.add(arr[i][j].charAt(k))){
                            temp++;
                        }
                        else{
                            break;
                        }
                    }
                    max = Math.max(max, temp);
                }
            }
        }
        System.out.println("max is :" +max);
        return max;
    }

    static void main(String[] args) {
    LongestSubstringWithDistinctChars l1 = new LongestSubstringWithDistinctChars();
    String str = "geeksforgeeks";
    l1.LongestString(str);
    }
}

