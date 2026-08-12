// Last updated: 12/08/2026, 11:53:20
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int limit=nums1.length/2;
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int x:nums1)set1.add(x);
        for(int x:nums2)set2.add(x);
        int only1=0,only2=0,common=0;
        for(int x:set1){
            if(set2.contains(x))common++;
            else only1++;
        }
        for(int x:set2){
            if(!set1.contains(x))only2++;
        }
        int take1=Math.min(only1,limit);
        int take2=Math.min(only2,limit);
        int remain1=limit-take1;
        int remain2=limit-take2;
        int takeCommon=Math.min(common,remain1+remain2);
        return take1+take2+takeCommon;
    }
}