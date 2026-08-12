// Last updated: 12/08/2026, 11:55:19
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String str : word1){
            s1.append(str);
        }
        for(String str : word2){
            s2.append(str);
        }
        return s1.toString().equals(s2.toString());
    }
}