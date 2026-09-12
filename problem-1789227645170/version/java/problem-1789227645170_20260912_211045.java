// Last updated: 12/09/2026, 21:10:45
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Map<Integer,List<Integer>> map = new HashMap<>();
4        for(int i =0;i<nums.length;i++){
5           map.putIfAbsent(nums[i],new ArrayList<>());
6            map.get(nums[i]).add(i);
7        }
8        int c =0;
9        for(Map.Entry<Integer,List<Integer>> en : map.entrySet()){
10            List<Integer> in = en.getValue();
11            if(in.size()<3){
12                continue;
13            }
14            int t = in.get(1)-in.get(0);
15            boolean f = true;
16            for(int i =2;i<in.size();i++){
17                if(in.get(i) - in.get(i-1) != t){
18                    f = false;
19                    break;
20                }
21            }
22            if(f){
23                c++;
24            }
25        }
26        return c;
27    }
28}