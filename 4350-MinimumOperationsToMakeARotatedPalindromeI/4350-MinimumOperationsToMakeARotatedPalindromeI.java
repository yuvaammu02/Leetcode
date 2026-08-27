// Last updated: 27/08/2026, 10:17:42
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int m = Integer.MAX_VALUE;
        char[] arr = s.toCharArray();
        for(int k =0;k<n;k++){
            int c = 0;
            int l =0;
            int r = n-1;
            while(l < r){
                int c1 = arr[(l+k)%n];
                int c2 = arr[(r+k)%n];
                    int mi = Math.min((c2-c1+26)%26, (c1-c2+26)%26);
                c += mi;
                l++;
                r--;
            }
            m = Math.min(m,c+k);
        }
        return m;
    }
}