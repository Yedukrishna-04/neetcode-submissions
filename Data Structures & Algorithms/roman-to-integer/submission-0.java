class Solution {
    public int romanToInt(String s) {

        //hashmap to map roman symbols to their values
        Map<Character, Integer> roman =  new HashMap<>();
        
        // key -> roman symbols
        // value -> their values
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 100);
        
        //result variable decalre with initial value as 0
        int result;
        result = 0;

        //for loop that traverses trough the string
        for(int i = 0; i < s.length(); i ++){
            //  Chek Condition
            /*1.if there is a character after the current roman symbol character
              2. value of the current roman symbol character is less than value of next roman
                symbol charcater in the string.
            */
            if(i+1 < s.length() && roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
                    /*if both condition are true then
                    update result variable by subtracting current reult value with value of current
                    roman symbol character */  
                    result = result - roman.get(s.charAt(i));
            }else{
                // if not then add the value of current roman symbol character into the current result 
                result = result + roman.get(s.charAt(i));
            }
        }
        //return the final result
        return result;
        
    }
}