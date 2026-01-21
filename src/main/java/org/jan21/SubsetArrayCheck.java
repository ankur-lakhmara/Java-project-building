package org.jan21;

import java.util.HashMap;

public class SubsetArrayCheck {
    public static void main(String[] args) {
       int a[] = {8,4,5,3, 1, 7, 9}, b[] = {5 ,1, 3, 7, 9};

       if(a.length<b.length){
           System.out.println("false");
           return;
       }
        HashMap<Integer,Integer> mapA = new HashMap<>();
        HashMap<Integer,Integer> mapB = new HashMap<>();
        for(int i = 0;i<a.length;i++){
            mapA.put(a[i],mapA.getOrDefault(a[i],0)+1);
        }
        for(int i = 0;i<b.length;i++){
            mapB.put(b[i],mapB.getOrDefault(b[i],0)+1);
        }
        System.out.println(mapA);
        System.out.println(mapB);

        for(int i = 0;i<b.length;i++){
           int valueInB =  mapB.get(b[i]);
           int valueInA = mapA.getOrDefault(b[i],0);
           if( valueInA<valueInB){
               System.out.println("not subset");
               return;
           }
        }
        System.out.println("Subset");
        return;
    }
}
