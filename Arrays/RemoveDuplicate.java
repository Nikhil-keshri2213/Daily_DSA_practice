/*
Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same.
Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, 
return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. 
The remaining elements beyond index k - 1 can be ignored.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

Concept: Array, Two Pointers
*/

public class RemoveDuplicate {
    public void removeDuplicate(int[] arr) {
        int k = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[k] = arr[i];
                k++;
            }
        }
        arr[k] = arr[arr.length - 1];
        k++;
        System.out.println("Number of unique elements are: " + k);
        System.out.print("The unique elements are: ");
        for(int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicate rd = new RemoveDuplicate();
        rd.removeDuplicate(arr);
    }
}
