package org.jan02.gfgTest;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 6;
                int left = 0;
                int right = arr.length-1;
                while(left<right){
                   int  mid = (left+right)/2;
                    if(arr[mid] == k){
                    System.out.println("found"+arr[mid]);
                        return;
                    }
                    else if(arr[mid]>k){
                        right = mid-1;
                    }
                    else{
                        left = mid+1;
                    }
                }
                System.out.println(arr[left]);
                System.out.println(arr[right]);
            }
        }

