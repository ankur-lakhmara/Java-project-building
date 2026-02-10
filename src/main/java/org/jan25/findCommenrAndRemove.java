package org.jan25;

import java.util.HashSet;
import java.util.Set;

public class findCommenrAndRemove {
    static void main(String[] args) {
        String s1 = "aacdb";
        String s2 = "gafd";
        Set<Character> set1 = new HashSet<>();
        Set<Character>set2 = new HashSet<>();
        for(int i = 0;i<s1.length();i++){
            set1.add(s1.charAt(i));
        }
        for(int i = 0;i<s2.length();i++){
            set2.add(s2.charAt(i));
        }
        StringBuilder result = new StringBuilder();

        for(int i = 0;i<s1.length();i++){
            if(!set2.contains(s1.charAt(i))){
                result.append(s1.charAt(i));
            }
        }

        for(int i = 0;i<s2.length();i++){
            if(!set1.contains(s2.charAt(i))){
                result.append(s2.charAt(i));
            }
        }

        System.out.println(result);

    }
}
