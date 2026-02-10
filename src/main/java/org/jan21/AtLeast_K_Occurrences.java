package org.jan21;
import java.util.*;

public class AtLeast_K_Occurrences {
    public static void main(String[] args) {
        int[] arr = {1,7, 4, 3, 4, 8, 7};
        int k = 2;
        int number = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            int value = map.get(arr[i]);
            if(value>=k){
                number = arr[i];
                System.out.println(number);
                return;
        }
        }
        System.out.println(number);
        return;
    }
}
