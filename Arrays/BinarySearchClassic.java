/*
Binary Search, 
Time Complexity
    Average Case: O(log N) [1]
    Worst Case: O(log N) [1]
    Best Case: O(1) (If the target is the middle element on the first check)
Space Complexity: O(1)
*/
public class BinarySearchClassic {
    public static boolean binarySearch(int[] arr, int tar) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == tar) {
                return true;
            } else if (arr[mid] < tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearch(arr, 5));
    }
}