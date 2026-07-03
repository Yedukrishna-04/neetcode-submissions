class Solution {
    public void reverseString(char[] s) {
        /*
        we create  a while loop where as long as index of  left is smaller than index of right
        we swap using a temp variable where
        left poninter value is given to temp vairable and then 
        we copy value of right pointer to left
        and value in temp variable is copied to right pointer
        after that we increment the left and decrement the right
        */
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp;
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        
    }
}