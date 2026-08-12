// Last updated: 12/08/2026, 11:50:47
class Solution {
    public int minOperations(String s1, String s2) {
      int n = s1.length();
        int total = 0;
        List<Integer> excess = new ArrayList<>();
        for(int i =0;i<n;i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 == '0' && c2 == '1'){
                total++;
            } else if(c1 == '1' && c2 == '0'){
                excess.add(i);
            }
        }
        if(excess.isEmpty()){
            return total;
        }
        if(n < 2) {
            return -1;
        }
        int pairs = 0;
        int i =0;
        while(i < excess.size()-1){
            if(excess.get(i+1) == excess.get(i)+1){
                pairs++;
                i += 2;
            }
            else{
                i++;
            }
        }
        int excesscost = 2 *excess.size() - 3 * pairs;
        return total + excesscost;
    }
}