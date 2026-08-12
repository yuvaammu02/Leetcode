// Last updated: 12/08/2026, 12:24:23
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] arr = new int[n+m];
        for(int i = n-1;i>=0;i--){
            for(int j = m-1;j>=0;j--){
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int p = digit1 * digit2;
                int p1 = i+j;
                int p2 = i+j+1;
                int s = p + arr[p2];
                arr[p2] = s%10;
                arr[p1] += s/10; 
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int num : arr){
        if(!(ans.length() == 0 && num == 0)){
            ans.append(num);
        }
        }
        return ans.toString();
    }
}