// Last updated: 01/09/2026, 20:45:58
1class Solution {
2    public int maxValidSplits(int[] nums) {
3        int n = nums.length;
4        int maxs =0;
5        maxs = Math.max(maxs,getScore(nums,-1));
6        for(int k =0;k<n;k++){
7            maxs = Math.max(maxs,getScore(nums,k));
8        }
9        return maxs;
10    }
11    private int getScore(int[] nums,int skipindex){
12        int n = nums.length;
13        int m = (skipindex == -1) ? n : n-1;
14        if(m <= 1) return 0;
15        int[] arr = new int[m];
16        int idx =0;
17        for(int i =0;i<n;i++){
18            if(i == skipindex) continue;
19            arr[idx++] = nums[i];
20        }
21        int[] pref = new int[m];
22        pref[0] = arr[0];
23        for(int i =1;i<m;i++){
24            pref[i] = gcd(pref[i-1],arr[i]);
25        }
26        int[] suff = new int[m];
27        suff[m-1] = arr[m-1];
28        for(int i = m-2;i>=0;i--){
29            suff[i] = gcd(suff[i+1],arr[i]);
30        }
31        int sc =0;
32        for(int i =0;i<m-1;i++){
33            if(pref[i] == suff[i+1]){
34                sc++;
35            }
36        }
37        return sc;
38    }
39    private int gcd(int a,int b){
40        while(b !=0){
41            int temp =b;
42            b = a%b;
43            a = temp;
44        }
45        return a;
46    }
47}