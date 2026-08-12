// Last updated: 12/08/2026, 12:03:14
class Solution {
    public String longestWord(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });
        for (String word : words) {
            boolean canBuild = true;
            for (int i = 1; i < word.length(); i++) {
                if (!wordSet.contains(word.substring(0, i))) {
                    canBuild = false;
                    break;
                }
            }
            if (canBuild) return word;
        }
        return "";
    }
}