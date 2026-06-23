class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for(int i = 0; i < students.length; i++){
            count[students[i]]++;
        }
        for(int i = 0; i < sandwiches.length ;i++){
            int sandwichType = sandwiches[i];
            if(count[sandwichType] == 0){
                return sandwiches.length - i;
            }

            count[sandwichType]--;
        }

    return 0;
    }
}