// Last updated: 12/08/2026, 12:01:53
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}