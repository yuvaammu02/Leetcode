// Last updated: 12/08/2026, 11:53:31
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {

        int count = 0;
        boolean[] used = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {

            if (used[i]) continue;

            for (int j = i + 1; j < words.length; j++) {

                if (used[j]) continue;

                String rev = new StringBuilder(words[j])
                                .reverse()
                                .toString();

                if (words[i].equals(rev)) {
                    count++;

                    used[i] = true;
                    used[j] = true;

                    break;
                }
            }
        }

        return count;
    }
}