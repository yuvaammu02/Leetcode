// Last updated: 12/08/2026, 12:07:44
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[100010];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            res[nums2[i]] = stack.isEmpty() ? -1 :stack.peek();
            stack.push(nums2[i]);
        }
        for(int i =0;i<nums1.length;i++){
            nums1[i] = res[nums1[i]];
        }
        return nums1;
}
}