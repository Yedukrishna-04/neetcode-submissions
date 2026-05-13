class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = "";
        for(int i = s.length() - 1; i>=0; i--){
            reverse += s.charAt(i);
        }
        return reverse.equalsIgnoreCase(s);
    }
}