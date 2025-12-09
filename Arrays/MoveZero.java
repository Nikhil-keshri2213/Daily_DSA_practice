/*
Given an integer array nums, move all 0's to the end of it while maintaining the 
relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
Concept : Two Pointer, In-Place change.
*/

public class MoveZero {
    public static void moveZero(int arr[]){
        int left = 0;
        for(int right = 0; right<arr.length; right++){
            if(arr[right] !=0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }   
    }
    public static void main(String[] args) {
       int[] nums = {0,1,0,3,12};
       moveZero(nums);
       for (int i : nums) {
        System.out.print(i+", ");
       }
    }
}
