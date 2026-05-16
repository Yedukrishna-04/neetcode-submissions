//Valid Anagram
/*
Given two strings s and t,
return true if the two strings are anagrams of each other,
otherwise return false.
An anagram is a string that contains the exact same characters as another string,
but the order of the characters can be different.
*/
class Solution {
    public boolean isAnagram(String s, String t) {

        // Check if the String are of Equal Length if not return false
        if(s.length() != t.length()){
            return false;
        }
        // create two hashmaps:
        //1.Hashmap to store characters of string s
        Map<Character, Integer> sCount = new HashMap<>();
        //1.Hashmap to store characters of string t
        Map<Character, Integer> tCount = new HashMap<>();

        // Traverse through both strings
        for(int i = 0; i < s.length(); i++){
            // key   -> character
            // value -> frequency/count of character
            // Add/update frequency of character from string s
            //
            // getOrDefault():
            // If character exists -> return current frequency
            // Else -> return default value 0
            //
            // +1 increases the frequency count
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }

            return sCount.equals(tCount);

        
    }     
}
