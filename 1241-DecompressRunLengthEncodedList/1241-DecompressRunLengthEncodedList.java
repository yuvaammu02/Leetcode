// Last updated: 12/08/2026, 11:57:49
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i += 2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j =0;j<freq;j++){
                list.add(val);
            }
        }
        int[] arr = new int[list.size()];
        for(int i =0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}