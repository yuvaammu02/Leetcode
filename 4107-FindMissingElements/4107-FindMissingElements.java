// Last updated: 12/08/2026, 11:51:18
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = min+1;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}