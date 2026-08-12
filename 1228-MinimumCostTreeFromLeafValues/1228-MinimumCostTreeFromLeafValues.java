// Last updated: 12/08/2026, 11:58:08
class Solution {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int ans = 0;
        for(int num : arr){
            while(stack.peek() <= num){
                int mid = stack.pop();
                ans += mid * Math.min(stack.peek(),num);
            }
            stack.push(num);
        }
        while(stack.size() > 2){
            ans += stack.pop() * stack.peek();
        }
        return ans;
    }
}