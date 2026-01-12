package org.jan09.readFile;

public class getSUm {
    public static void main(String[] args) {
        int arr[][] ={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        int result[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            result[i] = sum;
        }
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
