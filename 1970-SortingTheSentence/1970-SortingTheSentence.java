// Last updated: 12/08/2026, 11:54:46
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '0';
            result[position - 1] = word.substring(0, word.length() - 1);
        }
        StringBuilder ans = new StringBuilder();
        for (String word : result) {
            ans.append(word).append(" ");
        }
        return ans.toString().trim();
    }
}