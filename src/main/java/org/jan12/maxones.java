package org.jan12;

public class maxones {
    public static void main(String[] args){
        // code here
        int[][] arr = {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};
        int count = 0;
        int index = -1;

        for(int i = 0;i<arr.length;i++){
            int temp = 0;
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    temp++;
                }
            }
            if(temp>count){
                count = temp;
                index = i;
            }
        }
        System.out.println(index);
    }
}
