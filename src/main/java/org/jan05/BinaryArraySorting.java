package org.jan05;

public class BinaryArraySorting {
    public static void main(String[] args) {
        MyBinaryArraySorting bsa = new MyBinaryArraySorting();
        int[] arr ={1, 0, 1, 1, 0};
        bsa.binSort(arr);
    }
}

class MyBinaryArraySorting{
    public void binSort(int[] arr) {
        // code here
        for(int i = 0;i<arr.length;i++){
            int oneIndex = 0;
            if(arr[i] == 0 && arr[oneIndex]!=0){
                int temp = arr[i];
                arr[i] = arr[oneIndex];
                arr[oneIndex] = temp;
                oneIndex++;
            }
            else{
                continue;
            }
        }

        for(int j = 0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}