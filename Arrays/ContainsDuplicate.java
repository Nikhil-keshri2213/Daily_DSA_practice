/*
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.
Concept: Hashset
*/

import java.util.HashSet;
public class ContainsDuplicate{
    public static boolean containsDuplicate(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            if(!set.contains(i)){
                set.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // int arr[] = {1,2,3,1,2}; //Test 1 true
        // int arr[] = {1,1,1,3,3,4,3,2,4,2}; //Test 2 true
        int arr[] = {1,2,3,4}; //Test 3 false

        System.out.println("Is Contains Duplicate: "+containsDuplicate(arr));
    }
}