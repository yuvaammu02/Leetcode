// Last updated: 27/09/2026, 18:09:17
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int b =0;
4        Map<Long,Integer> p = new HashMap<>();
5        for(int i =0;i<nums.length-1;i++){
6            if(nums[i] == nums[i+1]){
7                b++;
8            }
9            else{
10                long min = Math.min(nums[i],nums[i+1]);
11                long max = Math.max(nums[i],nums[i+1]);
12                long k = (min << 32) | max;
13            p.put(k,p.getOrDefault(k,0)+1);
14                }
15        }
16        int m =0;
17        for(int c : p.values()){
18            m = Math.max(m,c);
19        }
20        return b + m;
21    }
22}