/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Concept : HashMap, Two Pointer
*/

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionTwoArray {
    public static void intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i: arr1) {
            set.add(i);
        }
        for(int i: arr2){
            if(set.contains(i)){
                lst.add(i);
                set.remove(i);
            }
        }
        for (Integer i : lst) {
            System.out.print(i+",");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4};
        int[] arr2 = {1,3,5,6};
        intersection(arr1, arr2);
    }
}
