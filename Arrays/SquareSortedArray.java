/*
Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

Concept: Two Pointer
*/

import java.util.Arrays;

public class SquareSortedArray {
    public static void square(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        for(int i: arr){
            System.out.print(i+", ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        square(nums);
    }    
}
