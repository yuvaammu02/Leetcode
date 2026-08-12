// Last updated: 12/08/2026, 11:54:42
class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        for(String word : words){
            for (char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
        }
        int n = words.length;
        for(int i =0;i<26;i++){
            if(freq[i]%n !=0){
                return false;
            }
        }
        return true;
    }
}