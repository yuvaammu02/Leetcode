// Last updated: 12/08/2026, 12:02:36
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char letter:letters){
            if(letter > target){
                return letter;
            }
        }return letters[0];
    }
}