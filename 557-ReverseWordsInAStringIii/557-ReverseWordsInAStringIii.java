// Last updated: 12/08/2026, 12:06:18
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String s1 : words){
            res.append(new StringBuilder(s1).reverse()).append(" ");
        }
        return res.toString().trim();
    }
}