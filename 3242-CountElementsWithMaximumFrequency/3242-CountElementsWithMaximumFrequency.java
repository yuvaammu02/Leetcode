// Last updated: 12/08/2026, 11:53:15
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        int maxfreq =0;
        for(int count : freq){
            maxfreq = Math.max(maxfreq,count);
        }
        int ans =0;
        for(int count : freq){
            if(count == maxfreq){
                  ans += count;
            }
        }
        return ans;
    }
}