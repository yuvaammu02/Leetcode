// Last updated: 27/09/2026, 12:40:24
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        if(source.length != target.length){
4            return false;
5        }
6        int[] so = source;
7        long su =0;
8        long st =0;
9        for(int num : so){
10            su += num;
11        }
12        for(int num : target){
13            st += num;
14        }
15        return su == st;
16    }
17}