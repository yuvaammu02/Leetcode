// Last updated: 12/08/2026, 11:57:16
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> loss=new HashMap<>();
        for(int[] match:matches){
            loss.putIfAbsent(match[0],0);
            loss.put(match[1],loss.getOrDefault(match[1],0)+1);
        }
        List<Integer> zero=new ArrayList<>();
        List<Integer> one=new ArrayList<>();
        for(int player:loss.keySet()){
            if(loss.get(player)==0)zero.add(player);
            else if(loss.get(player)==1)one.add(player);
        }
        Collections.sort(zero);
        Collections.sort(one);
        return Arrays.asList(zero,one);
    }
}