class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        // HashMap stores:
        // key   -> number in array
        // value -> index position of that number
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        // First for loop:
        // Traverse the array and store every element with its index
        // using map.put(nums[i], i)
        // Example:
        // nums = [2,7,11,15]
        //
        // HashMap after loop:
        // 2  -> 0
        // 7  -> 1
        // 11 -> 2
        // 15 -> 3
        for(int i = 0; i < nums.length; i ++){
        // Second for loop:
        // Traverse the array again and calculate the difference
        // needed to reach the target.
            int diff;
            diff = target - nums[i];
            // Formula:
            // diff = target - nums[i]
            //
            // Example:
            // target = 9
            // nums[i] = 2
            // diff = 7
            //
            // Meaning:
            // "We already have 2, now we need 7 to make 9"

            if(map.containsKey(diff) && map.get(diff) != i){
            // IF condition has 2 checks:
            // 1. map.containsKey(diff)
            //
            // Checks whether the required number exists in the HashMap.
            //
            // Example:
            // map.containsKey(7)
            //
            // Returns true if 7 exists.


            // 2. map.get(diff) != i
            //
            // map.get(diff) gives the index position
            // of the required number.
            //
            // This condition makes sure we are NOT using
            // the same element twice.
            //
            // Example:
            // nums = [3,3]
            // target = 6
            //
            // At i = 0:
            // diff = 3
            //
            // map.get(3) = 1
            //
            // Check:
            // 1 != 0
            //
            // Valid pair found.
                return new int[] {i, map.get(diff)};
                // If both conditions are true:
                //
                // return new int[]{i, map.get(diff)};
                //
                // Return:
                // current index +
                // index of required number
                //
                // Example:
                // return {0,1}
            }
        }
        return new int[0];
    }
}
