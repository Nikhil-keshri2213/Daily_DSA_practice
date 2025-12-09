import java.util.HashMap;
/*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    concept: Strings, HashMap
*/

public class ValidAnagram{
    public static boolean validAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(char c : s.toCharArray())
        { 
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }
        // for (Character c : map.keySet()) {
        //     System.out.println(c + " "+ map.get(c));
        // }
        for(char c : t.toCharArray()){
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        // String s = "anagram"; 
        // String t = "nagaram" ;

        String s = "car"; 
        String t = "rat" ;

        boolean res = validAnagram(s, t);
        System.out.println(res);
    }
}