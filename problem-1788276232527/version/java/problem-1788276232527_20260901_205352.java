// Last updated: 01/09/2026, 20:53:52
1class Solution {
2    public String[] largestString(int[] nums) {
3        int n = nums.length;
4        String[] res = new String[n];
5        for(int i =0;i<n;i++){
6            int x = nums[i];
7            StringBuilder sb = new StringBuilder();
8            int zvalue = 1 << 25;
9            int numz = x/zvalue;
10            for(int j =0;j<numz;j++){
11                sb.append('z');
12            }
13            int rem = x % zvalue;
14            for(int bit = 24;bit >=0;bit--){
15                if(((rem >> bit) & 1) == 1){
16                    sb.append((char) ('a' + bit));
17                }
18            }
19            res[i] = sb.toString();
20        }
21        return res;
22    }
23}