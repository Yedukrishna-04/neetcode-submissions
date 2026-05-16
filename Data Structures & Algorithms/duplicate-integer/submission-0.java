// Contains Duplicate
/*Given an integer array nums, 
return true if any value appears more than once in the array, 
otherwise return false.*/
class Solution {
    public boolean hasDuplicate(int[] nums) {
       //Create hashmap
       Map<Integer, Integer> map = new HashMap<>();

       //Create for loop that traverse through array
       for(int i = 0; i < nums.length; i++){

        //Check if the map already contains the key
        if(map.containsKey(nums[i])){
            // return true if yes
            return true;
        }

        //Use .put() to store
        //Key -> element
        //Value -> index of element
        map.put(nums[i], i);
       }

       return false;

    }
}