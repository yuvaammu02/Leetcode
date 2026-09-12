// Last updated: 12/09/2026, 21:03:28
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Map<Integer,List<Integer>> map = new HashMap<>();
4        for(int i =0;i<nums.length;i++){
5            map.putIfAbsent(nums[i],new ArrayList<>());
6            map.get(nums[i]).add(i);
7        }
8        int c =0;
9        for(List<Integer> i  :map.values()){
10            if(i.size() == 3){
11                int d1 = i.get(1)-i.get(0);
12                int d2 = i.get(2)-i.get(1);
13                if(d1 == d2){
14                    c++;
15                }
16            }
17        }
18        return c;
19    }
20}