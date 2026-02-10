package org.jan21;

public class FloorInSortedArray {
    static void main(String[] args) {

       int arr[] = {8,18, 26, 28, 32, 35, 37, 38, 42, 47, 49, 51, 51, 67, 80};
       int x = 80;
        int index = -1;
        int max = arr[0];
        int i = 0;
        if(arr.length == 1){
            if(arr[0]<=x){
                index = 0;
            }
            System.out.println(index);
            return;
        }
        while(i<arr.length && arr[i]<=x){
            max = arr[i];
            index = i;
            i++;
        }
        System.out.println(index);
//        return index;
    }
}
