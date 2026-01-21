package org.jan19;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithDistinctChars {
    public int LongestStringBruitForce(String s){
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

    public int LongestStringOptimized(String s){
        int L = 0; int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int R = 0;R<s.length();R++){
            char ch = s.charAt(R);
            map.put(ch,map.getOrDefault(s.charAt(R),0)+1);

            while(map.get(ch)>1){
                char leftChar = s.charAt(L);
                map.put(leftChar,map.get(leftChar)-1);
                L++;
            }
            max  = Math.max(max,R-L+1);
        }
        System.out.println(max);
        return max;
    }

    static void main(String[] args) {
    LongestSubstringWithDistinctChars l1 = new LongestSubstringWithDistinctChars();
    String str = "geeksforgeeks";
    l1.LongestStringOptimized(str);
    }
}

