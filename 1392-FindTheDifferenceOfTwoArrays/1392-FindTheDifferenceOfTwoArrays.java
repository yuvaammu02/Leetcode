// Last updated: 12/08/2026, 11:57:05
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }
        for(int s1 : set1){
            if(!set2.contains(s1)){
                answer.get(0).add(s1);
            }
        }
         for(int s1 : set2){
            if(!set1.contains(s1)){
                answer.get(1).add(s1);
            }
        }
        return answer;
        
    }
}