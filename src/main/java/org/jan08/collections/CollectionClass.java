package org.jan08.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionClass {
    public static void main(String[]args){

        //collection usage
        Collection<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
//        nums.add("asd");// because of this this will throw an error of format exception becasue we are trying an arithmatic operation and trying to parse the string into integer.... to resolve this we need to specify the TYPE of data Integer, String , etc

        for(Object o:nums){
            String str = o.toString();
            System.out.println(Integer.parseInt(str)*2); // return object but after that we are parsing it to integer
        }
        System.out.println(nums); //return array


    }
}
