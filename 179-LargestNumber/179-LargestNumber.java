// Last updated: 12/08/2026, 12:17:58
class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i =0;i<nums.length;i++){
             s[i] = String.valueOf(nums[i]);
        }
         for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if ((s[j] + s[i]).compareTo(s[i] + s[j]) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        if (s[0].equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String str : s) {
            result.append(str);
        }

        return result.toString();
    }
}
        