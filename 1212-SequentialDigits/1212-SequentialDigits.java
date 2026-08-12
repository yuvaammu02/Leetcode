// Last updated: 12/08/2026, 11:58:14
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String di = "123456789";
        for(int len = String.valueOf(low).length();len <= String.valueOf(high).length();len++){
            for(int s =0;s+len <=9;s++){
                int n = Integer.parseInt(di.substring(s,s+len));
            if(n >= low && n <=high){
                ans.add(n);
            }
        }
    }
    return ans;
}
}