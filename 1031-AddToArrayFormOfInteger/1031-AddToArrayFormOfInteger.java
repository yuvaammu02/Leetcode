// Last updated: 12/08/2026, 11:59:39
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0; 
        while (i >= 0 || k > 0 || carry > 0) {
            int digit1 = (i >= 0) ? num[i] : 0; 
            int digit2 = k % 10; 
            int sum = digit1 + digit2 + carry; 
            ans.add(sum % 10);
            carry = sum / 10;
            i--;
            k /= 10;
        }
        Collections.reverse(ans); 
        return ans;
    }
}