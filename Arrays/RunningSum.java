/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
*/
public class RunningSum {
    public static int[] runningSum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4}; // 1,3,6,10
        // int[] arr = {1,1,1,1,1}; // 1,2,3,4,5
        int[] arr = {3,1,2,10,1}; // 3, 4, 6, 16, 17
        
        runningSum(arr);
        for (int i : arr) {
            System.out.print(i+", ");
        }
    }
}
