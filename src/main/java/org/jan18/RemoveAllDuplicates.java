package org.jan18;

import java.util.HashSet;

public class RemoveAllDuplicates {
    static void main(String[] args) {
        String s = "aabbdcdd";
        HashSet<Character> set = new HashSet<>();
        StringBuilder n = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(set.add(s.charAt(i))){
                n.append(s.charAt(i));
            }
        }
        System.out.println(n);
    }
}



/*Remove All Duplicates (keep first occurrence)

"aabbcdd" → "abcd"
s
 */