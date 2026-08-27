// Last updated: 27/08/2026, 10:18:11
class Solution {
    public int maximumGap(String skill, String station) {
        int n = skill.length();
        int m = station.length();
        if(n == 1){
            return 0;
        }
        int[] l = new int[n];
        int[] r = new int[n];
        int s =0;
        for(int i =0;i<n;i++){
            while(s < m && station.charAt(s) != skill.charAt(i)){
                s++;
            }
            l[i]   = s;
            s++;
        }
        s = m-1;
        for(int i = n-1;i>=0;i--){
            while(s >=0 && station.charAt(s) != skill.charAt(i)){
                s--;
            }
            r[i] = s;
            s--;
        }
        int ma = 0;
        for(int i = 1;i<n;i++){
            ma = Math.max(ma,r[i]- l[i-1]);
        }
        return ma;
    }
}