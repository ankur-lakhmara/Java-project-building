package org.jan18;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    static void main(String[] args) {
        String s ="aabbcdde";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0;i<s.length();i++){
           Integer a =  map.get(s.charAt(i));
            if(a == 1){
                System.out.println("first non repeating char is "+s.charAt(i));
                return;
            }
        }
        System.out.println("-1");
        return;
//        System.out.println(map);
    }
}




/*Question :
Problem meaning (only essentials):

You are given a string.

You must find the first character (from left to right) that:

Appears exactly once in the entire string.

If no such character exists, the answer is usually -1 or empty.

Key points:
- Order matters.
- Frequency matters.
“First” means smallest index, not alphabetical.
Example:    "aabbcdde"

Frequencies:

a=2, b=2, c=1, d=2, e=1

Scan from left:

a ❌
b ❌
c ✅ → answer*/