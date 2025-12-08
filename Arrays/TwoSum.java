/*
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

You can return the answer in any order.

Concept: Array and Hashing
*/

public class TwoSum{
    
    public void twoSum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Indices are: " + i + " and " + j);
                }
                else{
                    System.out.println("No such indices found");
                }
            }
        }
    }    
    public static void main(String arg[]){
        
        //Case1 - true
        // int arr[] = {3,2,4};
        // int target = 6;
        //Case2 - true
        // int arr[] = {2,7,11,15}; 
        // int target = 9;
        //Case3 - false
        int arr[] = {4,1};
        int target = 4;
        
        TwoSum ts = new TwoSum();
        ts.twoSum(arr, target);
    }
}