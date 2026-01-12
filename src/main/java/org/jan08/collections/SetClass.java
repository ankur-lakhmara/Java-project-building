package org.jan08.collections;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {

        Set<Integer> myset = new HashSet<Integer>();
        for(int i = 10;i>0;i--){
            myset.add(i);
        }
        for(int i = 6;i<15;i++){
            myset.add(i);
        }
        System.out.println(myset);

        System.out.println(myset.contains(45));
    }
}
