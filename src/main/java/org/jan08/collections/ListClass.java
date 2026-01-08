package org.jan08.collections;

import java.util.List;
import java.util.ArrayList;
public class ListClass {
    public static void main(String []args){
        List<Integer> list =  new ArrayList<Integer>();
    //adding element to the list
        for(int i=0;i<10;i++){
            list.add(i);
        }
        //printing the elements of list
        System.out.println("Initial list "+ list);

        //remove the element from the list at specific index
        list.remove(2);
        System.out.println("after removing index 2"+list);

        //getting the element one by one...
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
