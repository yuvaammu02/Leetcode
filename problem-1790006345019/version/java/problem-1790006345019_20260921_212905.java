// Last updated: 21/09/2026, 21:29:05
1class Solution {
2    public long maxValue(int[] nums) {
3        int n = nums.length;
4        long b =0;
5        for(int i =0;i<n;i++){
6            if(i%2 ==0){
7                b += nums[i];
8            }
9            else{
10                b -= nums[i];
11            }
12        }
13        long me = Long.MIN_VALUE/2;
14            long mo = Long.MIN_VALUE/2;
15        long mg = 0;
16        for(int i =0;i<n;i++){
17            long c = (i%2 ==0)? -2L * nums[i] : 2L * nums[i];
18            long ne = mo + c;
19            long no = Math.max(c,me+c);
20            me = ne;
21            mo = no;
22            mg = Math.max(mg,me);
23        }
24        return b + mg;
25    }
26}