package org.jan17.StringFundamentals;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    static void main(String[] args) {
        String s1 = "listenn";
        String s2 = "silenpt";
        if(s1.length() != s2.length()){
            System.out.println("not anagram");
            return;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0;i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
//        System.out.println(map1);
//        System.out.println(map2);
        if(map1.size() != map2.size()){
            System.out.println("Not anagram");
            return;
        }
        for(Map.Entry<Character,Integer> entry: map1.entrySet()){
            Character key = entry.getKey();
            Integer freq1 = entry.getValue();

            if(map2.containsKey(key)){
                int freq2 = map2.get(key);
                if(freq2 != freq1){
                    System.out.println("not anagram");
                    return;
                }
            }
        }
        System.out.println("anagram");
    }
}
